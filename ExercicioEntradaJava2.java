import java.util.Locale;
import java.util.Scanner;
public class ExercicioEntradaJava2
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);

		System.out.println("Enter your full name:");		
		String name = tc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int rooms = tc.nextInt();
		System.out.println("Enter product price:");
		Double price = tc.nextDouble();
		tc.nextLine(); //limpar a linha.
		System.out.println("Enter your last name, age and height (same line):");
		String last = tc.next();
		int age = tc.nextInt();
		Double height = tc.nextDouble();

		System.out.println(name);
		System.out.println(rooms);
		System.out.printf("%.2f%n", price); //%.2f%n > contar duas casas decimais.
		System.out.println(last);
		System.out.println(age);
		System.out.printf("%.2f%n", height); //%.2f%n > contar duas casas decimais.

		tc.close();
		

	}
}