package Aula_31_07;
import java.util.Scanner;
public class Exceção2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);

				double v1=0, v2=0, v3 = 0;
				try {

				System.out.print("Informe o valor 1: ");
				v1=ler.nextDouble();

				System.out.print("informe o valor 2: ");
                v2=ler.nextDouble();
                
                
				System.out.print("Informe o valor 3: ");
                v3=ler.nextDouble();
				}
                
                catch (Exception erro) {
            		System.out.println("ERRO!!! Informe valores validos");

				if (v1== v2 && v1== v3)
                  System.out.print(" Todos iguais");
				
				else if (v1> v2 && v1 > v3)
                  System.out.print("0 1ª Valor é o maior " + v1);

                else if (v2> v3)
                	  System.out.print(" o 2ª Valor é o Maior "+v2);

				else System.out.print("03 Valor é o Maior"+ v3);

				ler.close();


	}

}
}
