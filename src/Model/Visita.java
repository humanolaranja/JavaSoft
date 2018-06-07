package Model;

import java.time.LocalDate;

public class Visita {
    
    private static double ganhoMensal = 0;
    
    private Visitante visitante;
    private LocalDate dia;
    private boolean feriado;
    private boolean meiaEntrada;
    private boolean especial;
    
    public Visita(Visitante v, LocalDate d, boolean f, boolean m, boolean e){
        this.visitante = v;
        this.dia = d;
        this.feriado = f;
        this.meiaEntrada = m;
        this.especial = e;
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

    public boolean isFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
