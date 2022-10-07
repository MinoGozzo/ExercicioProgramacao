import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		int numero, pares, impares;
		
		Scanner leituraDados = new Scanner(System.in);
		
		pares = 0;
		impares = 0;
		
		for (int indice = 1; indice <= 10; indice++)
		{
			numero = leituraDados.nextInt();
			
			if (numero % 2 == 0)
			{
				pares = pares+1;
			}
			else
			{
				impares = impares+1;
			}
		}
		System.out.println("A lita tem um total de " + pares + " números pares e " + impares + " impares.");
		
		leituraDados.close();
	}
}
