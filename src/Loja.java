import java.util.ArrayList;
import java.time.LocalTime;

public class Loja {
	
	// Atributos
	private String nome;
	private double valorAluguel;
	private LocalTime horarioAbertura;
	private LocalTime horarioFechamento;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<String> tags;
	
	// Construtor
	public Loja(String nome, LocalTime horarioAbertura, LocalTime horarioFechamento, double valorAluguel, ArrayList<String> tags, Funcionario... funcionarios) {
		this.nome = nome;
		this.horarioAbertura = horarioAbertura;
		this.horarioFechamento = horarioFechamento;
		this.valorAluguel = valorAluguel;
		// ArrayList de tags
		this.tags = new ArrayList<>();
		this.tags = tags;
		// ArrayList de funcionários
		this.funcionarios = new ArrayList<>();
		for(int i=0; i<funcionarios.length; i++) {
			this.funcionarios.add(funcionarios[i]);
		}
	}

	// Getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
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

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
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
