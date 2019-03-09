import java.util.Scanner;

public class Exercicio3
{
	public static void main(String [] args)
	{
		int a, b, c;
		System.out.println("Olá, me de um número e eu farei o quadrado e o cubo.");
		Scanner tc = new Scanner(System.in);
		a = tc.nextInt();
		b = (a * a);
		c = (a * a * a);
		System.out.println("O quadrado do número é: " + b);
		System.out.println("O cubo do número é: " + c);
	}
}