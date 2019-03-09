import java.util.Scanner;
public class ExercicioUdemy1
{
	public static void main(String [] args)
	{
		System.out.println("Olá, me dê dois valores inteiros e farei a soma dos mesmos.");
		Scanner tc = new Scanner(System.in);
		int a, b, soma;
		System.out.println("Me dê o primeiro número:");
		a = tc.nextInt();
		System.out.println("Me dê o segundo número:");
		b = tc.nextInt();
		soma = a + b;
		System.out.println("O Resultado da soma é: " + soma);
		tc.close;
	}
}