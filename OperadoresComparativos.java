// > <, maior ou menor;
//>=, <=, maior igual ou menor igual;
//==, igual;
//!= diferente;

public class OperadoresComparativos
{
	public static void main(String [] args)
	{
		int a = 10;
		boolean c1 = a < 10; // false, variável booleana para receber a condição.
		boolean c2 = a < 20; // true
		boolean c3 = a > 10; // false
		boolean c4 = a > 5; // true

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("-----------------------");

		boolean c5 = a <= 10; // true
		boolean c6 = a >= 10; // true
		boolean c7 = a == 10; // true
		boolean c8 = a != 10; // false

		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);

	}
}