import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		double numero, constantePar;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero = leituraDados.nextDouble();
		
		constantePar = 2;
		
		if (numero % constantePar == 0)
		{
			System.out.println("O número digitado é par.");
		} else
		{
			System.out.println("O número digitado é impar.");
		}
			
		leituraDados.close();
		
	}

}
