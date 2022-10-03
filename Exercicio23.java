import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		String tipoPrato;
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite o tipo de prato desejado:");
		tipoPrato = leituraDados.nextLine();
		
		switch (tipoPrato)
		{
		case "Doces":
			System.out.println("Brigadeiro, beijinho, sorvete, brownie e cocada.");
			break;
			
		case "Massas":
			System.out.println("Macarrão alho e óleo.");
			break;
			
		case "Sopas":
			System.out.println("De legumes.");
			break;
			
		case "Pizza":
			System.out.println("Moda, calabresa e frango com catupiry.");
			break;
		
		case "Bebidas":
			System.out.println("Cerveja, refrigerante, água e suco");
		default:
			System.out.println("Opção não disponivel no momento");
		
		}
		
		leituraDados.close();

		}
}
