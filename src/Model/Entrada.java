package Model;

public enum Entrada {
    COMUM(10), MEIA(5), ESPECIAL(0), ASSOCIADOCOMUM(6), ASSOCIADOMEIA(3);
    
    double valor;
    
    Entrada(int v){
        this.valor = v;
    }

    public double getValor() {
        return valor;
    }
}
