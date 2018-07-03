package Controller;

import Model.Busca;
import Model.Funcionario;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GerenciadorFuncionario implements Busca{
    private ArrayList<Funcionario> listaFuncionarios;

    public static GerenciadorFuncionario initialize(){
        Funcionario f1 = new Funcionario("João", "Maruca", "12.234.567-8", "321.321.321-55", LocalDate.of(1999, Month.MARCH, 17), 1, "123456789", 1500, LocalDate.of(2015, Month.MARCH, 12), "Alimentação");
        Funcionario f2 = new Funcionario("Felipe", "Labate", "12.546.525-5", "123.654.789-88", LocalDate.of(1997, Month.AUGUST, 13), 1, "321654789", 1500, LocalDate.of(2016, Month.AUGUST, 5), "Almoxarifado");
        Funcionario f3 = new Funcionario("Gabriel", "Alcântara", "32.654.789-8", "456.456.456-54", LocalDate.of(1998, Month.DECEMBER, 4), 2, "456789245", 1250, LocalDate.of(2017, Month.JANUARY, 5), "Alimentação");
        Funcionario f4 = new Funcionario("Carlos", "Eduardo", "45.852.369-4", "444.555.666-87", LocalDate.of(1998, Month.JUNE, 18), 2, "78965412", 1600, LocalDate.of(2014, Month.MARCH, 13), "Segurança");
        Funcionario f5 = new Funcionario("Santiago", "Saraiva", "74.546.528-4", "564.789.654-52", LocalDate.of(1997, Month.MAY, 25), 3, "12345678", 1500, LocalDate.of(2010, Month.DECEMBER, 26), "Aquisições");
        Funcionario f6 = new Funcionario("José", "Silva", "45.456.456-7", "123.123.123-55", LocalDate.of(1975, Month.JULY, 24), 3, "123456789", 2000, LocalDate.of(2005, Month.FEBRUARY, 12), "Administação");
        
        GerenciadorFuncionario g = new GerenciadorFuncionario();
        g.adicionar(f1);
        g.adicionar(f2);
        g.adicionar(f3);
        g.adicionar(f4);
        g.adicionar(f5);
        g.adicionar(f6);
        g.listaFuncionarios.sort(null);
                
        return g;
    }
    
    public GerenciadorFuncionario() {
        this.listaFuncionarios = new ArrayList<>();
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
    public boolean remover(String cpf){
        //Checando se o funcionario existe
        int index = buscarCpf(cpf);
        if(index != -1){
            Funcionario f = this.listaFuncionarios.get(index);
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
   
    // Pesquisa uma string nos elementos
    @Override
    public ArrayList<Funcionario> pesquisar(String string){
        ArrayList<Funcionario> p = new ArrayList<>();
        
        for(int i=0; i<listaFuncionarios.size(); i++){  // Para cada funcionario no array
            if(this.listaFuncionarios.get(i).contem(string))
                p.add(listaFuncionarios.get(i));
        }
        return p;
    }
}
