import java.time.LocalDate;

public class Pessoa {
	
    // Atributos
    private String nome;
    private String rg;
    private LocalDate dataNascimento;

    // Metodos:

    // Construtor
    public Pessoa(String nome, String rg, LocalDate nascimento){
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = nascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate nascimento) {
        this.dataNascimento = nascimento;
    }

    public void imprimirDados() {
        System.out.println("-Nome: " + getNome());
        System.out.println("-RG: " + getRg());
        System.out.println("-Data de nascimento: " + this.getDataNascimento().toString());
        System.out.println();
    }
}
