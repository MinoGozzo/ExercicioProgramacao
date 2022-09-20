import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		double numero, antecessor;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		
		numero = leituraDados.nextDouble();
		
		antecessor = numero --;
		
		System.out.println("O número digitado foi "+numero+" e seu antecessor é " + antecessor + ".");
		
		leituraDados.close();		
		
		
	}
	

}	
