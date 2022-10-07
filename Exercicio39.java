import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		int primeiroNumero, segundoNumero, indice;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		primeiroNumero = leituraDados.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		segundoNumero = leituraDados.nextInt();
		
		if (primeiroNumero == segundoNumero)
		{
			System.out.println("Não há intervalo.");
		}
		else
		{
			for (indice = Math.min(primeiroNumero, segundoNumero); indice <= Math.max(primeiroNumero, segundoNumero); indice++)
			{
				System.out.print(indice + ", ");	
			}

		}
		leituraDados.close();
		

	}

}
