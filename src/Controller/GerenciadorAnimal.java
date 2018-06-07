package Controller;

import Model.Animal;
import Model.Jaula;
import java.util.ArrayList;

public class GerenciadorAnimal {
    
    // Lista de animais do gerenciador
    private ArrayList<Animal> listaAnimais = new ArrayList<>();
    
    // adicionar um animal
    public boolean adicionar(Animal a){
        //Checando se o animal não existe
        if(buscarId(a.getId()) == -1){
            listaAnimais.add(a);
            return true;
        }
        else{
            //Já existe esse animal
            return false;
        }
    }
    
    // remover um animal
    public boolean remover(int id){
        //Checando se o animal existe
        int index = buscarId(id);
        if(index == -1)
            return false;
        else{
            //O animal existe no Array
            Animal a = this.listaAnimais.get(index);
            listaAnimais.remove(a);
            return true;
        }
    }
    
    // editar jaula do animal
    public boolean editarJaula(int id, Jaula j){
        int pos = this.buscarId(id);
        
        // animal nao existe
        if(pos == -1)
            return false;
        
        listaAnimais.get(pos).setJaula(j);
        return true;
    }
    
    // faz a busca por ID (retorna o indice do ArrayList em que ele está)
    public int buscarId(int id){
        for(int i=0; i<listaAnimais.size(); i++){
            if(listaAnimais.get(i).getId() == id)
                return i;
        }
        
        //Não achou o animal
        return -1;
    }
}