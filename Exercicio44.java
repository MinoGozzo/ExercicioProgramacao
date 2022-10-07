import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		int tabuada, numeroDeTabuadas, numero;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o número de tabuadas a serem mostradas");
		numeroDeTabuadas = leituraDados.nextInt();
		
		for (int indice1 = 1; indice1 <= numeroDeTabuadas; indice1++)
		{
			System.out.println("Digite a próxima tabuada a ser mostrada:");
			numero = leituraDados.nextInt();
			for (int indice2 = 0 ; indice2 <= 10 ; indice2++)
			{
				tabuada = numero * indice2;
				System.out.println(numero + " X " + indice2 + " = " + tabuada);
			}
		}
		leituraDados.close();
	}

}
