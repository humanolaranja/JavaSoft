package Model;

import Controller.GerenciadorId;
import java.util.ArrayList;
import java.time.LocalTime;

public class Loja {
	
    // Atributos
    private final ArrayList<Funcionario> funcionarios;
    private final ArrayList<String> tags;
    private String nome;
    private double valorAluguel;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private final int id;

    // Construtor
    public Loja(String nome, LocalTime horarioAbertura, LocalTime horarioFechamento, double valorAluguel) throws Exception{
        
        if(nome == null)
            throw new Exception("Tentativa de criar nova loja com 'nome == null'");
        if(horarioAbertura == null)
            throw new Exception("Tentativa de criar nova loja com 'horarioAbertura == null'");
        if(horarioFechamento == null)
            throw new Exception("Tentativa de criar nova loja com 'horarioAbertura == null'");
        if(valorAluguel < 0)
            throw new Exception("Tentativa de criar nova loja com 'valorAluguel < 0'");
        
        this.nome = nome;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.valorAluguel = valorAluguel;
        tags = new ArrayList<>();
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

    public ArrayList<String> getTags() {
        return tags;
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

    // Adiciona uma tag
    public void adicionarTag(String tag) {
        getTags().add(tag);
    }

    // Remove uma tag
    public void removerTag(String tag) {
        getTags().remove(tag);
    }
}
