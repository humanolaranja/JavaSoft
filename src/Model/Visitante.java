package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Visitante extends Pessoa{
	
    // Atributos
    private ArrayList<Visita> historicoVisitas;

    // Construtor
    public Visitante (String primeiroNome, String sobrenome, String rg, LocalDate nascimento){
        super(primeiroNome, sobrenome, rg, nascimento);
        historicoVisitas = new ArrayList<Visita>();
    }

    // getter e setter
    public ArrayList<Visita> getHistoricoVisitas() {
        return historicoVisitas;
    }

    public void setHistoricoVisitas(ArrayList<Visita> historicoVisitas) {
        this.historicoVisitas = historicoVisitas;
    }
        
    //
    public void adicionarVisita(Visita v){
        this.historicoVisitas.add(v);
    }
}
