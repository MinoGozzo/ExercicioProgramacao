import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite o seu primeiro nome:");
		nome = leituraDados.nextLine();
		System.out.println("Digite o seu sobrenome:");
		sobrenome = leituraDados.nextLine();
		System.out.println("O seu nome é: " + nome + " " + sobrenome);
		leituraDados.close();

	}

}
