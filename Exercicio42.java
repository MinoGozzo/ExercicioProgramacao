import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		int numero, tabuada;
		
		Scanner leituraDados = new Scanner(System.in);
		
		numero = leituraDados.nextInt();
		
		for (int indice = 0; indice <=10; indice++)
		{
			tabuada = numero * indice;
			System.out.println(numero + " X " + indice + " = " + tabuada);
		}
		leituraDados.close();

	}

}
