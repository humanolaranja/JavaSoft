package Controller;

import Model.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GerenciadorVisita {
    
    private ArrayList<Visita> visitas;
    private ArrayList<Visitante> visitantes;
    private ArrayList<Associado> associados;
    
    public GerenciadorVisita(){
        this.visitas = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.associados = new ArrayList<>();
    }
    
    // Metodo que inicializa alguns objetos no sistema para demonstracao
    public static GerenciadorVisita initialize(){
        GerenciadorVisita g = new GerenciadorVisita();
        
        Visitante visitante1 = new Visitante("Marcos", "Silveira", "14.251.871-7", LocalDate.of(1966, Month.MARCH, 12));
        Visitante visitante2 = new Visitante("Maria", "Costa Silva", "24.658.974-1", LocalDate.of(1975, Month.DECEMBER, 20));
        Visitante visitante3 = new Visitante("Paulo", "Correia", "27.741.123-2", LocalDate.of(1995, Month.JUNE, 14));
        Visitante visitante4 = new Visitante("Patricia", "Santana", "10.114.747-8", LocalDate.of(1990, Month.JULY, 25));
        Visitante visitante5 = new Visitante("Rogerio", "Matos", "11.221.777-3", LocalDate.of(1979, Month.JANUARY, 19));
        Visitante visitante6 = new Visitante("Fernando", "Martins", "17.985.998-8", LocalDate.of(1987, Month.MARCH, 2));
        Visitante visitante7 = new Visitante("Julio", "Nogueira", "14.822.641-3", LocalDate.of(2010, Month.AUGUST, 7));
        Visitante visitante8 = new Visitante("Marcia", "Fernandes", "38.974.584-2", LocalDate.of(2005, Month.SEPTEMBER, 30));
        Visitante visitante9 = new Visitante("Juliana", "Paladino", "21.144.357-4", LocalDate.of(1998, Month.NOVEMBER, 9));
        Visitante visitante10 = new Visitante("Pedro", "Santiago", "25.114.975-6", LocalDate.of(2007, Month.JUNE, 18));
        
        Associado vAssociado1 = new Associado("Felix", "Barbosa", "24.417.877-9", LocalDate.of(1990, Month.MAY, 3), LocalDate.of(2017, Month.JUNE, 18));
        Associado vAssociado2 = new Associado("Roberta", "Garcia", "19.228.698-8", LocalDate.of(1996, Month.AUGUST, 22), LocalDate.of(2018, Month.JANUARY, 11));
        Associado vAssociado3 = new Associado("Matheus", "Martinez", "27.996.322-1", LocalDate.of(1985, Month.FEBRUARY, 9), LocalDate.of(2018, Month.FEBRUARY, 26));
        Associado vAssociado4 = new Associado("Marcela", "Monaco", "28.955.321-4", LocalDate.of(1992, Month.DECEMBER, 7), LocalDate.of(2017, Month.DECEMBER, 7));
        Associado vAssociado5 = new Associado("Mariana", "Devisati", "22.644.377-2", LocalDate.of(1999, Month.SEPTEMBER, 14), LocalDate.of(2018, Month.JUNE, 18));
                
        Visita visita1 = new Visita(visitante1, LocalDate.of(2018, Month.JANUARY, 14), Entrada.COMUM);
        Visita visita2 = new Visita(visitante2, LocalDate.of(2018, Month.MARCH, 2), Entrada.ESPECIAL);
        Visita visita3 = new Visita(visitante3, LocalDate.of(2017, Month.FEBRUARY, 22), Entrada.MEIA);
        Visita visita4 = new Visita(visitante4, LocalDate.of(2017, Month.APRIL, 4), Entrada.COMUM);
        Visita visita5 = new Visita(visitante5, LocalDate.of(2017, Month.DECEMBER, 12), Entrada.COMUM);
        Visita visita6 = new Visita(visitante6, LocalDate.of(2017, Month.NOVEMBER, 24), Entrada.MEIA);
        Visita visita7 = new Visita(visitante7, LocalDate.of(2018, Month.OCTOBER, 2), Entrada.ESPECIAL);
        Visita visita8 = new Visita(visitante8, LocalDate.of(2018, Month.JANUARY, 18), Entrada.COMUM);
        Visita visita9 = new Visita(visitante9, LocalDate.of(2018, Month.MARCH, 27), Entrada.COMUM);
        Visita visita10 = new Visita(visitante10, LocalDate.of(2017, Month.MAY, 8), Entrada.MEIA);
        
        g.adicionarVisitante(visitante1); g.adicionarVisitante(visitante2); g.adicionarVisitante(visitante3); g.adicionarVisitante(visitante4); g.adicionarVisitante(visitante5);
        g.adicionarVisitante(visitante6); g.adicionarVisitante(visitante7); g.adicionarVisitante(visitante8); g.adicionarVisitante(visitante9); g.adicionarVisitante(visitante10);
        
        g.adicionarAssociado(vAssociado1); g.adicionarAssociado(vAssociado2); g.adicionarAssociado(vAssociado3); g.adicionarAssociado(vAssociado4); g.adicionarAssociado(vAssociado5);
        
        g.adicionarVisita(visita1); g.adicionarVisita(visita2); g.adicionarVisita(visita3); g.adicionarVisita(visita4); g.adicionarVisita(visita5); g.adicionarVisita(visita6);
        g.adicionarVisita(visita7); g.adicionarVisita(visita8); g.adicionarVisita(visita9); g.adicionarVisita(visita10);
        
        g.visitas.sort(null);
        g.visitantes.sort(null);
        
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

    public ArrayList<Associado> getAssociados() {
        return associados;
    }

    public void setAssociados(ArrayList<Associado> associados) {
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
    
    // adiciona um Associado ao Sistema
    public void adicionarAssociado(Associado visitante){
        this.associados.add(visitante);
    }
    
    // Busca no ArrayList de Visitantes por um RG
    public int buscarRgVisitante(String rg){
        for(int i=0; i<this.visitantes.size(); i++){
            if(this.visitantes.get(i).getRg().compareToIgnoreCase(rg) == 0)
                return i;
        }
        
        //Não achou o funcionario
        return -1;
    }
    
    // Busca no ArrayList de Associados por um RG
    public int buscarRgAssociado(String rg){
        for(int i=0; i<this.associados.size(); i++){
            if(this.associados.get(i).getRg().compareToIgnoreCase(rg) == 0)
                return i;
        }
        
        //Não achou
        return -1;
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
    