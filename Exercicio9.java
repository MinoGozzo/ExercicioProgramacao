import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		int constanteTeste, numero;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		numero = leituraDados.nextInt();
		
		constanteTeste = 5;
		
		if(numero%constanteTeste==0)
		{
			System.out.println("O número digitado é multiplo de 5.");
		} 
		
		else 
		{
			System.out.println("O número digitado não é multiplo de 5.");
		}
		leituraDados.close();		
		
		
	}
	

}
