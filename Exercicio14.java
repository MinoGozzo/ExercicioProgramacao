import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		double valorA, valorB, valorC;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		valorA = leituraDados.nextDouble();
		
		System.out.println("Digite o valor B:");
		valorB = leituraDados.nextDouble();
		
		if (valorA == valorB)
		{
			valorC = valorA + valorB;
			System.out.println("O valor C - a soma de A e B - é igual a: " + valorC);
		} else
		{
			valorC = valorA * valorB;
			System.out.println("O valor C - o produto de A e B - é igual a: " + valorC);
		}
		
		leituraDados.close();
	}

}
