import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		int indice, numeroSeguinte, numeroMaior;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		numeroMaior = leituraDados.nextInt();
		
		for (indice = 1; indice < 5; indice++)
		{
			System.out.println("Digite outro número inteiro:");
			numeroSeguinte = leituraDados.nextInt();
			
			numeroMaior = Math.max(numeroMaior, numeroSeguinte);
		}
		
		System.out.println("O maior dos números digitádos é: " + numeroMaior);
		
		leituraDados.close();

	}

}
