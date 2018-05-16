package Model;

import java.time.LocalDate;

public class Animal {
    
    	private final int id;
	private final String especie;
	private final String sexo;
	private final String nomePopular;
	private final String origem;
	private final String[] alimentacaoDiaria;
	private final LocalDate nascimento;
	private String curiosidade;
        
	public Animal(int id, String especie, String sexo, String nomePopular, String origem, String[] alimentacaoDiaria, LocalDate nascimento) throws NullPointerException{
            
            if(especie == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'especie == null'");
            if(sexo == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'sexo == null'");
            if(nomePopular == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'nomePopular == null'");
            if(origem == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'origem == null'");
            if(alimentacaoDiaria == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'alimentacaoDiaria == null'");
            if(nascimento == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'nascimento == null'");
            
            this.id = id;
            this.especie = especie;
            this.sexo = sexo;
            this.nomePopular = nomePopular;
            this.origem = origem;
            this.alimentacaoDiaria = alimentacaoDiaria;
            this.nascimento = nascimento;
            this.curiosidade = null;
	}
        
        public Animal(int id, String especie, String sexo, String nomePopular, String origem, String[] alimentacaoDiaria, LocalDate nascimento, String curiosidade) {
            
            if(especie == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'especie == null'");
            if(sexo == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'sexo == null'");
            if(nomePopular == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'nomePopular == null'");
            if(origem == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'origem == null'");
            if(alimentacaoDiaria == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'alimentacaoDiaria == null'");
            if(nascimento == null)
                throw new NullPointerException("Tentativa de criar um novo animal com 'nascimento == null'");
            
            this.id = id;
            this.especie = especie;
            this.sexo = sexo;
            this.nomePopular = nomePopular;
            this.origem = origem;
            this.alimentacaoDiaria = alimentacaoDiaria;
            this.nascimento = nascimento;
            this.curiosidade = curiosidade;
	}
	
	public String getEspecie() {
            return especie;
	}
	
	public String getSexo(){
            return sexo;
	}
	
	public String getNomePopular() {
            return nomePopular;
        }
	
	public int getIdade() {
            if(this.nascimento == null)
                return 0;
            return LocalDate.now().minusYears(nascimento.getYear()).minusDays(nascimento.getDayOfYear()).getYear();
	}
	
	public String getCuriosidade() {
            return curiosidade;
	}
	
	public void setCuriosidade(String curiosidade){
            this.curiosidade = curiosidade;
	}
	
	public String getOrigem() {
            return origem;
	}
	
	public String[] getAlimentacaoDiaria() {
            return alimentacaoDiaria;
	}
	
	public void setAlimentacaoDiaria(String[] alimentacao) {
            System.arraycopy(alimentacao, 0, alimentacaoDiaria, 0, 7);
	}
	
        @Override
	public String toString(){
            String saida;
            saida = "- Animal " + id + " -\n";
            saida += "Nome popular: " + nomePopular + "\n";
            saida += "Espécie: " + especie + "\n";
            saida += "Origem: " + origem + "\n";
            saida += "Curiosidade: " + curiosidade + "\n";
            saida += "Alimentaçãoo: " + alimentacaoDiaria.toString() + "\n";

            return saida;
	}
}