import java.util.Scanner;

public class Exercicio21 {

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
			switch (caractere)
			{
			case 'Q':
				tipoCaractere = "consoante";
				break;
				
			case 'W':
				tipoCaractere = "consoante";
				break;
			
			case 'R':
				tipoCaractere = "consoante";
				break;
			
			case 'T':
				tipoCaractere = "consoante";
				break;
			
			case 'Y':
				tipoCaractere = "consoante";
				break;
				
			case 'P':
				tipoCaractere = "consoante";
				break;
				
			case 'S':
				tipoCaractere = "consoante";
				break;
			
			case 'D':
				tipoCaractere = "consoante";
				break;
				
			case 'F':
				tipoCaractere = "consoante";
				break;
				
			case 'G':
				tipoCaractere = "consoante";
				break;
			
			case 'H':
				tipoCaractere = "consoante";
				break;
			
			case 'J':
				tipoCaractere = "consoante";
				break;
				
			case 'K':
				tipoCaractere = "consoante";
				break;
				
			case 'L':
				tipoCaractere = "consoante";
				break;
				
			case 'Ç':
				tipoCaractere = "consoante";
				break;
			
			case 'Z':
				tipoCaractere = "consoante";
				break;
			
			case 'X':
				tipoCaractere = "consoante";
				break;
			
			case 'C':
				tipoCaractere = "consoante";
				break;
			
			case 'V':
				tipoCaractere = "consoante";
				break;
			
			case 'B':
				tipoCaractere = "consoante";
				break;
			
			case 'N':
				tipoCaractere = "consoante";
				break;
			
			case 'M':
				tipoCaractere = "consoante";
				break;
			default:
				tipoCaractere = "não é uma letra";
			}
		
		}
						
		System.out.println("O caractere digitado é " + tipoCaractere +".");
		leituraDados.close();

		}
}
