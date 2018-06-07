
package Model;

import java.time.LocalDate;

public class VisitanteAssociado extends Visitante {
    public VisitanteAssociado(String primeiroNome, String sobrenome, String rg, LocalDate nascimento){
        super(primeiroNome, sobrenome, rg, nascimento);
    }
}
