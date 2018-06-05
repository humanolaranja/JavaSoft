package Model;

public class GerenciadorId {
    
    //Atributos para guardar os IDs
    private static int contagemAnimal = 0;
    private static int contagemJaula = 0;
    private static int contagemLoja = 0;
    
    //Metodos para conseguir pegar um ID novo e unico
    public static int getAnimalId(){
        contagemAnimal++;
        return contagemAnimal;
    }
    
    public static int getJaulaId(){
        contagemJaula++;
        return contagemJaula;
    }
    
    public static int getLojaId(){
        contagemLoja++;
        return contagemLoja;
    }
}
