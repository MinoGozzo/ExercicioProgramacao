import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		char caractere;
		String stringMeioTermo;
		int numeroConstante, numeroParse, resultado;
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um número");
		caractere = leituraDados.next().charAt(0);
		
		stringMeioTermo = Character.toString(caractere);
		
		numeroConstante = 25;
		
		numeroParse = Integer.parseInt(stringMeioTermo);
		
		resultado = numeroConstante+numeroParse;
		
		System.out.println("O resultado da soma da constante e do número digitado é: "+ resultado);
		
		leituraDados.close();		
		
		
	}
	

}
