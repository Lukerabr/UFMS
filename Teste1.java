import java.util.Scanner;

public class Teste1
{

 	public static void main(String[] args)
	{
		double a, b, r;
		
		System.out.println("Olá, digite dois números que eu farei a divisão deles");
		
		System.out.println("Digite o primeiro número:");
		Scanner tc = new Scanner(System.in);
		a = tc.nextDouble();
		System.out.println("Digite o segundo número:");
		b = tc.nextDouble();
		System.out.println("O resultado é: ");
		r = a / b;
		System.out.println(r);
		

	}
 
}