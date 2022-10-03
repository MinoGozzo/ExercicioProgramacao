import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int dia, mes, diasNoMes;
		String estacao = null, nomeMes = null;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite a número do mês:");
		mes = leituraDados.nextInt();

		System.out.println("Digite o dia do mês:");
		dia = leituraDados.nextInt();

		diasNoMes = 30;
		
		if (dia > diasNoMes)
		{
			System.out.println("Número invalido de dias");
		}
		else
		{
		
		switch (mes)
		{
		case 1:
			nomeMes = "Janeiro";
			estacao = "verão";
			break;
			
		case 2:
			nomeMes = "Fevereiro";
			estacao = "verão";
			break;
			
		case 3:
			nomeMes = "Março";
			if (dia >21)
			{
				estacao = "outono";
			
			}
			else
			{
				estacao = "verão";
			}
			break;
			
		case 4:
			nomeMes = "Abril";
			estacao = "outono";
			break;
			
		case 5:
			nomeMes = "Maio";
			estacao ="outono";
			break;
			
		case 6:
			nomeMes = "Junho";
			if (dia >21)
			{
				estacao = "inverno";
			
			}
			else
			{
				estacao = "outono";
			}
			break;
			
		case 7:
			nomeMes = "Julho";
			estacao = "inverno";
			break;
			
		case 8:
			nomeMes = "Agosto";
			estacao = "inverno";
			break;
			
		case 9:
			nomeMes = "Setembro";
			if (dia >21)
			{
				estacao = "primavera";
			
			}
			else
			{
				estacao = "inverno";
			}
			break;
			
		case 10:
			nomeMes = "Outubro";
			estacao = "primavera";
			break;
			
		case 11:
			nomeMes = "Novembro";
			estacao = "primavera";
			break;
			
		case 12:
			nomeMes = "Dezembro";
			if (dia >21)
			{
				estacao = "verão";
			
			}
			else
			{
				estacao = "primavera";
			}
			break;
			
		default:
			System.out.println("Mês invalido.");
		
		}
		
		}
		
		System.out.println("No dado dia de " + nomeMes + " estamos na estação " + estacao);
		leituraDados.close();

		}
}
