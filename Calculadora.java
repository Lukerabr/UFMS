import java.util.Scanner;
public class Calculadora{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		float A,B,R; 	
		int opcao = 0;
		System.out.println("Escolha o valor da opcao");
		opcao = sc.nextInt();
		if(opcao == 0){
			System.out.println("Voce escolheu SOMA");
			A = sc.nextFloat();
			B = sc.nextFloat();
			R = A+B;
			System.out.println("Seu resultado eh: " + R); 

		}
		else if(opcao ==1){
			System.out.println("Voce escolheu SUBTRACAO");
			A = sc.nextFloat();
			B = sc.nextFloat();
			R = A-B;
			System.out.println("Seu resultado eh: " + R);
		}
		else if(opcao ==2){
			System.out.println("Voce escolheu DIVIZAO");
			A = sc.nextFloat();
			B = sc.nextFloat();
			R = A/B;
			System.out.println("Seu resultado eh: " + R);
		}
		else if(opcao ==3){
			System.out.println("Voce escolheu MULTIPLICACAO");
			A = sc.nextFloat();
			B = sc.nextFloat();
			R = A*B;
			System.out.println("Seu resultado eh: " + R);
		}
		else if(opcao ==4){
			System.out.println("Voce escolheu POTENCIA DE DOIS");
			A = sc.nextFloat();
			R = A*A;
			System.out.println("Seu resultado eh: " + R);
		}
		else if(opcao ==5){
			System.out.println("Voce escolheu RAIZ QUADRADA");
			A = sc.nextFloat();
			R = A;
			System.out.println("Seu resultado eh: " + R);
		}

	}
}