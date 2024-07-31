package Aula_31_07;
import java.util.Scanner;
import java.util.ArrayList;
public class Sair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>numeros = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		System.out.println("***************************");
		System.out.println("Digite o valor 0 pra sair: ");
		System.out.println("***************************");

		int i=1,soma=0,numero;
		while (i != 0) {
			System.out.println("Informe o valor a ser somado: ");
			i = ler.nextInt();
			numeros.add(i);

		}
		for(int n: numeros) {
			soma=  soma + n;
		}
		
		System.out.println("Lista numeros é: "+ numeros);
		System.out.println("Lista numeros é: "+ soma);



	}

}
