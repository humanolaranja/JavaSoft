package Model;

import java.time.LocalDate;

public class Pessoa {
	
    // Atributos
    private final String nome;
    private final String rg;
    private final LocalDate dataNascimento;

    // Metodos:

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

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    
    public int getIdade(){
        if(this.dataNascimento == null)
            return 0;
        return LocalDate.now().minusYears(dataNascimento.getYear()).minusDays(dataNascimento.getDayOfYear()).getYear();
    }

    public void imprimirDados() {
        System.out.println("-Nome: " + getNome());
        System.out.println("-RG: " + getRg());
        System.out.println("-Data de nascimento: " + this.getDataNascimento().toString());
    }
}
