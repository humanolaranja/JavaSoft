package Controller;

import Model.Visitante;
import java.util.ArrayList;

public class GerenciadorAssociado {
    
    private ArrayList<Visitante> associados;
    
    public GerenciadorAssociado(){
        associados = new ArrayList<Visitante>();
    }
    
    // Faz a busca na lista de associados do sistema, retornando o index da posicao
    public int buscar(String rg){
        Visitante v;
        for(int i = 0; i < this.associados.size(); i++){
            v = this.associados.get(i);
            if(v.getRg().compareTo(rg) == 0)
                return i;
        }
        return -1;
    }
}
