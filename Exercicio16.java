import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		double preco,codigoPagamento;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o preço da compra:");
		preco = leituraDados.nextDouble();
		
		System.out.println("Digite o código de pagamento:");
		codigoPagamento = leituraDados.nextDouble();
		
		if (codigoPagamento == 1)
		{
			preco = preco *.95;
			System.out.println("O preço final é R$ " + preco +".");
		}
		else if (codigoPagamento == 2)
		{
			preco = preco * .9;
			System.out.println("O preço final é R$ " + preco + ".");
		}
		else if (codigoPagamento == 3)
		{
			System.out.println("O preço final é R$ " + preco + "dividido em duas parcelas iguais.");
		}
		else if (codigoPagamento == 4)
		{
			preco = preco * 1.1;
			System.out.println("O preço final é R$ " + preco + "dividido em duas parcelas iguais.");
		}
		else if (codigoPagamento == 5)
		{
			preco = preco * .95;
			System.out.println("O preço final é R$ " + preco + ".");
		}
		else if (codigoPagamento == 6)
		{
			preco = preco * .92;
			System.out.println("O preço final é R$ " + preco + ".");
		}
		else
		{
			System.out.println("Código de pagamento invalido.");
		}
		leituraDados.close();
				

	}

}
