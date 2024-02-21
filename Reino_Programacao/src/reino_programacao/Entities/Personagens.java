
package reino_programacao.Entities;

/**
 *
 * @author kstan
 */
public class Personagens {
  
    private String nome;
    private int vida;
    private int forca;
    private int magia;
    private int agilidade;
    private int inteligencia;
    private int level;
    private int nivel; 
    
    
    public Personagens(String nome){
        
        this.nome = nome;
        this.vida = 1000;
        this.forca = 5;
        this.magia = 5;
        this.agilidade = 5;
        this.inteligencia = 5;
        this.level = 1;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
   
    public int getForca() {
        return forca;
    }
 
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public int getMagia() {
        return magia;
    }
    
    public void setMagia(int magia) {
        this.magia = magia;
    }
  
    public int getAgilidade() {
        return agilidade;
    }
    
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
  
    public int getInteligencia() {
        return inteligencia;
    }
   
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
   
    public int getLevel() {
        return level;
    }
   
    public void setLevel(int level) {
        this.level = level;
    }
    
     public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    @Override
    public String toString(){
        
        return "Nome: " + getNome() +
               "\nVida: " + getVida() +
               "\nForça: " + getForca() +
               "\nMagia: " + getMagia() +
               "\nAgilidade: " + getAgilidade() +
               "\nInteligência: " + getInteligencia() +
               "\nLevel: " + getLevel();
    }   

       
}
