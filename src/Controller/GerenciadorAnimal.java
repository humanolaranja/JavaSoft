package Controller;

import Model.Animal;
import Model.Jaula;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GerenciadorAnimal {
    
    // Lista de animais do gerenciador
    private ArrayList<Animal> listaAnimais = new ArrayList<>();;
    
    public static GerenciadorAnimal initialize(){
        Animal macaco = new Animal("Pongo tapanuliensis", "Indonésia", "Orangotango", "Gosta de se pendurar pelo rabo", "Masculino", new String[]{}, LocalDate.of(2005, Month.MARCH, 5), 200);
        Animal tartaruga = new Animal("Caretta caretta", "Antártida", "Tartaruga", "Prefere águas mais frias", "Feminino", new String[]{}, LocalDate.of(1978, Month.APRIL, 6), 22);
        Animal leão = new Animal("Panthera leo", "Savana africana", "Leão", "Comete infanticídio em épocas de fome", "Masculino", new String[]{}, LocalDate.of(1999, Month.FEBRUARY, 17), 360);
        Animal raposa = new Animal("Vulpes vulpes", "Norte do Brasil", "Raposa", "Se esconde com muita facilidade de predadores", "Masculino", new String[]{}, LocalDate.of(2003, Month.MARCH, 12), 110);
        Animal porco = new Animal("Babyrousa babyrussa", "África central", "Porco doméstico", "Históricamente é criado para o abate", "Feminino", new String[]{}, LocalDate.of(2002, Month.FEBRUARY, 15), 80);
        Animal cavalo = new Animal("Equus ferus caballus", "Europa", "Cavalo", "Cavalos de corrida alcançam velocidades surpreendentes", "Masculino", new String[]{}, LocalDate.of(1995, Month.AUGUST, 4), 120);
        
        
        GerenciadorAnimal g = new GerenciadorAnimal();
        g.adicionar(macaco);
        g.adicionar(tartaruga);
        g.adicionar(leão);
        g.adicionar(raposa);
        g.adicionar(porco);
        g.adicionar(cavalo);
        
        return g;
    }
    
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