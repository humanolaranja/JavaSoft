package Model;

public enum Porte {
    PEQUENO(20), MEDIO(100), GRANDE(400);
    
    private final int tamanhoMinimo;
    
    Porte(int tamanho){
        this.tamanhoMinimo = tamanho;
    }
    
    public int getTamanhoMinimo(){
        return this.tamanhoMinimo;
    }
}
