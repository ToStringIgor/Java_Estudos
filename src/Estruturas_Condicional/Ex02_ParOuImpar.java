package Estruturas_Condicional;

import java.util.Scanner;

public class Ex02_ParOuImpar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par");
		}
		else {
			System.out.println("O n�mero " + num + " � negativo");
			
		}
		
		
		sc.close();
	}
	

}
