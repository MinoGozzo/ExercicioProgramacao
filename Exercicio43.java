import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		int numero, tabuada, chaoCalculo, tetoCalculo;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada:");
		numero = leituraDados.nextInt();
		
		System.out.println("Selecione o intervalo a ser mostrado:");
		
		chaoCalculo = leituraDados.nextInt();
		tetoCalculo = leituraDados.nextInt();
		
		if (chaoCalculo < 0 || tetoCalculo > 10 || chaoCalculo > tetoCalculo)
		{
			System.out.println("Intervalo invalido.");
		}
		else
		{
			for (int indice = chaoCalculo; indice <= tetoCalculo; indice++)
			{
				tabuada = numero * indice;
				System.out.println(numero + " X " + indice + " = " + tabuada);
			}
		}
		
		leituraDados.close();

	}

}
