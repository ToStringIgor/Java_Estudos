package Estruturas_Condicional;

import java.util.Scanner;

public class Ex01_NegativoNãoNegativo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("O número " + num + " é negativo");
		}
		else {
			System.out.println("O número " + num + " não é negativo");
			
		}
		
		
		
		sc.close();
	}

}
