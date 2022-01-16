package App;

import com.mycompany.desafiogg.src.controller.ContaController;
import com.mycompany.desafiogg.src.controller.ReceitaController;
import com.mycompany.desafiogg.src.model.Banco;
import com.mycompany.desafiogg.src.view.View;

public class App {
    
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Br Mais Crédito");
        banco.setCodigo(250);
        
        ContaController contaController = new ContaController(banco);
        ReceitaController receitaController = new ReceitaController(banco);
        
        View view = new View();
        view.setBanco(banco);
        view.setContaController(contaController);
        view.setReceitaController(receitaController);
        
        view.setVisible(true);   
    }
}
