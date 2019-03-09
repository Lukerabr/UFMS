import java.util.Scanner;

public class Exercicio4
{
	public static void main(String [] args)
	{
		int a, b, c, d, e;
		System.out.println("Olá, me de 3 números e farei a adiçao e multiplicação deles.");
		Scanner tc = new Scanner(System.in);
		a = tc.nextInt();
		b = tc.nextInt();
		c = tc.nextInt();
		d = a + b + c;
		e = a * b * c;
		System.out.println("A adição dos respectivos números é: " + d);
		System.out.println("A multiplicação dos respectivos números é: " + e);
	}
}