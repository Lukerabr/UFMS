import java.util.Scanner;
import java.util.Locale;

public class ExercicioUdemy4
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		System.out.println("Farei o calculo do salário do funcionário informado.");
		
		int func, horas;
		Double salHoras, salario;
		

		Scanner tc = new Scanner(System.in);
		
		System.out.println("Número do funcionário:");
		func = tc.nextInt();
		
		System.out.println("Horas trabalhadas:");
		horas = tc.nextInt();
		
		System.out.println("Preço por hora trabalhada:");
		salHoras = tc.nextDouble();

		salario = horas * salHoras;

		System.out.println();
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		tc.close();


	}
}