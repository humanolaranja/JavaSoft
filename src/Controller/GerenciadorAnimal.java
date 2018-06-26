package Controller;

import Model.Animal;
import Model.Especie;
import Model.Jaula;
import Model.Tipo;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GerenciadorAnimal {
    
    // Lista de animais do gerenciador
    private ArrayList<Animal> listaAnimais = new ArrayList<>();
    private ArrayList<Especie> listaEspecies = new ArrayList<>();

    // getter e setter
    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }

    public ArrayList<Especie> getListaEspecies() {
        return listaEspecies;
    }

    public void setListaEspecies(ArrayList<Especie> listaEspecies) {
        this.listaEspecies = listaEspecies;
    }
    
    // inicializa animais no sistema
    public static GerenciadorAnimal initialize(){
        Especie macacoEsp = new Especie("Pongo tapanuliensis", "Indonésia", "Orangotango", "Gosta de se pendurar pelo rabo", Tipo.TERRESTRE);
        Especie tartarugaEsp = new Especie("Caretta caretta", "Antártida", "Tartaruga", "Prefere águas mais frias", Tipo.ANFIBIO);
        Especie leaoEsp = new Especie("Panthera leo", "Savana africana", "Leão", "Comete infanticídio em épocas de fome", Tipo.TERRESTRE);
        Especie raposaEsp = new Especie("Vulpes vulpes", "Norte do Brasil", "Raposa", "Se esconde com muita facilidade de predadores", Tipo.TERRESTRE);
        Especie porcoEsp = new Especie("Babyrousa babyrussa", "África central", "Porco doméstico", "Históricamente é criado para o abate", Tipo.TERRESTRE);
        Especie cavaloEsp = new Especie("Equus ferus caballus", "Europa", "Cavalo", "Cavalos de corrida alcançam velocidades surpreendentes", Tipo.TERRESTRE);
        
        Animal macaco = new Animal(macacoEsp, "Masculino", LocalDate.of(2005, Month.MARCH, 5), LocalDate.of(2010, Month.AUGUST, 20), 200);
        Animal tartaruga = new Animal(tartarugaEsp, "Feminino", LocalDate.of(1978, Month.APRIL, 6), LocalDate.of(2009, Month.DECEMBER, 12), 35);
        Animal leao = new Animal(leaoEsp, "Masculino", LocalDate.of(1999, Month.FEBRUARY, 17), LocalDate.of(2012, Month.JANUARY, 7), 1200);
        Animal raposa = new Animal(raposaEsp, "Masculino", LocalDate.of(2003, Month.MARCH, 12), LocalDate.of(2005, Month.SEPTEMBER, 10), 400);
        Animal porco = new Animal(porcoEsp, "Feminino", LocalDate.of(2002, Month.FEBRUARY, 15), LocalDate.of(2007, Month.MARCH, 18), 200);
        Animal cavalo = new Animal(cavaloEsp, "Masculino", LocalDate.of(1995, Month.AUGUST, 4), LocalDate.of(2002, Month.APRIL, 26), 600);
            
        GerenciadorAnimal g = new GerenciadorAnimal();
        g.adicionarEspecie(macacoEsp);
        g.adicionarEspecie(tartarugaEsp);
        g.adicionarEspecie(leaoEsp);
        g.adicionarEspecie(raposaEsp);
        g.adicionarEspecie(porcoEsp);
        g.adicionarEspecie(cavaloEsp);
        
        g.adicionarAnimal(macaco);
        g.adicionarAnimal(tartaruga);
        g.adicionarAnimal(leao);
        g.adicionarAnimal(raposa);
        g.adicionarAnimal(porco);
        g.adicionarAnimal(cavalo);
        
        return g;
    }
    
    // adicionar um animal
    public boolean adicionarAnimal(Animal a){
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
    
    public boolean adicionarEspecie(Especie e){
        //Checando se a especie não existe
        if(buscarEspecie(e.getEspecie()) == -1){
            listaEspecies.add(e);
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
    
    // faz a busca da especie
    public int buscarEspecie(String especie){
        for(int i=0; i<listaEspecies.size(); i++){
            if(listaEspecies.get(i).getEspecie().compareToIgnoreCase(especie) == 0)
                return i;
        }
        
        //Não achou a especie
        return -1;
    }
}