package Model;

import Controller.GerenciadorId;
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

    public void setHorarioAbertura(LocalTime horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public LocalTime getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(LocalTime horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    // Adiciona um funcionário na loja
    public void adicionarFuncionario(Funcionario f) {
        getFuncionarios().add(f);
    }

    // Remove o funcionário da posicao i
    public void removerFuncionario(int i) {
        getFuncionarios().remove(i);
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
