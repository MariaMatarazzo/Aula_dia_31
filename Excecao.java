package Aula_31_07;
import java.util.Scanner;
public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		a = 10;
		System.out.println("Digite um numero");
		b = leia.nextInt();
		try {
		c = a/b;
		System.out.println("valor de c: " + c);
		}catch (Exception erro) {
		System.out.println("Não axiste divisão por zero");
		}

	}

}
