package Estruturas_Condicional;

import java.util.Scanner;

public class Ex01_NegativoN�oNegativo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("O n�mero " + num + " � negativo");
		}
		else {
			System.out.println("O n�mero " + num + " n�o � negativo");
			
		}
		
		
		
		sc.close();
	}

}
