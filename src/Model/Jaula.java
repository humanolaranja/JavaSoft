package Model;

import Controller.GerenciadorId;
import java.util.ArrayList;

public class Jaula {
    private final double tamanho;
    private final Tipo tipo;
    private double custoMensal;
    private final int id;
    private final ArrayList<Animal> animais;
        
    // Construtor
    public Jaula(double tamanho, double custo, Tipo tipo){
        this.tamanho = tamanho;
        this.animais = new ArrayList<>();
        this.id = GerenciadorId.getJaulaId();
        this.custoMensal = custo;
        this.tipo = tipo;
    }
	
    // getters e setters
    public Tipo getTipo() {
        return tipo;
    }
    
    public double getTamanho() {
        return tamanho;
    }

    public int getId(){
        return id;
    }

    public int getNumAtualAnimais(){
        return animais.size();
    }

    public ArrayList<Animal> getAnimais(){
        return this.animais;
    }

    public void addAnimal(Animal novo){
        
    }

    public void removeAnimal(Animal alvo){
        if(this.animais.contains(alvo)) 
            this.animais.remove(alvo);
    }

    public double getCustoMensal(){
        return custoMensal;
    }

    public void setCustoMensal(double custo){
        custoMensal = custo;
    }

    public double custoTotal(){
        double custo=0;
        for(Animal a : animais)
            custo+= a.getCustoMensal();

        custo+= this.getCustoMensal();
        return custo;
    }
}