import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		double numero, proximoNumero, soma, indice, media;
				
		System.out.println("Digite um número inteiro:");
		Scanner leituraDados = new Scanner(System.in);
		
		numero = leituraDados.nextInt();
		soma = numero;
		for (indice = 1; indice < 7; indice++)
		{
			System.out.println("digite outro número inteiro:");
			proximoNumero = leituraDados.nextInt();
			
			soma = soma + proximoNumero;
		}
		
		media = soma / indice;
		
		System.out.println("A soma dos números digitados é " + soma + " e a média é " + media + ".");
		
		leituraDados.close();

	}

}
