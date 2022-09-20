import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		char caractere;
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite um caractere:");
		
		caractere = leituraDados.nextLine().charAt(0);
		
		if (caractere == 'a' || caractere == 'A' || caractere == 'e' || caractere == 'E' || caractere == 'i'
				|| caractere == 'I' || caractere == 'o' || caractere == 'O' || caractere == 'u' || caractere == 'U') {
			System.out.println("A letra " + caractere + " é uma vogal.");
		}
			else if (caractere == 'q' || caractere == 'Q' || caractere == 'w' || caractere == 'W' || caractere == 'r'
				|| caractere == 'R' || caractere == 't' || caractere == 'T' || caractere == 'y' || caractere == 'Y'
				|| caractere == 'p' || caractere == 'P' || caractere == 's' || caractere == 'S' || caractere == 'd'
				|| caractere == 'D' || caractere == 'f' || caractere == 'F' || caractere == 'g' || caractere == 'G'
				|| caractere == 'h' || caractere == 'H' || caractere == 'j' || caractere == 'J' || caractere == 'k'
				|| caractere == 'K' || caractere == 'l' || caractere == 'L' || caractere == 'ç' || caractere == 'Ç'
				|| caractere == 'z' || caractere == 'Z' || caractere == 'x' || caractere == 'X' || caractere == 'c'
				|| caractere == 'C' || caractere == 'v' || caractere == 'V' || caractere == 'b' || caractere == 'B'
				|| caractere == 'n' || caractere == 'N' || caractere == 'm' || caractere == 'M') {
			System.out.println("A letra " + caractere + " é uma consoante.");
		} 
			else {
			System.out.println("O caractere digitado não é uma letra.");
		}
		
		leituraDados.close();
	}
	

}
