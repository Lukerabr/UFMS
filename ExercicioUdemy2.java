import java.util.Scanner;
import java.util.Locale;
public class ExercicioUdemy2
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		System.out.println("Olá, me forneça o raio da circunferência, e em seguida, irei calcular a área.");
		Scanner tc = new Scanner(System.in);
		Double pi = 3.14159;
		Double raio, area;
		System.out.println("Me de o valor do raio.");
		raio = tc.nextDouble();
		area = pi * (raio * raio);
		System.out.printf("A área da circunferência é: " + "%.4f %n", area);
	}
}