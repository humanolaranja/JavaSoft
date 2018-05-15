package Controller;

import Model.Funcionario;
import Model.Jaula;
import Model.Loja;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MockDatabase {
        
    public static final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public static final ArrayList<Jaula> jaulas = new ArrayList<>();
    public static final ArrayList<Loja> lojas = new ArrayList<>();
    
    public static void initializeDatabase(){
        try{
            funcionarios.add(new Funcionario("","",LocalDate.now(),0,"",0.0,LocalDate.now()));
            /**
             * inicializar vários funcionários, lojas e jaulas.
             */
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}