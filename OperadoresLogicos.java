// &&, significa E; exemplo da habilitação;
// ||, significa OU; exemplo da vaga especial;
// !, significa NÃO; o que é verdadeiro vira falso e vice versa;
// Precedência: ! > && > ||;
// Parenteses à vontade;

public class OperadoresLogicos
{
	public static void main(String [] args)
	{
		boolean c1 = 2 > 3 || 4 !=5;
		boolean c2 = !(2 > 3) && 4 !=5;


		System.out.println(c1);
		System.out.println(c2);
		System.out.println("---------------------");

		boolean c3 = 10 < 5; //false
		boolean c4 = c1 || c2 && c3; //true

		System.out.println(c4);
	}
}