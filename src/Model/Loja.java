package Model;

import Controller.GerenciadorId;
import View.JFPrincipal;
import java.util.ArrayList;
import java.time.LocalTime;

public class Loja implements Comparable<Loja>{
	
    // Atributos
    private final ArrayList<Funcionario> funcionarios;
    private String nome;
    private double valorAluguel;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private final int id;

    // Construtor
    public Loja(String nome, LocalTime horarioAbertura, LocalTime horarioFechamento, double valorAluguel){     
        this.nome = nome;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.valorAluguel = valorAluguel;
        funcionarios = new ArrayList<>();
        this.id = GerenciadorId.getLojaId();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public LocalTime getHorarioAbertura() {
        return horarioAbertura;
    }
    
    public LocalTime getHorarioAbertura(int horas, int minutos) {
        return LocalTime.of(horas, minutos);
    }

    public void setHorarioAbertura(LocalTime horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }
    
    public void setHorarioAbertura(int horas, int minutos) {
        this.horarioAbertura = LocalTime.of(horas, minutos);
    }

    public LocalTime getHorarioFechamento() {
        return horarioFechamento;
    }
    
    public LocalTime getHorarioFechamento(int horas, int minutos) {
        return LocalTime.of(horas, minutos);
    }

    public void setHorarioFechamento(LocalTime horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }
    
    public void setHorarioFechamento(int horas, int minutos) {
        this.horarioFechamento = LocalTime.of(horas, minutos);
    }

    // Adiciona um funcionário na loja
    public void adicionarFuncionario(Funcionario f) {
        for(Funcionario fun : getFuncionarios()){
            if(fun == f){
                return;
            }
        }
        getFuncionarios().add(f);
    }

    // Remove o funcionário da posicao i
    public int removerFuncionario(int i) {
        if(getFuncionarios().get(i) == null){
            return -1;
        }
        getFuncionarios().remove(i);
        return 1;
    }
    
    // Remove o funcionário com cpf
    public boolean removerFuncionario(String cpf) {
        //Checando se o funcionario existe
        int index = JFPrincipal.FUNCIONARIOS.buscarCpf(cpf);
        if(index != -1){
            Funcionario f = this.funcionarios.get(index);
            this.funcionarios.remove(f);
            return true;
        }
        else{
            return false;
        }
    }

    // Ordena as lojas por ordem crescente de ID
    @Override
    public int compareTo(Loja l) {
        if(this.getId() < l.getId())
            return -1;
        else if(this.getId() > l.getId())
            return 1;
        else
            return 0;
    }

    
}
