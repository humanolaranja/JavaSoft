package Controller;

import Model.*;
import java.util.ArrayList;

public class GerenciadorFinanceiro {
    
    public static double custoJaulas(ArrayList<Jaula> jaulas){
        double custo = 0;
        
        for(Jaula j : jaulas){
            custo = custo + j.custoTotal();
        }
        return custo;
    }
    
    public static double custoFuncionarios(ArrayList<Funcionario> funcionarios){
        double custo = 0;
        
        for(Funcionario f : funcionarios){
            custo = custo + f.getSalario();
        }
        return custo;
    }
    
    public static double custoAnimais()
    {
        double custo = 0;
        
        
        
        return custo;
    }
    
    public static double ganhoLojas()
    {
        double ganho = 0;
        
        
        
        return ganho;
    }
    
    public static double ganhoVisitantes()
    {
        double ganho = 0;
        
        
        
        return ganho;
    }
}