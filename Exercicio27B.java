import java.util.Scanner;

public class Exercicio27B {

	public static void main(String[] args) {
		boolean cordas, amplificador, teclas, bumbo;
		Scanner leituraDados = new Scanner(System.in);
			
		System.out.println("O instrumento é de corda?");
		cordas = leituraDados.nextBoolean();
		
		if (cordas == true)
		{
			System.out.println("O instrumento usa um amplificador?");
			amplificador = leituraDados.nextBoolean();
			
			if (amplificador == true)
			{
				System.out.println("Guitarra");
			}
			else
			{
				System.out.println("Violão");
			}
		}
		else
		{
			System.out.println("O instrumento tem teclas?");
			teclas = leituraDados.nextBoolean();
			if (teclas == true)
			{
				System.out.println("Teclado");
			}
			else
			{
				System.out.println("O instrumento tem bumbo?");
				bumbo = leituraDados.nextBoolean();
				if (bumbo == true)
				{
					System.out.println("Bateria");
				}
				else
				{
					System.out.println("O instrumento escolhido é novo para mim, tente novamente.");
				}
			}
		}
		leituraDados.close();
	}

}
