import java.util.Scanner;

public class Exercicio21B {

	public static void main(String[] args) {
		char caractere;
		String tipoCaractere;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite uma letra:");
		caractere = leituraDados.nextLine().charAt(0);
		
		caractere = Character.toUpperCase(caractere);

		
		switch (caractere)
		{
		case 'A':
			tipoCaractere = "vogal";
			break;
			
		case 'E':
			tipoCaractere = "vogal";
			break;
			
		case 'I':
			tipoCaractere = "vogal";
			break;
			
		case 'O':
			tipoCaractere = "vogal";
			break;
			
		case 'U':
			tipoCaractere = "vogal";
			break;			
	
		default:
			tipoCaractere = "consoante ou não é letra";
		
		}
						
		System.out.println("O caractere digitado é " + tipoCaractere +".");
		leituraDados.close();

		}
}
