import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		char caractere;
		double primeiroNumero, segundoNumero, resultado = 0;

		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		primeiroNumero = leituraDados.nextDouble();
		
		System.out.println("Digite outro número:");
		segundoNumero = leituraDados.nextDouble();

		System.out.println("Digite o sinal da operação desejada:");
		caractere = leituraDados.next().charAt(0);

		
		switch (caractere)
		{
		case '+':
			resultado = primeiroNumero + segundoNumero;
			break;
			
		case '-':
			resultado = primeiroNumero - segundoNumero;
			break;
			
		case '*':
			resultado = primeiroNumero * segundoNumero;
			break;
			
		case '/':
			resultado = primeiroNumero / segundoNumero;
			break;
			
		default:
			System.out.println("Operação não reconhecida");
		
		}
						
		System.out.println("O resultado da operação é " + resultado + ".");
		leituraDados.close();

		}
}
