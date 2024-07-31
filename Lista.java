package Aula_31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numeros = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		
		int i=1;
		while (i != 0) {
			System.out.println("Informe o valor a ser somado: ");
			i = ler.nextInt();
			if (i!= 0) {
			numeros.add(i);
		}
		for (int numero: numeros) {
			if ( numero%2==0) {
		  System.out.println(numero);
			
		}
		}
		}
	}
}



