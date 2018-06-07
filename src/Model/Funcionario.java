package Model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
    // Variaveis finais
    public static final int TURNO_MANHA = 1;
    public static final int TURNO_TARDE = 2;
    public static final int TURNO_NOITE = 3;

    // Atributos    
    private String cpf;
    private final LocalDate dataContratacao;
    private final String numCarteiraTrabalho;
    private int turno;
    private double salario;
    private String setor;

    // Construtor
    public Funcionario (String primeiroNome, String sobrenome, String rg, String cpf, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, LocalDate dataContratacao, String setor){
        super(primeiroNome, sobrenome, rg, nascimento);

        this.cpf = cpf;
        this.turno = turno;
        this.numCarteiraTrabalho = numCarteiraTrabalho;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.setor = setor;
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

    public String getTurnoString(){
        switch (this.getTurno()) {
            case 1:
                return "Manhã";
            case 2:
                return "Tarde";
            default:
                return "Noite";
        }
    }        

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
