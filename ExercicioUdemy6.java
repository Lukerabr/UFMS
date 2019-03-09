import java.util.Locale;
import java.util.Scanner;

public class ExercicioUdemy6
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);

		double a, b, c;

		a = tc.nextDouble();
		b = tc.nextDouble();
		c = tc.nextDouble();		

		System.out.println();
		System.out.printf("TRIANGULO: %.3f%n", (a*c/2));
		System.out.printf("CIRCULO: %.3f%n", (3.14159*c*c));
		System.out.printf("TRAPEZIO: %.3f%n", ((a+b)*c/2));
		System.out.printf("QUADRADO: %.3f%n", (b*b));
		System.out.printf("RETANGULO: %.3f%n", (a*b));

		tc.close();
	}	
}