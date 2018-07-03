package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Visitante extends Pessoa{
	
    // Atributos
    private ArrayList<LocalDate> historicoVisitas;

    // Construtor
    public Visitante (String primeiroNome, String sobrenome, String rg, LocalDate nascimento){
        super(primeiroNome, sobrenome, rg, nascimento);
        historicoVisitas = new ArrayList<>();
    }

    // getter e setter
    public ArrayList<LocalDate> getHistoricoVisitas() {
        return historicoVisitas;
    }

    public void setHistoricoVisitas(ArrayList<LocalDate> historicoVisitas) {
        this.historicoVisitas = historicoVisitas;
    }
        
    // Adiciona uma visita ao historico de visitas
    public void adicionarVisita(LocalDate d){
        this.historicoVisitas.add(d);
    }
}
