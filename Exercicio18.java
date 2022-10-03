import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		String nomeAnimal;

		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o nomede uma animal:");
		nomeAnimal = leituraDados.nextLine();
		
		switch (nomeAnimal)
		{
		case "Gato":
			System.out.println("Miau");
			break;
			
		case "Cachorro":
			System.out.println("Au Au");
			break;
			
		case "Pato":
			System.out.println("Qua Qua");
			break;
			
		default:
			System.out.println("Animal não reconhecido");
		}
		
		leituraDados.close();

	}
}
