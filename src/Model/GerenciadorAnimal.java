package Model;

import java.util.ArrayList;

public class GerenciadorAnimal {
    
    // Lista de animais do gerenciador
    private final ArrayList<Animal> listaAnimais = new ArrayList<>();
    
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
    public boolean remover(Animal a){
        //Checando se o animal existe
        if(buscarId(a.getId()) != -1){
            listaAnimais.remove(a);
            return true;
        }
        else{
            //Não existe esse animal
            return false;
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
    
    // editar curiosidade do animal
    public boolean editarCuriosidade(int id, String curiosidade){
        int pos = this.buscarId(id);
        //Animal não existe
        if(pos == -1)
            return false;
        
        listaAnimais.get(pos).setCuriosidade(curiosidade);
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