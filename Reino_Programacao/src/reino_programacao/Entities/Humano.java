
package reino_programacao.Entities;

import reino_programacao.Interfaces.Lutador;

/**
 *
 * @author kstan
 */
public class Humano extends Personagens implements Lutador{
    
    public Humano(String nome){
    
        super(nome);
        setVida(1000);
        setForca(65);
        setMagia(60);
        setAgilidade(60);
        setInteligencia(60);
        setLevel(8);        
    }
    
    public int magiaCura(){
        
        return getMagia() * 2;
    }
    
    public int magiaFogo(){
        return (getMagia() / 2 ) + (getInteligencia() / 2);
    }
    
    public int flechaVeneno(){
        return getInteligencia() * 3;
    }
    
    public int espadaGelo(){
        return getMagia() * 5;
    }
    
    public int escudo(){
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
                "\nMagia de cura: " + magiaCura() +
                "\nMagia de fogo: " + magiaFogo() +
                "\nFlecha com Veneno: " +flechaVeneno() +
                "\nEspada de Gelo: " + espadaGelo() + 
                "\nEscudo: " + escudo();
    }
    
}
