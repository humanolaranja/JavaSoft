package Controller;

import Model.Visita;
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
}
