import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		double boleto, jurosSimples, jurosCompostos, valorJurosSimples;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o valor do boleto:");
		boleto = leituraDados.nextDouble();
		
		jurosSimples = boleto;
		jurosCompostos = boleto;
		valorJurosSimples = boleto * .3;
		
		for (int indice = 1 ; indice <11; indice++)
		{
			jurosSimples = jurosSimples + valorJurosSimples;
			jurosCompostos = jurosCompostos * 1.15;
			
			System.out.print("Pagar-se-a " + jurosSimples + " em juros simples e " + jurosCompostos + " em juros compostos.");
			
			if ( jurosSimples < jurosCompostos)
			{
				System.out.println(" A melhor opção é juros simples.");
			}
			else
			{
				System.out.println(" A melhor opção é juros compostos.");
			}
		}
		leituraDados.close();
		

	}

}
