import java.util.Scanner;
//considerar ponto como separador de casa decimal, usar Locale.setDefault(Locale.US);
public class EntradaDadosJava
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		
		String sentence = tc.nextLine();
		String x, y, z;
		x = tc.next();
		y = tc.next();
		z = tc.next();
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = tc.next();
		y = tc.next();
		z = tc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		tc.close(); //sempre fechar o Scanner.
	}
}