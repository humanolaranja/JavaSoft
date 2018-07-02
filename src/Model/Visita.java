package Model;

import java.time.LocalDate;

public class Visita implements Comparable<Visita>{
    private Visitante visitante;
    private LocalDate dia;
    private Entrada tipo;
    
    public Visita(Visitante v, LocalDate d, Entrada entrada){
        this.visitante = v;
        this.dia = d;
        this.tipo = entrada;
    }

    // getters e setters
    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public Entrada getTipo() {
        return tipo;
    }

    public void setTipo(Entrada tipo) {
        this.tipo = tipo;
    }
    
    // Retorna uma String contendo a data da Visita no formato dia/mes/ano 
    public String getDataString(){
        return String.format("%02d", this.dia.getDayOfMonth()) + "/" + String.format("%02d", this.dia.getMonthValue()) + "/" + this.dia.getYear();
    }

    // Interface Comparable, onde as visitas serao ordenadas de ordem decrescente
    @Override
    public int compareTo(Visita v) {
        if(this.dia.isEqual(v.getDia()))
            return 0;
        else if(this.dia.isBefore(v.getDia()))
            return 1;
        else
            return -1;
    }
}
