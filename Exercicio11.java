
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int maioridade, limiteExistencial, idade;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade:");
		idade = leituraDados.nextInt();
		
		maioridade = 18;
		limiteExistencial = 0;
		
		if (idade <= limiteExistencial)
		{
			System.out.println("Idade invalidada.");
		} 
		
		else if (idade >= maioridade)
		{
			System.out.println("Você é maior de idade");
		}
		else
		{
			System.out.println("Você é menor de idade");
		}
		leituraDados.close();		
		
		
	}
	

}
