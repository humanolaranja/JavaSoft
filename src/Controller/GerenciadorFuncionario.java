package Controller;

import Model.Funcionario;
import java.util.ArrayList;

public class GerenciadorFuncionario {
    private ArrayList<Funcionario> listaFuncionarios;

    public GerenciadorFuncionario() {
        this.listaFuncionarios = new ArrayList<Funcionario>();
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
    
    //Adiciona um funcionario
    public boolean adicionar(Funcionario f){
        //Checando se o funcionario não existe
        if(buscarRg(f.getRg()) == -1){
            listaFuncionarios.add(f);
            return true;
        }
        else
            return false;
    }
    
    //Remove um funcionario
    public boolean remover(Funcionario f){
        //Checando se o funcionario existe
        if(buscarRg(f.getRg()) != -1){
            listaFuncionarios.remove(f);
            return true;
        }
        else
            return false;
    }
    
    public boolean editarTurno(String rg, int t) throws Exception{
        int pos = buscarRg(rg);
        //Funcionario não existe
        if(pos == -1)
            return false;
        
        Funcionario f = listaFuncionarios.get(pos);
        f.setTurno(t);
        return true;
    }
    
    public boolean editarSalario(String rg, double salario) throws Exception{
        int pos = buscarRg(rg);
        //Funcionario não existe
        if(pos == -1)
            return false;
        
        Funcionario f = listaFuncionarios.get(pos);
        f.setSalario(salario);
        return true;
    }
    
    // faz a busca por RG (retorna o indice do ArrayList em que ele está)
    public int buscarRg(String rg){
        for(int i=0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i).getRg().compareToIgnoreCase(rg) == 0)
                return i;
        }
        
        //Não achou o funcionario
        return -1;
    }
    
    // faz a busca por CPF (retorna o indice do ArrayList em que ele está)
    public int buscarCpf(String cpf){
        for(int i=0; i<listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i).getCpf().compareToIgnoreCase(cpf) == 0)
                return i;
        }
        
        //Não achou o funcionario
        return -1;
    }
}
