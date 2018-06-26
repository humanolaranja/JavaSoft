package Model;

import Controller.GerenciadorId;
import java.time.LocalDate;

public class Animal {    
    
    // Atributos
    private final int id;
    private Especie especie;
    private Jaula jaula;
    private final String sexo;
    private final String[] alimentacaoDiaria;
    private final LocalDate dataEntrada;
    private final LocalDate nascimento;
    private double custoMensal;
        
    public Animal(String especie, String origem, String nomePopular, String curiosidade, String sexo, String[] alimentacaoDiaria, LocalDate nascimento, LocalDate dataEntrada, double custo, Tipo tipo){
        this.id = GerenciadorId.getAnimalId();
        this.sexo = sexo;
        this.alimentacaoDiaria = alimentacaoDiaria;
        this.nascimento = nascimento;
        this.dataEntrada = dataEntrada;
        this.custoMensal = custo;
        this.especie = new Especie(especie, origem, nomePopular, curiosidade, tipo);
    }

    // Construtor sem alimentacao diaria
    public Animal(String especie, String origem, String nomePopular, String curiosidade, String sexo, LocalDate nascimento, LocalDate dataEntrada, double custo, Tipo tipo) {

        this.id = GerenciadorId.getAnimalId();
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.dataEntrada = dataEntrada;
        this.custoMensal = custo;
        this.especie = new Especie(especie, origem, nomePopular, curiosidade, tipo);
        this.alimentacaoDiaria = null;
    }
    
    public Animal(Especie especie, String sexo, LocalDate nascimento, LocalDate dataEntrada, double custo){
        this.id = GerenciadorId.getAnimalId();
        this.especie = especie;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.dataEntrada = dataEntrada;
        this.custoMensal = custo;
        this.alimentacaoDiaria = null;
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

    public String[] getAlimentacaoDiaria() {
        return alimentacaoDiaria;
    }

    public void setAlimentacaoDiaria(String[] alimentacao) {
        System.arraycopy(alimentacao, 0, alimentacaoDiaria, 0, 7);
    }
    
    public double getCustoMensal(){
        return custoMensal;
    }
    
    public void setCustoMensal(double custo){
        custoMensal = custo;
    }
}