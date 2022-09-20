import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		double valorA, valorB, valorC;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		valorA = leituraDados.nextDouble();
		
		System.out.println("Digite o valor B:");
		valorB = leituraDados.nextDouble();
		
		System.out.println("Digite o valor C");
		valorC = leituraDados.nextDouble();
		
		if (valorA+valorB > valorC)
		{
			System.out.println("A soma dos valores A e B é maior do que o valor C.");
		
		} else
		{
			System.out.println("O valor C é maior do que a soma dos valores A e B.");
		}
		
		leituraDados.close();
			
	}

}
