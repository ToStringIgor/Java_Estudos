package Estruturas_Condicional;

import java.util.Scanner;

public class Ex09_AnoBissexto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dite um ano: ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			System.out.println("O ano de " + year + " � bissexto");
		} else {
			System.out.println("O ano de " + year + " n�o � bissexto");

		}

		sc.close();
	}

}
