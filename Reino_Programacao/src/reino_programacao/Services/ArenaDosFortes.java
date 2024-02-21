package reino_programacao.Services;

import reino_programacao.Exceptions.NivelBaixoException;
import reino_programacao.Entities.Personagens;
import reino_programacao.Exceptions.UltimoRespiroException;

/**
 *
 * @author kstan
 */
public class ArenaDosFortes{
    
    public static void duelar(Personagens personagem) throws NivelBaixoException, UltimoRespiroException {
        if (personagem.getNivel() < 10) {
            throw new NivelBaixoException();
        }
        
        if (personagem.getVida() < 50) {
            throw new UltimoRespiroException();
        }
        
        // Se o personagem passou pelas verificações, ele pode duelar na Arena dos Fortes
        System.out.println(personagem.getNome() + " está pronto para o duelo na Arena dos Fortes!");
    }
}
