import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		int codigoStatus;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o código de estado recebido:");
		codigoStatus = leituraDados.nextInt();
		
		if (codigoStatus >= 100 && codigoStatus < 200)
		{
			System.out.println("Resposta de informação.");
		}
		else if (codigoStatus <300)
		{
			System.out.println("Resposta de sucesso.");
		}
		else if (codigoStatus < 400)
		{
			System.out.println("Redirecionamentos.");
		}
		else if (codigoStatus < 500)
		{
			System.out.println("Erros do cliente");
		}
		else if (codigoStatus < 600)
		{
			System.out.println("Erros do servidor");
		}
		else 
		{
			System.out.println("Código de estado não reconhecido.");
		}
		
		leituraDados.close();	

	}

}
