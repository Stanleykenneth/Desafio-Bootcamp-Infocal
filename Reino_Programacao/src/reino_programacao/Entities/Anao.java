
package reino_programacao.Entities;

import reino_programacao.Interfaces.Lutador;

/**
 *
 * @author kstan
 */
public class Anao extends Personagens implements Lutador{
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Anao(String nome) {
        super(nome);
        setVida(1800);
        setForca(10);
        setMagia(20);
        setAgilidade(15);
        setInteligencia(40);
        setNivel(50);
    }
    
    
    
    public int machadoMaluco(){
        
        return getForca() * 2;
    }
    
    public int rasteiraPequena(){
        return (getForca() / 2 ) + (getInteligencia() / 2);
    }
    
    public int soquinho(){
        return getForca() * getAgilidade();
    }
    
    public int marreta(){
        return getForca() * 3;
    }
    
    public int especial(){
        return getForca() * getAgilidade() * getMagia();     
    }
    
    
    
    @Override
    public void atacar(){
        System.out.println(getNome() + " Atacando!");
    }
    
    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano. vida restante: " + getVida());
    }
    
    public boolean estaVivo(){
        
        return getVida() > 0;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\n\nHABILIDADES: " +
                "\nMachado Maluco: " + machadoMaluco() +
                "\nRasteria pequena: " + rasteiraPequena() +
                "\nSoquinho: " + soquinho() +
                "\nMarretada: " + marreta() + 
                "\nEspecial: " + especial();
    }

     
}
