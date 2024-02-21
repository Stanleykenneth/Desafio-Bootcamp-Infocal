
package reino_programacao.Exceptions;

/**
 *
 * @author kstan
 */
public class UltimoRespiroException extends Exception {
     
    public UltimoRespiroException() {
        
        super("Este personagem está com menos de 50 de vida. \nCUIDADO! \nSe ele lutar novamente, morrerá.");
    }
}
