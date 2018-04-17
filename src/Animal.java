
public class Animal 
{
	private String genero;
	private String especie;
	private String sexo;
	private String nomePopular;
	private String curiosidade;
	private String origem;
	private String[] alimentacaoDiaria = new String[7];
	private int id;
	private int idade;
	
	public Animal(String genero, String especie, String nomePopular, String origem, int id)
	{
		this.genero = genero;
		this.especie = especie;
		this.nomePopular = nomePopular;
		this.origem = origem;
		this.id = id;
	}

	public String getGenero() 
	{
		return genero;
	}
	
	public String getEspecie() 
	{
		return especie;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public String getNomePopular() 
	{
		return nomePopular;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public String getCuriosidade() 
	{
		return curiosidade;
	}
	
	public void setCuriosidade(String curiosidade)
	{
		this.curiosidade = curiosidade;
	}
	
	public String getOrigem() 
	{
		return origem;
	}
	
	public String[] getAlimentacaoDiaria() 
	{
		return alimentacaoDiaria;
	}
	
	public void setAlimentacaoDiaria(String[] alimentacao) 
	{
            System.arraycopy(alimentacao, 0, alimentacaoDiaria, 0, 7);
	}
	
        @Override
	public String toString()
	{
		String saida;
		saida = "- Animal " + id + " -\n";
		saida += "Nome popular: " + nomePopular + "\n";
		saida += "G�nero: " + genero + "\n";
		saida += "Esp�cie: " + especie + "\n";
		saida += "Origem: " + origem + "\n";
		saida += "Curiosidade: " + curiosidade + "\n";
		saida += "Alimentaçãoo: " + alimentacaoDiaria.toString() + "\n";
		
		return saida;
	}
}