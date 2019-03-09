import java.util.Scanner;
import java.util.Locale;
public class EntradaDadosJava2
{
	public static void main(String [] args)
	{
		Locale.setDefault(Locale.US); //criar antes do Scanner.
		Scanner tc = new Scanner(System.in);
		int n1 = tc.nextInt(); //35.
		tc.nextLine(); // limpeza de stream de entrada (FLUSH); criar uma quebra de linha.
		String name = tc.nextLine(); //Bob Brown.
		char gender = tc.next().charAt(0);//F // pegar o primeiro character.
		//b5
		String s = tc.next();
		char letter = s.charAt(0); //na variavel letter, ele guardou a letra b.
		int digit = Integer.parseInt(s.substring(1)); //recordou a string a partir do primeiro digito, no caso pegou só o número.
		//4.32
		double n2 = tc.nextDouble();
		//Maria F 23 1.68.
		String name2 = tc.next();
		char ch = tc.next().charAt(0);
		int age = tc.nextInt();
		double height = tc.nextDouble();

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		tc.close();
	}
}