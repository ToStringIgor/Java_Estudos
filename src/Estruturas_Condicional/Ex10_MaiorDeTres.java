package Estruturas_Condicional;

import java.util.Scanner;

public class Ex10_MaiorDeTres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int numberOne = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int numberTwo = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int numberThree = sc.nextInt();
		
		if(numberOne > numberTwo && numberOne > numberThree) {
			System.out.println("O n�mero " + numberOne + " � o maior");
		}
		else if(numberTwo > numberOne && numberTwo > numberThree) {
			System.out.println("O n�mero " + numberTwo + " � o maior");
			
		}else {
			System.out.println("O n�mero " + numberThree + " � o maior");
			
		}
		
		
		sc.close();
	}

}
