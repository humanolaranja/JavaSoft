package Controller;

import Model.Funcionario;
import Model.Jaula;
import Model.Loja;
import java.time.LocalDate;
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
            
            funcionarios.add(new Funcionario("Felipe","123123123", "9387216623", LocalDate.of(1995, 6, 6),Funcionario.TURNO_MANHA,"1234",10000,LocalDate.of(2000, 3, 2)));
            funcionarios.add(new Funcionario("Joao","321321321", "22812345", LocalDate.of(1996, 12, 2),Funcionario.TURNO_TARDE,"32145",3000,LocalDate.of(2007, 10, 10)));
            funcionarios.add(new Funcionario("Gabriel","1231293678", "1283791263", LocalDate.of(2000, 10, 1),Funcionario.TURNO_NOITE,"9862",1000,LocalDate.of(2018, 2, 15)));

            jaulas.add(new Jaula(10));
            jaulas.add(new Jaula(5));
            jaulas.add(new Jaula(1));
            
            lojas.add(new Loja("Pizzaria zoologico", LocalTime.of(12,00), LocalTime.of(17, 00), 10000));
            lojas.add(new Loja("Lanches Rodrigo", LocalTime.of(18,30), LocalTime.of(22, 00), 15000));
            lojas.add(new Loja("Sorveteria campineira", LocalTime.of(9,00), LocalTime.of(21, 30), 5000));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}