
package reino_programacao.Exceptions;

/**
 *
 * @author kstan
 */
public class NivelBaixoException extends Exception {
    
    public NivelBaixoException(){
         super("Apenas personagem de nível superior a 10 podem duela na \"Arena dos Fortes\"");
    }
    
}
