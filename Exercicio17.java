import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		double numeroProvas, nota1, nota2, nota3, nota4, media;
		String nomeAluno;
		
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
		
		media = Math.ceil((nota1+nota2+nota3+nota4)/numeroProvas);
		
		if (media < 5)
		{
			System.out.println(nomeAluno  + "teve notas " + nota1 +", " + nota2 + ", " + nota3 + " e " + nota4 + "e uma média de " + media + " e portanto está reprovado.");
		}
		else if (media == 5)
		{
			System.out.println(nomeAluno + "teve notas " + nota1 +", " + nota2 + ", " + nota3 + " e " + nota4 + "e uma média de " + media + " e portanto devera participar de recuperação.");
		}
		else if (media > 5)
		{
			System.out.println(nomeAluno  + "teve notas " + nota1 +", " + nota2 + ", " + nota3 + " e " + nota4 + "e uma média de " + media + " e portanto está aprovado.");
		}
		leituraDados.close();
				

	}

}
