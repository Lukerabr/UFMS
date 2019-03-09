//operadores aritméticos.
//% resto da divisão.
//.0 indica double.
//raiz Math.sqrt();
import java.util.Scanner;

public class OperadoresArit
{
	public static void main(String [] args)
	{
		System.out.println("Olá, farei o calculo da variável x.");


		double a, b, c, x1, x2;
		
		System.out.println("Informe o valor de a: ");
		Scanner tc = new Scanner(System.in);	
		a = tc.nextDouble();
		System.out.println("Informe o valor de b: ");
		b = tc.nextDouble();
		System.out.println("Informe o valor de c: ");
		c = tc.nextDouble();
		//(-b + raiz b*b - 4*a*c)/2*a
		x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		
		System.out.println("O Resultado de x1 é: ");
		System.out.println(x1);
		System.out.println("O resultado de x2 é: ");
		System.out.println(x2);
	}
}

