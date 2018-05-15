package Model;

import java.util.ArrayList;

public class Jaula {
	private final int numMaxAnimais;
        private final int id;
	private final ArrayList<Animal> animais;
        
        public Jaula(int numMaxAnimais, int id) throws Exception{
            if(numMaxAnimais < 0)
                throw new Exception("Tentativa de criar nova jaula com 'numMaxAnimais < 0'");
            this.numMaxAnimais = numMaxAnimais;
            this.animais = new ArrayList<>();
            this.id = id;
        }
	
	public int getNumMaxAnimais(){
            return this.numMaxAnimais;
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
	
	public void addAnimal(Animal novo) throws Exception {
            if(this.animais.size() < this.numMaxAnimais) 
		animais.add(novo);
            else
                throw new Exception("A jaula já está cheia.");
        }
	
	public void removeAnimal(Animal alvo) throws Exception {
            if(this.animais.contains(alvo)) 
            	this.animais.remove(alvo);
            else
		throw new Exception("O animal desejado não está nessa jaula.");
	}
	
        @Override
	public String toString() {
		String saida;
		saida = "- Jaula " + this.id + " -\n";
		saida += "Capacidade: " + this.animais.size() + "/" + numMaxAnimais + "\n";
		saida += "Animais: " + this.animais.toString() + "\n";
		
		return saida;
	}
}