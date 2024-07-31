package Aula_31_07;
import java.util.Scanner;
public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler= new Scanner (System.in);
		double x = 0;
		
		try {
		System.out.print("Digite uma nota: ");
		x= ler.nextDouble();
		}
		
		catch (Exception erro) {
			System.out.println("Adicione valores positivos");
			}
		ler.close();

		
		if (x >= 6)
			System.out.println ("Voce esta aprovado");
		
		else if (x<6 && x>=4)
			System.out.println("Exame");
		else
			System.out.println("REPROVADO");
		}
	
		
	}


