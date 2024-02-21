package reino_programacao.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import reino_programacao.Entities.Personagens;

/**
 *
 * @author kstan
 */
public final class Aventura {

    private List<String> inventario;
    private int nivel;
    private int experiencia;

    public Aventura() {
        super();    
        this.inventario = new ArrayList<>();
        this.nivel = 1;
        this.experiencia = 0;
    }

    public List<String> getInventario() {
        return inventario;
    }

    public void setInventario(List<String> inventario) {
        this.inventario = inventario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void encontrarObjeto() {
        String[] objetosMagicos = {"Espada Épica", "Casco de tartaruga Gigante", "Armadura de Homen de ferro"};
        Random rand = new Random();
        String objetoEncontrado = objetosMagicos[rand.nextInt(objetosMagicos.length)];
        this.inventario.add(objetoEncontrado);
        System.out.println("Você encontrou um objeto mágico: " + objetoEncontrado + "! Adicionado ao inventário.");
    }

    public void lutarMonstro(Personagens personagem) {

        String[] monstros = {"Dragão", "Grilo doido", "Esqueleto"};
        Random rand = new Random();
        String monstro = monstros[rand.nextInt(monstros.length)];
        int poderMonstro = rand.nextInt(10) * this.nivel;
        System.out.println("Um " + monstro + " apareceu!");

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Deseja atacar (a) ou correr (c)?\n ");
            String escolha = ler.nextLine().toLowerCase();
            if (escolha.equals("a")) {
                int poderPersonagem = rand.nextInt(10) * this.nivel;
                if (poderPersonagem > poderMonstro) {
                    System.out.println(personagem.getNome() + " derrotou o " + monstro + "!");
                    this.experiencia += 10 * this.nivel;
                    if (this.experiencia >= 100 * this.nivel) {
                        this.nivel++;
                        this.experiencia = 0;
                        System.out.println("Você subiu para o nível " + this.nivel + "!");
                    }
                    break;
                } else {
                    System.out.println("O " + monstro + " te derrotou! Tente novamente.");
                    break;
                }
            } else if (escolha.equals("c")) {
                System.out.println("Você fugiu da batalha!");
                break;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}
