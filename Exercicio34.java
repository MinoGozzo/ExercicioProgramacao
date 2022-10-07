import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		double boletoJuros;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o valor do boleto:");
		boletoJuros = leituraDados.nextDouble();
		
		
		for (int indice = 1; indice < 11; indice++)
		{
			boletoJuros = boletoJuros * 1.15;
			System.out.println(boletoJuros);
		}
		
		leituraDados.close();
	}

}
