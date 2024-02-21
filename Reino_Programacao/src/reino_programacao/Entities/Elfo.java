
package reino_programacao.Entities;

import reino_programacao.Interfaces.Lutador;

/**
 *
 * @author kstan
 */
public class Elfo extends Personagens implements Lutador{
    
    public Elfo(String nome){
        
        super(nome);
        setVida(1000);
        setForca(6);
        setMagia(6);
        setAgilidade(6);
        setInteligencia(7);
    }    
    
    public int flechaDeFogo(){
        
        return getInteligencia() * 2;
    }
    
    public int magiaNatureza(){
        return (getMagia() / 2 ) + (getInteligencia() / 2);
    }
    
    public int flechaGelo(){
        return (getInteligencia() / 3) + (getAgilidade() / 2);
    }
    
    public int flechaExplosiva(){
        return getInteligencia() * 5;
    }
    
    public int rajadaVento(){
        return getForca() * getAgilidade() + (getMagia() * getInteligencia());     
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
                "\nFlecha de Fogo: " + flechaDeFogo() +
                "\nMagia da Natureza: " + magiaNatureza() +
                "\nFlecha de Gelo: " + flechaGelo() +
                "\nFlecha Explosiva: " + flechaExplosiva() + 
                "\nRajada de Vento: " + rajadaVento();
    }
    
}
