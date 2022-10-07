import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		int  base, expoente, potencia;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("digite o valor da base:");
		base = leituraDados.nextInt();
		
		System.out.println("Digite o valor do expoente:");
		expoente = leituraDados.nextInt();
		
		if (expoente == 0)
		{
			System.out.println("Qualquer número elevado a zero resulta o valor 1.");
		}
		else
		{
			potencia = 1;
			for (int indice = 1; indice <= expoente; indice++)
				{
					potencia = potencia * base;
				}
			System.out.println(base + " elevado a " + expoente + " é igual a " + potencia + ".");
		}
		leituraDados.close();
		

	}

}
