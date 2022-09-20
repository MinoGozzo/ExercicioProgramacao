import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		double idadeEmDias, anos, meses, dias,diasNoAno,diasNoMes;
		
		diasNoAno = 365;
		diasNoMes = 30;
		
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem:");
		anos = leituraDados.nextDouble();
		
		System.out.println("E quantos meses:");
		meses = leituraDados.nextDouble();
		
		System.out.println("E quantos dias:");
		dias = leituraDados.nextDouble();
		
		idadeEmDias = anos*diasNoAno + meses*diasNoMes + dias;
		
		System.out.println("Sua idade corresponde a "+ idadeEmDias + " dias.");
		leituraDados.close();		
		
		
	}
	

}
