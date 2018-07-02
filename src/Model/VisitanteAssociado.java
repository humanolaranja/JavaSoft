package Model;

import java.time.LocalDate;

public class VisitanteAssociado extends Visitante {
    private LocalDate inicioAssociacao;
    
    // Construtor
    public VisitanteAssociado(String primeiroNome, String sobrenome, String rg, LocalDate nascimento, LocalDate inicio){
        super(primeiroNome, sobrenome, rg, nascimento);
        this.inicioAssociacao = inicio;
    }

    // getter e setter
    public LocalDate getInicioAssociacao() {
        return inicioAssociacao;
    }

    public void setInicioAssociacao(LocalDate inicioAssociacao) {
        this.inicioAssociacao = inicioAssociacao;
    }  
}
