package Controller;

import Model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVisita {
    
    private ArrayList<Visita> visitas;
    private ArrayList<Visitante> visitantes;
    private ArrayList<VisitanteAssociado> associados;
    
    public GerenciadorVisita(){
        this.visitas = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.associados = new ArrayList<>();
    }
    
    public static GerenciadorVisita initialize(){
        GerenciadorVisita g = new GerenciadorVisita();
        
        Visita v1 = new Visita();
        return g;
    }

    // getter e setter
    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public ArrayList<VisitanteAssociado> getAssociados() {
        return associados;
    }

    public void setAssociados(ArrayList<VisitanteAssociado> associados) {
        this.associados = associados;
    }
      
    // adiciona uma Visita ao sistema
    public void adicionarVisita(Visita visita){
        this.visitas.add(visita);
    }
    
    // adiciona um Visitante ao sistema
    public void adicionarVisitante(Visitante visitante){
        this.visitantes.add(visitante);
    }
    
    // adiciona um visitante associado ao Sistema
    public void adicionarAssociado(VisitanteAssociado visitante){
        this.associados.add(visitante);
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
    