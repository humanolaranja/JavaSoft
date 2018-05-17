package Model;

import java.time.LocalDate;

public class Visitante extends Pessoa{
	
	// Variaveis finais
	public static final boolean ASSOCIADO = true;
	public static final boolean NAO_ASSOCIADO = false;
	
	// Atributos
	private LocalDate dataDaUltimaVisita;
	private LocalDate dataAssociado;
	private boolean associado;

	// Construtor
	public Visitante (String nome, String rg, LocalDate nascimento, LocalDate dataDaUltimaVisita, boolean associado, LocalDate dataAssociado) throws Exception{
            super(nome, rg, nascimento);
            if(associado && dataAssociado == null)
                throw new Exception("Tentativa de criar novo visitante associado com 'dataAssociado == null'");
            if(associado){
                this.associado = associado;
                this.dataAssociado = dataAssociado;
            }else{
                this.associado = associado;
                this.dataAssociado = null;
            }
            this.dataDaUltimaVisita = dataDaUltimaVisita;
        }

	// Getters e setters
	public LocalDate getDataDaUltimaVisita() {
            return this.dataDaUltimaVisita;
	}

	public void setDataDaUltimaVisita(LocalDate dataDaUltimaVisita) {
            this.dataDaUltimaVisita = dataDaUltimaVisita;
	}

	public LocalDate getDataAssociado() {
            return this.dataAssociado;
	}

	public void setDataAssociado(LocalDate dataAssociado) {
            this.dataAssociado = dataAssociado;
	}

	public boolean isAssociado() {
            return this.associado;
	}

	public void setAssociado(boolean associado, LocalDate dataAssociado) throws Exception {
            if(associado && dataAssociado == null)
                throw new Exception("Tentativa mudara o status de um visitante para associado com 'dataAssociado == null'");
            if(associado){
                this.associado = associado;
                this.dataAssociado = dataAssociado;
            }else{
                this.associado = associado;
                this.dataAssociado = null;
            }
	}
	
	// Imprimir os dados
	@Override
	public void imprimirDados() {
            System.out.println("### Visitante ###");
            System.out.println("Nome: " + this.getNome());
            System.out.println("RG: " + this.getRg());
            System.out.println("Data de nascimento: " + this.getDataNascimento().toString());
            System.out.print("Associado: ");
            if(this.isAssociado() == ASSOCIADO) {
            	System.out.println("sim");
            }else {
            	System.out.println("não\n");
            }
            if(this.isAssociado() == ASSOCIADO)
            	System.out.println("Data de associação: " + this.getDataAssociado().toString());
		System.out.println();
	}
}
