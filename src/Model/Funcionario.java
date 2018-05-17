package Model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
	// Variaveis finais
	public static final int TURNO_MANHA = 1;
	public static final int TURNO_TARDE = 2;
	public static final int TURNO_NOITE = 3;
	
	// Atributos
        private final LocalDate dataContratacao;
        private final String numCarteiraTrabalho;
	private int turno;
	private double salario;
		
	// Metodos:
	
	// Construtor
	public Funcionario (String nome, String rg, String cpf, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, LocalDate dataContratacao) throws Exception{
            super(nome, rg, cpf, nascimento);
            
            if(turno != TURNO_MANHA && turno != TURNO_TARDE && turno != TURNO_NOITE)
                throw new Exception("Tentativa de adicionar um funcionário com turno inválido!");
            if(numCarteiraTrabalho == null)
                throw new NullPointerException("Tentativa de adicionar um funcionário com 'numCarteiraTrabalho == null'");
            if(dataContratacao == null)
                throw new NullPointerException("Tentativa de adicionar um funcionário com 'dataContratacao == null'");
            if(salario < 0)
                throw new Exception("Tentativa de adicionar um funcionário com salário negativo.");
                        
            this.turno = turno;
            this.numCarteiraTrabalho = numCarteiraTrabalho;
            this.salario = salario;
            this.dataContratacao = dataContratacao;
        }
        
	// Getters e setters
	public int getTurno() {
		return this.turno;
	}

	public void setTurno(int turno) throws Exception {
            if(turno != TURNO_MANHA && turno != TURNO_TARDE && turno != TURNO_NOITE)
                throw new Exception("Turno inválido!");
            this.turno = turno;
	}

	public String getNumCarteiraTrabalho() {
            return numCarteiraTrabalho;
	}

	public double getSalario() {
            return salario;
	}

	public void setSalario(double salario) throws Exception{
            if(salario < 0)
                throw new Exception("Salário inválido!");
            this.salario = salario;
	}

	public LocalDate getDataContratacao() {
		return this.dataContratacao;
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
                    System.out.println("manhã");
                    break;
                case TURNO_TARDE:
                    System.out.println("tarde");
                    break;
                default:
                    System.out.println("noite");
                    break;
            }
	}
}
