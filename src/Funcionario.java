import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
	// Variaveis finais
	public static final int TURNO_MANHA = 1;
	public static final int TURNO_TARDE = 2;
	public static final int TURNO_NOITE = 3;
	
	// Atributos
	private int turno;
	private String numCarteiraTrabalho;
	private double salario;
	private LocalDate dataContratacao;
	
	// Metodos:
	
	// Construtor
	public Funcionario	(String nome, String rg, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, LocalDate dataContratacao) {
		super(nome, rg, nascimento);
		this.turno = checkTurno(turno);
		this.numCarteiraTrabalho = numCarteiraTrabalho;
		this.salario = checkSalario(salario);
		this.dataContratacao = dataContratacao;
	}
	
	// Checa se o turno e valido
	private int checkTurno(int turno) {
		if(turno > 0 && turno <= 3)	// Se for valido
			return turno;
		else {	// Se for invalido
			System.out.println("Turno do funcionáio " + this.getNome() + " inválido. Configurando para MANHÃ.");
			return TURNO_MANHA;
		}
	}
	
	// Checa se o salario e valido
	private double checkSalario(double salario) {
            if(salario >= 0)	// Se for valido
		return salario;
            else {	// Se for invalido
		System.out.println("Salário do funcionário " + this.getNome() + " inválido. Configurando para 0.");
		return 0;
            }
	}
	
	// Getters e setters
	public int getTurno() {
		return this.turno;
	}

	public void setTurno(int turno) {
		this.turno = checkTurno(turno);
	}

	public String getNumCarteiraTrabalho() {
		return numCarteiraTrabalho;
	}

	public void setNumCarteiraTrabalho(String numCarteiraTrabalho) {
		this.numCarteiraTrabalho = numCarteiraTrabalho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = checkSalario(salario);
	}

	public LocalDate getDataContratacao() {
		return this.dataContratacao;
	}

	public void setDataContratacao(LocalDate contratacao) {
		this.dataContratacao = contratacao;
	}
	
	// Imprime os dados
	@Override
	public void imprimirDados(){
		System.out.println("-Nome: " + this.getNome());
		System.out.println("-RG: " + this.getRg());
		System.out.println("-Data de nascimento: " + this.getDataNascimento().toString());
		System.out.println("-Data de contrata��o: " + this.getDataContratacao().toString());
		System.out.println("-Sal�rio: " + this.getSalario());
		System.out.println("-Carteira de trabalho: " + this.getNumCarteiraTrabalho());
		System.out.print("-Turno: ");
            switch (this.getTurno()) {
                case TURNO_MANHA:
                    System.out.println("manh�\n");
                    break;
                case TURNO_TARDE:
                    System.out.println("tarde\n");
                    break;
                default:
                    System.out.println("noite\n");
                    break;
            }
	}
}
