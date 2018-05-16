package Controller;

import Model.Funcionario;
import Model.Jaula;
import Model.Loja;
import java.time.LocalDate;
import java.time.Month;
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
            
            // Adicionando funcionários à tabela
            // (String nome, String rg, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, LocalDate dataContratacao)
            funcionarios.add(new Funcionario("Felipe", "123456789", LocalDate.of(1995, 6, 6), Funcionario.TURNO_MANHA, "111111111", 15000, LocalDate.of(2018, 3, 2)));
            funcionarios.add(new Funcionario("João", "983212321", LocalDate.of(1998, 4, 21), Funcionario.TURNO_TARDE, "22222222", 4000, LocalDate.of(2018, 5, 1)));
            funcionarios.add(new Funcionario("Matheus", "11111111", LocalDate.of(1990, 10, 7), Funcionario.TURNO_NOITE, "111111111", 15000, LocalDate.of(2018, 3, 2)));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}