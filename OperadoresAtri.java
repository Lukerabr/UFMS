// a = 10, variavel a recebe 10.
// a += 2, recebe a +2; a -= 2; a *= 2;
// a /= 2, recebe a /2; a %= 3, recebe % 3;


public class OperadoresAtri
{
	public static void main(String [] args)
	{
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("-------------------------");

		n1 *= 2;  // 20
		n2 += n1; // 50
		s += "\nDEF"; //ABCDEF

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("-----------------------------");

		int a = 10;
		int b = a++; //11
		a++; //12
		System.out.println(a);
		System.out.println(b);
	}
}