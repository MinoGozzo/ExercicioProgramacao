import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		double numeroProvas, nota1, nota2, nota3, nota4;
		String nomeAluno, status;
		int media;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		nomeAluno = leituraDados.nextLine();

		System.out.println("Digite a nota da primeira prova:");
		nota1 = leituraDados.nextDouble();

		System.out.println("Digite a nota da segunda prova:");
		nota2 = leituraDados.nextDouble();

		System.out.println("Digite a nota da terceira prova:");
		nota3 = leituraDados.nextDouble();

		System.out.println("Digite a nota da quarta prova:");
		nota4 = leituraDados.nextDouble();

		numeroProvas = 4;

		media = (int) Math.ceil((nota1 + nota2 + nota3 + nota4) / numeroProvas);
		
		switch (media)
		{
		case 1:
			status ="reprovado";
			break;
			
		case 2:
			status ="reprovado";
			break;
			
		case 3:
			status ="reprovado";
			break;
			
		case 4:
			status ="reprovado";
			break;
			
		case 5:
			status ="em recuperação";
			break;
			
		case 6:
			status ="aprovado";
			break;
			
		case 7:
			status ="aprovado";
			break;
			
		case 8:
			status ="aprovado";
			break;
			
		case 9:
			status ="aprovado";
			break;
			
		case 10:
			status ="aprovado";
			break;
			
		default:
			status = "invalido";
			
		}
		
		if (status == "invalido")
		{
			System.out.println("Ocorreu algum erro, por favor tente novamente");
		}
		else
		{
			System.out.println("O aluno " + nomeAluno + " teve uma média " + media + " e portanto está " + status + ".");
		}
		leituraDados.close();

		}
}
