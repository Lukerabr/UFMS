import java.util.Scanner;

public class Exercicio5
{
	public static void main(String [] args)
	{
		int a, b, c;
		System.out.println("Olá, me de um número que farei a divisão por 2 e 3.");
		Scanner tc = new Scanner(System.in);
		a = tc.nextInt();
		b = a / 2;
		c = a / 3;
		
		System.out.println("A divisão por 2 é: " + b);
		System.out.println("A divisão por 3 é: " + c);

		System.out.println();
	}
}