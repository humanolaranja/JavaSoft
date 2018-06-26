package Controller;

import Model.Busca;
import Model.Funcionario;
import Model.Loja;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;

public class GerenciadorLoja implements Busca{
    
    //Lista de jaulas
    private final ArrayList<Loja> listaLojas = new ArrayList<>();

    public static GerenciadorLoja initialize(){
        GerenciadorLoja g = new GerenciadorLoja();
        try{
            g.adicionar(new Loja("Loja 10", LocalTime.now(), LocalTime.now(), 200));
        }catch(Exception e){}
        
        return g;
    }
    
    // getter
    public ArrayList<Loja> getListaLojas() {
        return listaLojas;
    }
    
    //Adiciona jaula
    public boolean adicionar(Loja l){
        if(buscarId(l.getId()) == -1){
            listaLojas.add(l);
            return true;
        }
        else
            return false;
    }
    
    //Remove jaula
    public boolean remover(Loja l){
        if(buscarId(l.getId()) != -1){
            listaLojas.remove(l);
            return true;
        }
        else
            return false;
    }
    
    //Edita o nome
    public boolean editarNome(int id, String nome){
        int pos = buscarId(id);
        //Loja não existe
        if(pos == -1)
            return false;
        
        Loja l = listaLojas.get(pos);
        l.setNome(nome);
        return true;
    }
    
    //Edita o valor de aluguel
    public boolean editarAluguel(int id, double valorAluguel){
        int pos = buscarId(id);
        if(pos == -1)
            return false;
        
        Loja l = listaLojas.get(pos);
        l.setValorAluguel(valorAluguel);
        return true;
    }
    
    //Edita o horario de abertura
    public boolean editarAbertura(int id, LocalTime horarioAbertura){
        int pos = buscarId(id);
        if(pos == -1)
            return false;
        
        Loja l = listaLojas.get(pos);
        l.setHorarioAbertura(horarioAbertura);
        return true;
    }
    
    //Edita o horario de fechamento
    public boolean editarFechamento(int id, LocalTime horarioFechamentos){
        int pos = buscarId(id);
        if(pos == -1)
            return false;
        
        Loja l = listaLojas.get(pos);
        l.setHorarioFechamento(horarioFechamentos);
        return true;
    }
    
    //Retorna posição encontrada
    public int buscarId(int id){
        for(int i=0; i<listaLojas.size(); i++){
            if(listaLojas.get(i).getId() == id)
                return i;
        }
        
        //Não encontrou
        return -1;
    }
    
    @Override
    public ArrayList<Loja> pesquisar(String string){
        ArrayList<Loja> p = new ArrayList<>();
        
        for(int i=0; i<listaLojas.size(); i++){  // Para cada funcionario no array
            if(this.listaLojas.get(i).getNome().toLowerCase().contains(string.toLowerCase()))
                p.add(listaLojas.get(i));
        }
        return p;
    }
}
