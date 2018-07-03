package Controller;

import Model.Animal;
import Model.Jaula;
import Model.Tipo;
import java.util.ArrayList;

public class GerenciadorJaula {
    
    //Lista de jaulas
    private static final ArrayList<Jaula> listaJaulas = new ArrayList<>();
    
    public static GerenciadorJaula initialize(GerenciadorAnimal animais){
        GerenciadorJaula j = new GerenciadorJaula();
        
        Jaula j1 = new Jaula(2000, 5000, Tipo.TERRESTRE);
        Jaula j2 = new Jaula(100, 2200, Tipo.ANFIBIO);
        Jaula j3 = new Jaula(200, 3500, Tipo.ANFIBIO);
        Jaula j4 = new Jaula(180, 2100, Tipo.TERRESTRE);
        Jaula j5 = new Jaula(100, 3600, Tipo.TERRESTRE);
        Jaula j6 = new Jaula(80, 2200, Tipo.TERRESTRE);
        Jaula j7 = new Jaula(1200, 7100, Tipo.TERRESTRE);
        
        for(int i=0 ; i<animais.getListaAnimais().size() ; i++){
            if(i<animais.getListaAnimais().size())
                j1.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j2.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j3.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j4.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j5.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j6.addAnimal(animais.getListaAnimais().get(i++));
            if(i<animais.getListaAnimais().size())
                j7.addAnimal(animais.getListaAnimais().get(i));
        }
        
        j.adicionar(j1);
        j.adicionar(j2);
        j.adicionar(j3);
        j.adicionar(j4);
        j.adicionar(j5);
        j.adicionar(j6);
        j.adicionar(j7);
                
        return j;
    }
    
    // getter
    public static ArrayList<Jaula> getListaJaulas() {
        return listaJaulas;
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
