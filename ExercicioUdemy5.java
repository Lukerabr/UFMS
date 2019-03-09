import java.util.Scanner;
import java.util.Locale;

public class ExercicioUdemy5
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);

		int peca1, peca2, quantPeca1, quantPeca2;
		double valorUnit1, valorUnit2, valorTotal;

		peca1 = tc.nextInt();
		quantPeca1 = tc.nextInt();
		valorUnit1 = tc.nextDouble();
		
		peca2 = tc.nextInt();
		quantPeca2 = tc.nextInt();
		valorUnit2 = tc.nextDouble();

		valorTotal = (quantPeca1 * valorUnit1) + (quantPeca2 * valorUnit2);



		System.out.printf("Valor a pagar: R$ %.2f%n ", valorTotal);

		tc.close();
	}
}