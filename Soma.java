package Aula_31_07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler =new Scanner (System.in);

		int numero, soma=0;
		int i = 1;


		ArrayList<Integer> numeros  = new ArrayList<>();


		while(i <=5) {
			System.out.print(">>>> Insira a nota: ");
			numero = ler.nextInt();
			numeros.add(numero);

			soma= soma+numero;
			i ++;

		}

		
			System.out.println("A soma é: " + soma);

		


	}

}
