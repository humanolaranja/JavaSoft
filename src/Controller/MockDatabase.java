package Controller;

import Model.Funcionario;
import Model.Jaula;
import Model.Loja;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MockDatabase {
        
    public static final ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public static final ArrayList<Jaula> jaulas = new ArrayList<>();
    public static final ArrayList<Loja> lojas = new ArrayList<>();
    
    public static void initializeDatabase(){
        try{
            /**
             * inicializar vários funcionários, lojas e jaulas.
             */            
            lojas.add(new Loja("Pizzaria zoologico", LocalTime.of(12,00), LocalTime.of(17, 00), 10000));
            lojas.add(new Loja("Lanches Rodrigo", LocalTime.of(18,30), LocalTime.of(22, 00), 15000));
            lojas.add(new Loja("Sorveteria campineira", LocalTime.of(9,00), LocalTime.of(21, 30), 5000));
            lojas.add(new Loja("Unicamp lanches", LocalTime.of(10, 30), LocalTime.of(17, 00), 10000));
            lojas.add(new Loja("Pizzaria Campinas", LocalTime.of(15, 00), LocalTime.of(21, 00), 20000));
            lojas.add(new Loja("Sorvetes Kibon", LocalTime.of(9, 00), LocalTime.of(20, 30), 5000));
            lojas.add(new Loja("Alimentação Natural", LocalTime.of(10, 00), LocalTime.of(20, 00), 7000));
            lojas.add(new Loja("Zoo Self Service", LocalTime.of(11, 30), LocalTime.of(20, 30), 20000));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}