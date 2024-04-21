package Estruturas_Condicional;

import java.util.Scanner;

public class Ex03_saoMultiplos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Valor A: ");
		int valorA = sc.nextInt();
		System.out.println("Valor B: ");
		int valorB = sc.nextInt();

		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("O número " + valorA + " e o número " + valorB + " são multiplos");
		} else {
			System.out.println("O número " + valorA + " e o número " + valorB + " não são multiplos");

		}

		sc.close();
	}

}
