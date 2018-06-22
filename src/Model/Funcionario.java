package Model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
    // Variaveis finais
    public static final int TURNO_MANHA = 1;
    public static final int TURNO_TARDE = 2;
    public static final int TURNO_NOITE = 3;

    // Atributos    
    private String cpf;
    private LocalDate dataContratacao;
    private String numCarteiraTrabalho;
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

    public void setTurno(int turno){
        this.turno = turno;
    }

    public String getNumCarteiraTrabalho() {
        return numCarteiraTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
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

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setNumCarteiraTrabalho(String numCarteiraTrabalho) {
        this.numCarteiraTrabalho = numCarteiraTrabalho;
    }
    
    public String getDataContratacaoString(){
        return this.dataContratacao.getDayOfMonth() + "/" + this.dataContratacao.getMonthValue() + "/" + this.dataContratacao.getYear(); 
    }
    
    public boolean contem(String string){
        if(this.getPrimeiroNome().toLowerCase().contains(string.toLowerCase()) || this.getSobrenome().toLowerCase().contains(string.toLowerCase()) || 
           this.getDataNascimentoString().toLowerCase().contains(string.toLowerCase()) || this.getCpf().toLowerCase().contains(string.toLowerCase()) ||
           this.getRg().toLowerCase().contains(string.toLowerCase()) || this.getNumCarteiraTrabalho().toLowerCase().contains(string.toLowerCase()) || 
           String.valueOf(this.getSalario()).contains(string) || this.getSetor().toLowerCase().contains(string.toLowerCase()) || this.getTurnoString().toLowerCase().contains(string.toLowerCase()) ||
           this.getDataContratacaoString().contains(string))
            return true;
        else
            return false;
    }
}
