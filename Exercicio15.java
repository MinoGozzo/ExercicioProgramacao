import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		double valorA, valorB, valorC;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		valorA = leituraDados.nextDouble();
		
		System.out.println("Digite o valor B");
		valorB = leituraDados.nextDouble();
		
		System.out.println("Digite o valor C");
		valorC = leituraDados.nextDouble();
		
		if (valorA == valorB || valorA == valorC || valorB == valorC)
		{
			System.out.println("Os três valores não são distintos");
		} 
		else
		{
			if (valorA > valorB && valorA > valorC)
			{
				if (valorB > valorC)
				{
					System.out.println("Os números do maior para o menor são: " + valorA + ", " + valorB + ", " + valorC + ".");
				}
				else
				{
					System.out.println("Os números do maior para o menor são: " + valorA + ", " + valorC + ", " + valorB + ".");
				}
					
			}
			if (valorB > valorA && valorB > valorC)
			{
				if (valorA > valorC)
				{
					System.out.println("Os números do maior para o menor são: " + valorB + ", " + valorA + ", " + valorC + ".");
				}
				else
				{
					System.out.println("Os números do maior para o menor são: " + valorB + ", " + valorC + ", " + valorA + ".");
				}
			}
			if (valorC > valorA && valorC > valorB)
			{
				if (valorA > valorB)
				{
					System.out.println("Os números do maior para o menor são: " + valorC + ", " + valorA + ", " + valorB + ".");
				}
				else
				{
					System.out.println("Os números do maior para o menor são: " + valorC + ", " + valorB + ", " + valorA + ".");
				}
			}
			
			leituraDados.close();
		}
		
		
		
		

	}

}
