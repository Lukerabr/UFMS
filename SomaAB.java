import java.util.Scanner;
public class SomaAB {
	public static void main (String [] args) {
		int A,B;
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor de A");
		A = sc.nextInt();
		System.out.println("digite o valor de B");
		B = sc.nextInt();
		resultado = A+B;
		System.out.println("O resultado eh: "+ resultado);

	}
}