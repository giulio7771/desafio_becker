/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import com.mycompany.desafiogg.src.controller.ContaController;
import com.mycompany.desafiogg.src.model.Banco;
import com.mycompany.desafiogg.src.view.View;

/**
 *
 * @author giuliog
 */
public class App {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Br Mais Crédito");
        banco.setCodigo(250);
        
        ContaController contaController = new ContaController(banco);
        
        View view = new View();
        view.setBanco(banco);
        view.setContaController(contaController);
        view.setVisible(true);
        
    }
}
