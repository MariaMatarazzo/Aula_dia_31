package Aula_31_07;

import java.util.Scanner;

public class Operações {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1=0,valor2=0;
		
		Scanner ler = new Scanner(System.in);
		try {

		System.out.print("Informe o valor 1: ");
		valor1 = ler.nextInt();

		System.out.print("Informe o valor 2: ");
		valor2 = ler.nextInt();

		
		System.out.print("RESULTADOS");
		System.out.print("soma: " + (valor1+valor2));
		System.out.print("subtração: " + (valor1-valor2));
		System.out.print("Multiplicação: " + (valor1*valor2));
		System.out.print("divisão inteira: " + (valor1%valor2));
		System.out.print("divisão exata: " + ((double)valor1 /valor2));
	}
	catch (Exception error) {
		System.out.println("Informe um valor inteiro");
	}
		ler.close();


}
}
