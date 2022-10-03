import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio26 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		String dataEmString, horaEmString;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite uma data:");
		dataEmString = leituraDados.nextLine();
		Date data = new SimpleDateFormat("dd/MM").parse(dataEmString);

		System.out.println("Digite uma hora:");
		horaEmString = leituraDados.nextLine();

		Date hora = new SimpleDateFormat("HH:mm").parse(horaEmString);

		if (data.getMonth() != 9 || data.getDay() < 27 || data.getDay() > 28 || horaEmString.length() > 5
				|| hora.getHours() > 24) {
			System.out.println("Dia e hora indisponiveis.");
		} else if (data.getDay() == 27) {
			if (hora.getHours() < 9) {
				System.out.println("Temperatura de 21 graus e pancadas leves de chuva.");
			} else if (hora.getHours() > 14) {
				System.out.println("Temperatura de 20 graus e pancadas de chuva.");
			} else {
				System.out.println("Temperatura de 22 graus e tempetades isoladas com raios e trovões.");
			}
		} else {
			if (hora.getHours() < 11) {
				System.out.println("Temperatura de 21 graus e sol.");
			} else if (hora.getHours() < 17) {
				System.out.println("Temperatura de 26 graus e parcialmente nublado.");
			} else {
				System.out.println("Temperatura de 22 graus e sol.");
			}
		}

		leituraDados.close();

	}

}
