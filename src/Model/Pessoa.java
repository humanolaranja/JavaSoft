package Model;

import java.time.LocalDate;

public abstract class Pessoa {
	
    // Atributos
    private String nome;
    private String rg;
    private LocalDate dataNascimento;

    // Construtor
    public Pessoa(String nome, String rg, LocalDate nascimento) throws NullPointerException{
        if(nome == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'nome == null'");
        if(rg == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'rg == null'");
        if(nascimento == null)
            throw new NullPointerException("Tentativa de criar uma nova pessoa com 'nascimento == null'");
        
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = nascimento;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
