import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		int numero, indice, fatorial;
		
		Scanner leituraDados = new Scanner (System.in);
		
		System.out.println("Digite o número para calcular o fatorial:");
		numero = leituraDados.nextInt();
		
		fatorial = 1;
		
		for (indice = numero; indice > 0; indice--)
		{
			fatorial = fatorial * indice;
		}
		System.out.println(numero + " fatorial é igual a " + fatorial);
		
		leituraDados.close();

	}

}
