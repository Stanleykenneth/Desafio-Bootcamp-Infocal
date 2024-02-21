package reino_programacao.Entities;

import java.util.ArrayList;

/**
 *
 * @author kstan
 */
public class Inventario {

    private ArrayList<String> itens;

    public Inventario() {

        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String item) {
        this.itens.add(item);
    }


    public ArrayList<String> getItens() {
        return itens;
    }

    public void setItens(ArrayList<String> itens) {
        this.itens = itens;
    }

    public void imprimirItem(int posicao) {
        if (posicao >= 0 && posicao < this.itens.size()) {
            System.out.println("Item na posição " + posicao + ": " + this.itens.get(posicao));
        } else {
            System.out.println("Posição de inventário inválida.");
        }
    }

    public void exibirInventario() {
        System.out.println("Inventário:");
        for (int i = 0; i < this.itens.size(); i++) {
            System.out.println("Posição " + i + ": " + this.itens.get(i));
        }
    }

}
