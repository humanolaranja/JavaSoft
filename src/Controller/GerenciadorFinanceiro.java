package Controller;

import Model.*;
import java.time.LocalDate;
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
    
    public static double custoAnimais(ArrayList<Animal> animais)
    {
        double custo = 0;
        
        for(Animal a : animais){
            custo = custo + a.getCustoMensal();
        }
        return custo;
    }
    
    public static double ganhoLojas(ArrayList<Loja> lojas)
    {
        double ganho = 0;
        
        for(Loja l : lojas){
            ganho = ganho + l.getValorAluguel();
        }
        return ganho;
    }
    
    public static double ganhoVisitantes(ArrayList<Visita> visitas, LocalDate i, LocalDate f)
    {
        LocalDate dia;
        double ganho = 0;
        
        for(Visita v : visitas){
            dia = v.getDia();
            if(dia.isEqual(i) || dia.isEqual(f) || (dia.isAfter(i) && dia.isBefore(f)))
                ganho = ganho + v.getTipo().getValor();
        }
        return ganho;
    }
}