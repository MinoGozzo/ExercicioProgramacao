import java.util.Scanner;

public class Exercicio24b {

	public static void main(String[] args) {
		int codigoStatus,raizCodigo, centena;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o código de estado recebido:");
		codigoStatus = leituraDados.nextInt();
		
		centena = 100;
		
		raizCodigo = codigoStatus / centena;
		
		switch (raizCodigo)
		{
		case 1:
			System.out.println("Respostas de informação.");
			break;
			
		case 2:
			System.out.println("Respostas de sucesso.");
			break;
			
		case 3:
			System.out.println("Redirecionamentos.");
			break;
			
		case 4:
			System.out.println("Erros do cliente.");
			break;
			
		case 5:
			System.out.println("Erros do servidor");
			break;
		default:
			System.out.println("Código de estado não identificado.");
		}
		
		leituraDados.close();	

	}

}
