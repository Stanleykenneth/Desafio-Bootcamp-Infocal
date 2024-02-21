
package reino_programacao;

import java.io.File;
import reino_programacao.Entities.Inventario;
import reino_programacao.Exceptions.UltimoRespiroException;
import reino_programacao.Exceptions.NivelBaixoException;
import reino_programacao.Entities.Humano;
import reino_programacao.Entities.Elfo;
import reino_programacao.Entities.Anao;
import reino_programacao.Services.Arena;
import reino_programacao.Services.Aventura;
import static reino_programacao.Services.ArenaDosFortes.duelar;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author kstan
 */
public class Reino_Programacao {

    public static void main(String[] args) {
        
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível encontrar o driver do H2 no classpath.");
            e.printStackTrace();
            return;
        }
        
        File dbFile = new File("C:/Users/kstan/test.mv.db");
        if (dbFile.exists()) {
            if (dbFile.delete()) {
                System.out.println("Arquivo de banco de dados excluído com sucesso.");
            } else {
                System.out.println("Falha ao excluir o arquivo de banco de dados.");
            }
        } else {
            System.out.println("O arquivo de banco de dados não existe.");
        }
        
        Connection connection = Conexao.conexao();
       
        Anao anao = new Anao("Little Man");
        Elfo elfo = new Elfo("Pitomba");
        Humano humano = new Humano("Conan");                 
        Arena arena = new Arena();
        Aventura aventura = new Aventura();
        Inventario inventario = new Inventario();
        
        System.out.println("INFORMAÇÕES DO ANÃO:");
        System.out.println(anao);
        System.out.println("--------------------");
        System.out.println("");
        
        System.out.println("INFORMAÇÕES DO ELFO:");
        System.out.println(anao);
        System.out.println("--------------------");
        System.out.println("");
        
        System.out.println("INFORMAÇÕES DO HUMANO:");
        System.out.println(anao);
        System.out.println("--------------------");     
        System.out.println("");
        
        humano.setForca(15);
        System.out.println("Nova força do humano: " + humano.getForca());
        
        arena.duelar(humano, anao);
        aventura.encontrarObjeto();
        aventura.lutarMonstro(anao);
        anao.setNivel(8);
        anao.setVida(40);
        
        try {
            Statement statement = connection.createStatement();
            
            String createTableSQL = "CREATE TABLE IF NOT EXISTS personagens (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(255))";
            statement.execute(createTableSQL);
            System.out.println("Tabela 'personagens' criada com sucesso!");
            
            String insertDataSQL = "INSERT INTO  personagens (nome) VALUES ('Little Man'), ('Pitomba'), ('Conan')";
            statement.execute(insertDataSQL);
            System.out.println("Dados inserido com sucesso!");
            
            String selectDataSQL = "SELECT * FROM personagens";
            statement.execute(selectDataSQL);
            
            
        } catch (Exception e) {
             System.out.println("Banco não encontrado!");
        }
        
        
        try {
            duelar(anao);
        } catch (NivelBaixoException e) {
            System.out.println("Erro:" + e.getMessage());
            
        } catch (UltimoRespiroException e) {
            System.out.println("Erro:" + e.getMessage());
          
        }
        
        inventario.adicionarItem("Espada Épica");
        inventario.adicionarItem("Casco de tartaruga Gigante");
        inventario.adicionarItem("Armadura de Homen de ferro");

        inventario.exibirInventario();

        // Testando o método para imprimir um item específico
        inventario.imprimirItem(1); // Deve imprimir "Item na posição 1: Poção de Cura"
        inventario.imprimirItem(3); // Deve imprimir "Posição de inventário inválida."
        
        System.out.println("Little Man ataca com machado: " + anao.machadoMaluco());
        System.out.println("Conan conjura magia de cura: " + humano.magiaCura());
        System.out.println("Pitomba dispara flecha de fogo: " + elfo.flechaDeFogo());      
    }    
    
    
}
