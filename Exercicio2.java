import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double primeiroValor, segundoValor, variavelAuxiliar;
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		primeiroValor = leituraDados.nextDouble();
		System.out.println("Digite o segundo valor: ");
		segundoValor = leituraDados.nextDouble();
		variavelAuxiliar = primeiroValor;
		primeiroValor = segundoValor;
		segundoValor = variavelAuxiliar;
		leituraDados.close();

		System.out.println("O primeiro valor agora é " + primeiroValor + " e o segundo valor agora é: " + segundoValor);
	}

}
