
import java.util.Scanner;

public class Exercicio11b {

	public static void main(String[] args) {
		
		int maioridade, limiteExistencial, anoDeNascimento, anoAtual, anoVirtual;
		char aniversario;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Qual é a seu ano de nascimento:");
		anoDeNascimento = leituraDados.nextInt();
		
		System.out.println("Você já fez aniversário esse ano?");
		aniversario = leituraDados.next().charAt(0);
	
		
		anoAtual = 2022;
		maioridade = 18;
		limiteExistencial = 0;
		
		if (aniversario == 'n')
		{
			anoVirtual = anoDeNascimento-1;
		} else 
		{
			anoVirtual = anoDeNascimento;
		}
		if (anoAtual-anoVirtual <= limiteExistencial)
		{
			System.out.println("Ano de nascimento invalido.");
		} 
		
		else if (anoAtual-anoDeNascimento >= maioridade)
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
