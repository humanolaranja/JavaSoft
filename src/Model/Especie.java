package Model;

public class Especie {
    
    // Atributos
    private String especie;
    private String origem;
    private String nomePopular;
    private String curiosidade;

    // Construtor
    public Especie(String especie, String origem, String nomePopular, String curiosidade) {
        this.especie = especie;
        this.origem = origem;
        this.nomePopular = nomePopular;
        this.curiosidade = curiosidade;
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
    
    
    
}
