import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		String nome;
		float nota1, nota2, nota3, media, numeroProvas;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = leituraDados.nextLine();
		
		System.out.println("Digite sua nota na primeira prova:");
		nota1 = leituraDados.nextFloat();
		
		System.out.println("Digite a nota da segunda prova");
		nota2 = leituraDados.nextFloat();
		
		System.out.println("Digite a nota da terceira prova:");
		nota3 = leituraDados.nextFloat();
		
		media = 7;
		numeroProvas = 3;
		
		if ((nota1+nota2+nota3)/numeroProvas >= media)
		{
			System.out.println(nome + " você foi aprovado.");
		} else
		{
			System.out.println(nome + " você foi reprovado.");
		}
		
		leituraDados.close();		
		
	}

}
