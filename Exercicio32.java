import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		double soma, entrada;
		
		soma = 0;
		
		Scanner leituraDados = new Scanner(System.in);
		
		for (int indice = 1; indice < 6; indice++)
		{
			System.out.println("Digite um número:");
			entrada = leituraDados.nextDouble();
			
			soma = soma + entrada;
		}
		
		System.out.println("A soma dos números digitados é " + soma);
		
		leituraDados.close();

	}

}
