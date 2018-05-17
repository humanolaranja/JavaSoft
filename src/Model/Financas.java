package Model;

import java.util.ArrayList;

public class Financas {
	//Atributos
	private static ArrayList<Setor> setor = new ArrayList<Setor>();
	private static int totalDespesas = 0;
	private static int totalGanhos = 0;
	
	//Metodos
	//Para adicionar e remover um novo setor
	public static void addSetor(int id, String nome, int despesas, int ganhos) {
		Setor setorNovo = new Setor(id, nome);
		setor.add(setorNovo);
		setorNovo.setDespesas(despesas);
		setorNovo.setGanhos(ganhos);
	}

	public static void removeSetor(Setor setorVelho) {
		setor.remove(setorVelho);
		updateDespesas();
		updateGanhos();
	}
	
	//Para obter um setor desejado pelo id ou pelo nome
	public static Setor getSetor(int id) {
		for(int i=0; i<setor.size(); i++)
			if(setor.get(i).getId() == id)
				return setor.get(i);
		
		return null;
	}
	
	public static Setor getSetor(String nome) {
		for(int i=0; i<setor.size(); i++)
			if(setor.get(i).getNome() == nome)
				return setor.get(i);
		
		return null;
	}
	
	//Getters e setters
	public static int getTotalDespesas() {
		return totalDespesas;
	}
	
	public static void updateDespesas() {
		int total=0;
		for(int i=0; i<setor.size(); i++)
			total+= setor.get(i).getDespesas();
		
		totalDespesas = total;
	}

	public static int getTotalGanhos() {
		return totalGanhos;
	}
	
	public static void updateGanhos() {
		int total=0;
		for(int i=0; i<setor.size(); i++)
			total+= setor.get(i).getGanhos();
		
		totalGanhos = total;
	}
	
	//Imprime as informacoes geral e de cada setor
	public static void imprimirFinancas() {
		String out;
		Setor setorAtual;
		float porcentagemGanhos, porcentagemDespesas, porcentagemLucro;
		
		//Impimind o primeiro bloco de informacoes
		System.out.println("#Financas Gerais: \n   Ganhos: " + getTotalGanhos() + "\n   Despesas: " + getTotalDespesas() + "\n   Lucro: " + (getTotalGanhos()-getTotalDespesas()) + "\n");
		
		//Imprimindo um bloco para cada setor e testando se o divisor nao e zero
		for(int i=0; i<setor.size(); i++) {
			setorAtual = setor.get(i);
			porcentagemGanhos = (getTotalGanhos() == 0 ? 0 : (setorAtual.getGanhos()*100)/getTotalGanhos());
			porcentagemDespesas = (getTotalDespesas() == 0 ? 0 : (setorAtual.getDespesas()*100)/getTotalDespesas());
			porcentagemLucro = ((getTotalGanhos()-getTotalDespesas() == 0 ? 0 : (setorAtual.getGanhos()-setorAtual.getDespesas())*100/(getTotalGanhos()-getTotalDespesas())));
			
			out = setorAtual.getNome() + " (" + setorAtual.getId() + ")\n";
			out+= "Este setor representa " + porcentagemGanhos + "% dos ganhos, " + porcentagemDespesas + "% das despesas e " + porcentagemLucro + "% do lucro.\n";
			out+= "   Ganhos: " + setorAtual.getGanhos() + "\n   Despesas: " + setorAtual.getDespesas() + "\n   Lucro: " + (setorAtual.getGanhos()-setorAtual.getDespesas()) + "\n";
			System.out.println(out);
		}
	}
	
	//Classe setor
	public static class Setor{
		//Atributos
		private int id;
		private String nome;
		private int despesas;
		private int ganhos;
		
		//Construtor
		public Setor(int id, String nome) {
			this.id = id;
			this.nome = nome;
		}
		
		//Getters e setters
		public int getDespesas() {
			return despesas;
		}

		public void setDespesas(int despesas) {
			this.despesas = despesas;
			updateDespesas();
		}
		
		public int getGanhos() {
			return ganhos;
		}
		
		public void setGanhos(int ganhos) {
			this.ganhos = ganhos;
			updateGanhos();
		}
		
		public int getId() {
			return id;
		}
		
		public String getNome() {
			return nome;
		}
	}
}
