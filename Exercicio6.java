import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double base, altura, areaTriangulo, areaRetangulo;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite a extensão da base:");
		base = leituraDados.nextDouble();

		System.out.println("Digite a altura");
		altura = leituraDados.nextDouble();

		areaRetangulo = base * altura;
		areaTriangulo = areaRetangulo / 2;

		System.out.println("A área de um retangulo com essas dimensões é " + areaRetangulo
				+ " e a área de um triângulo é " + areaTriangulo);

		leituraDados.close();

	}

}
