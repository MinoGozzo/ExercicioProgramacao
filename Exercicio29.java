
public class Exercicio29 {

	public static void main(String[] args) {
		int numero, soma;
		
		soma = 0;
		
		for (numero = 0; numero <= 100; numero++)
		{
			if (numero % 10 == 0)
			{
				soma = soma + numero;
			}
		}
		System.out.println(soma);

	}

}
