package Controller;

import Model.Visitante;
import java.util.ArrayList;

public class GerenciadorVisitante {
    
    private ArrayList<Visitante> visitantes;
    
    public GerenciadorVisitante(){
        this.visitantes = new ArrayList<Visitante>();
    }

    // getter e setter
    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }
    
    // faz a busca de um visitante no sistema pelo RG (retorna a posicao no ArrayList)
    public int buscaRg(String rg){
        
        Visitante v;
        for(int i = 0; i < this.visitantes.size(); i++){
            v = this.visitantes.get(i);
            if(v.getRg().compareTo(rg) == 0)
                return i;
        }
        return -1;
    }
    
    // adiciona um visitante ao sistema
    public boolean adicionar(Visitante v){
        if(this.buscaRg(v.getRg()) == -1){
            this.visitantes.add(v);
            return true;
        }else
            return false;
    }
}
