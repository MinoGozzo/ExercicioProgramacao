import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		String prato1, prato2;
		double preco1, preco2, calorias1, calorias2, somaPrecos, somaCalorias;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite o prato escolhido:");
		prato1 = leituraDados.nextLine();

		switch (prato1) {
		case "Empada":
			preco1 = 7.5;
			calorias1 = 250;
			break;

		case "Sorvete":
			preco1 = 3.5;
			calorias1 = 110;
			break;

		case "Mousse":
			preco1 = 3;
			calorias1 = 170;
			break;

		case "Suco":
			preco1 = 2.5;
			calorias1 = 70;
			break;

		case "Refrigerante":
			preco1 = 2;
			calorias1 = 200;
			break;

		default:
			prato1 = "Indefinido";
			preco1 = 0;
			calorias1 = 0;
		}

		System.out.println("Digite outro prato:");
		prato2 = leituraDados.nextLine();

		switch (prato2) {
		case "Empada":
			preco2 = 7.5;
			calorias2 = 250;
			break;

		case "Sorvete":
			preco2 = 3.5;
			calorias2 = 110;
			break;

		case "Mousse":
			preco2 = 3;
			calorias2 = 170;
			break;

		case "Suco":
			preco2 = 2.5;
			calorias2 = 70;
			break;

		case "Refrigerante":
			preco2 = 2;
			calorias2 = 200;
			break;

		default:
			prato2 = "Indefinido";
			preco2 = 0;
			calorias2 = 0;
		}

		somaPrecos = preco1 + preco2;
		somaCalorias = calorias1 + calorias2;
		System.out.println(prato1 + " custa R$ " + preco1 + " e tem " + calorias1 + " quilocalorias. " + prato2
				+ " custa R$ " + preco2 + " e tem " + calorias2
				+ " quilocalorias. Os 2 alimentos combinam para um total de R$ " + somaPrecos + " e um total de "
				+ somaCalorias + " quilocalorias.");
		
		leituraDados.close();

	}

}
