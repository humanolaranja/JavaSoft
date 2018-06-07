package Controller;

import Model.Visita;
import Model.Visitante;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVisita {
    
    private ArrayList<Visita> visitas;
    
    public GerenciadorVisita(){
        this.visitas = new ArrayList<Visita>();
    }

    // getter e setter
    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }
    
    // adiciona uma visita ao sistema
    public void adicionar(Visita v){
        this.visitas.add(v);
    }
    
    public ArrayList<Visitante> buscaPeriodo(LocalDate inicio, LocalDate fim){
        ArrayList<Visitante> resultadoBusca = new ArrayList<Visitante>();
        
        for(Visita v : this.visitas){
            if(v.getDia().getYear() > inicio.getYear() && v.getDia().getYear() < fim.getYear()){
                resultadoBusca.add(v.getVisitante());
            }
            
            else if(v.getDia().getYear() == inicio.getYear() && inicio.getYear() == fim.getYear()){
                if(v.getDia().getDayOfYear() >= inicio.getDayOfYear() && v.getDia().getDayOfYear() <= fim.getDayOfYear()){
                    resultadoBusca.add(v.getVisitante());
                }
            }
            
            else if(v.getDia().getYear() == inicio.getYear()){
                if(v.getDia().getDayOfYear() >= inicio.getDayOfYear()){
                    resultadoBusca.add(v.getVisitante());
                }
            }
            
            else if(v.getDia().getYear() == fim.getYear()){
                if(v.getDia().getDayOfYear() <= fim.getDayOfYear())
                    resultadoBusca.add(v.getVisitante());
            }
        }
        return resultadoBusca;
    }
}
    