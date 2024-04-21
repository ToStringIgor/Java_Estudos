package Estruturas_Condicional;

import java.util.Scanner;

public class Ex10_MaiorDeTres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numberOne = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int numberTwo = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int numberThree = sc.nextInt();
		
		if(numberOne > numberTwo && numberOne > numberThree) {
			System.out.println("O número " + numberOne + " é o maior");
		}
		else if(numberTwo > numberOne && numberTwo > numberThree) {
			System.out.println("O número " + numberTwo + " é o maior");
			
		}else {
			System.out.println("O número " + numberThree + " é o maior");
			
		}
		
		
		sc.close();
	}

}
