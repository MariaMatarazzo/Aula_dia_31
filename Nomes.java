package Aula_31_07;
import java.util.ArrayList;
public class Nomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>nomes = new ArrayList<>(2);
		try {
			
		
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");
	
	
		System.out.println("Nome: "+nomes.get(2));
		
		}
		catch (Exception erro) {
			System.out.println("Erro");
		}
		

	}

}

