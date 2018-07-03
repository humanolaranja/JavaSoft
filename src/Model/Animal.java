package Model;

import Controller.GerenciadorId;
import java.time.LocalDate;

public class Animal implements Contem, Comparable<Animal>{    
    
    // Atributos
    private final int id;
    private Especie especie;
    private Jaula jaula;
    private String sexo;
    private LocalDate dataEntrada;
    private LocalDate nascimento;
    private double custoMensal;
        
    public Animal(String especie, String origem, String nomePopular, String curiosidade, String sexo, LocalDate nascimento, LocalDate dataEntrada, double custo, Tipo tipo){
        this.id = GerenciadorId.getAnimalId();
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.dataEntrada = dataEntrada;
        this.custoMensal = custo;
        this.especie = new Especie(especie, origem, nomePopular, curiosidade, tipo);
    }
    
    public Animal(Especie especie, String sexo, LocalDate nascimento, LocalDate dataEntrada, double custo){
        this.id = GerenciadorId.getAnimalId();
        this.especie = especie;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.dataEntrada = dataEntrada;
        this.custoMensal = custo;
    }

    // getters e setters
    public Especie getEspecieObj() {
        return especie;
    }

    public void setEspecieObj(Especie especie) {
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public Jaula getJaula() {
        return jaula;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getSexo(){
        return sexo;
    }

    public int getIdade() {
        if(this.nascimento == null)
            return 0;
        return LocalDate.now().minusYears(nascimento.getYear()).minusDays(nascimento.getDayOfYear()).getYear();
    }
    
    public double getCustoMensal(){
        return custoMensal;
    }
    
    public void setCustoMensal(double custo){
        custoMensal = custo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
    public String getDataEntradaString() {
        return this.dataEntrada.getDayOfMonth() + "/" + this.dataEntrada.getMonthValue() + "/" + this.dataEntrada.getYear();
    }
    
    public String getNascimentoString() {
        return this.nascimento.getDayOfMonth() + "/" + this.nascimento.getMonthValue() + "/" + this.nascimento.getYear();
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Verifica se o objeto contem alguma string nos seus atributos
    @Override
    public boolean contem(String string){
        if(String.valueOf(this.getId()).contains(string) || this.getSexo().toLowerCase().contains(string.toLowerCase()) || this.getDataEntradaString().contains(string) ||
           this.getNascimentoString().contains(string) || String.valueOf(this.custoMensal).contains(string) || this.especie.getEspecie().toLowerCase().contains(string.toLowerCase()) ||
           this.especie.getNomePopular().toLowerCase().contains(string.toLowerCase()) || this.especie.getOrigem().toLowerCase().contains(string.toLowerCase()))
            return true;
        else
            return false;
    }

    // Ordenar os animais por ordem crescente de ID
    @Override
    public int compareTo(Animal a) {
        if(this.getId() < a.getId())
            return -1;
        else if(this.getId() > a.getId())
            return 1;
        else
            return 0;
    }
}