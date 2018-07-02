package Model;

import java.time.LocalDate;

public class Associado extends Visitante {
    private LocalDate inicioAssociacao;
    
    // Construtor
    public Associado(String primeiroNome, String sobrenome, String rg, LocalDate nascimento, LocalDate inicio){
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
    
    public String getInicioAssociadoString(){
        return String.format("%02d", this.inicioAssociacao.getDayOfMonth()) + "/" + String.format("%02d", this.inicioAssociacao.getMonthValue()) + "/" + this.inicioAssociacao.getYear();
    }
}
