package Model;

import java.util.ArrayList;
import java.time.LocalTime;

public class Loja {
	
    // Atributos
    private final int id;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<String> tags;
    private String nome;
    private double valorAluguel;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;


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
        
        this.id = GerenciadorId.getLojaId();
        this.nome = nome;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.valorAluguel = valorAluguel;
        tags = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    // Getters e setters
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
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

    // Imprime os dados da loja
    public void imprimirDados() {
        System.out.println("#### Loja ####");
        System.out.println("-Nome: " + getNome());
        System.out.println("-Valor aluguel: " + getValorAluguel());
        System.out.println("-Horário de abertura: " + getHorarioAbertura().toString());
        System.out.println("-Horário de fechamento: " + getHorarioFechamento().toString());
        System.out.println("-Tags: " + getTags().toString());
        System.out.print("-Funcionários: ");
        if(getFuncionarios().size() == 0)
            System.out.println("a loja não tem funcionários");
        else{
            Funcionario f;
            System.out.println();
            for(int i=0; i<getFuncionarios().size(); i++) {
                System.out.println("\nFuncionário " + (i+1));
                f = getFuncionarios().get(i);
                f.imprimirDados();
            }
        }
    }
}
