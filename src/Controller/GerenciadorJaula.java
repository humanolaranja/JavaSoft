package Controller;

import Model.Jaula;
import java.util.ArrayList;

public class GerenciadorJaula {
    
    //Lista de jaulas
    private final ArrayList<Jaula> listaJaulas = new ArrayList<>();
    
    public static GerenciadorJaula initialize(){
        GerenciadorJaula g = new GerenciadorJaula();
        return g;
    }
    
    //Adiciona jaula
    public boolean adicionar(Jaula j){
        if(buscarId(j.getId()) == -1){
            listaJaulas.add(j);
            return true;
        }
        else
            return false;
    }
    
    //Remove jaula
    public boolean remover(Jaula j){
        if(buscarId(j.getId()) != -1){
            listaJaulas.remove(j);
            return true;
        }
        else
            return false;
    }
    
    //Metodo para editar quantidade maxima de animais em uma jaula
    public boolean editarNumMaxAnimais(int id, int numMaxAnimais) throws Exception{
        int pos = buscarId(id);
        //Jaula não existe
        if(pos == -1)
            return false;
        
        Jaula j = listaJaulas.get(pos);
        j.setNumMaxAnimais(numMaxAnimais);
        return true;
    }
    
    //Retorna posição encontrada
    public int buscarId(int id){
        for(int i=0; i<listaJaulas.size(); i++){
            if(listaJaulas.get(i).getId() == id)
                return i;
        }
        
        //Não encontrou
        return -1;
    }
}
