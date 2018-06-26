package Model;

public class Especie {
    
    // Atributos
    private String especie;
    private String origem;
    private String nomePopular;
    private String curiosidade;
    private Tipo tipo;

    // Construtor
    public Especie(String especie, String origem, String nomePopular, String curiosidade, Tipo tipo) {
        this.especie = especie;
        this.origem = origem;
        this.nomePopular = nomePopular;
        this.curiosidade = curiosidade;
        this.tipo = tipo;
    }

    // getters e setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
