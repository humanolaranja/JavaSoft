import java.util.ArrayList;

public class Jaula 
{
	private int numMaxAnimais;
	private int numAtualAnimais;
	private int id;
	private ArrayList<Animal> animais = new ArrayList<>();
	
	public int getNumMaxAnimais()
	{
            return numMaxAnimais;
	}
	
	public int getNumAtualAnimais()
	{
            return numAtualAnimais;
	}
	
	public void setId(int id)
	{
            this.id = id;
	}
	
	public int getId()
	{
            return id;
	}
	
	public ArrayList<Animal> getAnimais()
	{
            return animais;
	}
	
	public void addAnimal(Animal novo)
	{
            if(numAtualAnimais < numMaxAnimais)
            {
		animais.add(novo);
		numAtualAnimais++;
	}
	else
            System.out.println("A jaula já está cheia.");
	}
	
	public void removeAnimal(Animal alvo)
	{
            if(animais.contains(alvo))
            {
            	animais.remove(alvo);
		numAtualAnimais--;
            }
            else
		System.out.println("O animal desejado não está nessa jaula.");
	}
	
        @Override
	public String toString()
	{
		String saida;
		saida = "- Jaula " + id + " -\n";
		saida += "Capacidade: " + numAtualAnimais + "/" + numMaxAnimais + "\n";
		saida += "Animais: " + animais.toString() + "\n";
		
		return saida;
	}
}