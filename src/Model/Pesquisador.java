package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pesquisador extends Funcionario{

    // Variaveis finais
    public static final int GRADUACAO = 1;
    public static final int POS_GRADUACAO = 2;
    public static final int PROFESSOR = 3;

    // Atributos
    private int tipo;
    private ArrayList<Animal> animaisPesquisa;

    // Construtores
    public Pesquisador(String nome, String rg, String cpf, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, 
            LocalDate dataContratacao, int tipo, ArrayList<Animal> animaisPesquisa) throws Exception {
        super(nome, rg, cpf, nascimento, turno, numCarteiraTrabalho, salario, dataContratacao, "Pesquisador");

        if(tipo != GRADUACAO && tipo != POS_GRADUACAO && tipo != PROFESSOR)
            throw new Exception("Tentativa de criar novo pesquisador com tipo inexistente!");
        this.animaisPesquisa = animaisPesquisa;
    }
    
    public Pesquisador(String nome, String rg, String cpf, LocalDate nascimento, int turno, String numCarteiraTrabalho, double salario, 
            LocalDate dataContratacao, int tipo) throws Exception {
        super(nome, rg, cpf, nascimento, turno, numCarteiraTrabalho, salario, dataContratacao, "Pesquisador");

        if(tipo != GRADUACAO && tipo != POS_GRADUACAO && tipo != PROFESSOR)
            throw new Exception("Tentativa de criar novo pesquisador com tipo inexistente!");
        this.animaisPesquisa = new ArrayList<>();
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Animal> getAnimaisPesquisa() {
        return this.animaisPesquisa;
    }

    public void setAnimaisPesquisa(ArrayList<Animal> animaisPesquisa) {
        this.animaisPesquisa = animaisPesquisa;
    }

    // Adiciona um animal a lista
    public void adicionarAnimal(Animal a) {
        getAnimaisPesquisa().add(a);
    }

    // Remove um animal da posicao i
    public void removerAnimal(int i) {
        getAnimaisPesquisa().remove(i);
    }
}
