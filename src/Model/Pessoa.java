package Model;

import java.time.LocalDate;

public abstract class Pessoa {
	
    // Atributos
    private String primeiroNome;
    private String sobrenome;
    private String rg;
    private LocalDate dataNascimento;

    // Construtor
    public Pessoa(String primeiroNome, String sobrenome, String rg, LocalDate nascimento) throws NullPointerException{
        if(primeiroNome == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'primeiroNome == null'");
        if(sobrenome == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'sobrenome == null'");
        if(rg == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'rg == null'");
        if(nascimento == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'nascimento == null'");
        
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataNascimento = nascimento;
    }

    // getters e setters
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public String getRg() {
        return this.rg;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Retorna a idade atual da pessoa
    public int getIdade(){
        if(this.dataNascimento == null)
            return 0;
        return LocalDate.now().minusYears(dataNascimento.getYear()).minusDays(dataNascimento.getDayOfYear()).getYear();
    }
}
