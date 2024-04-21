package Estruturas_Condicional;

import java.util.Scanner;

public class Ex16_NumeroPorExtenso {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero de 1 a 5: ");
		int num = sc.nextInt();

		String numPorExtenso;

		switch (num) {
		case 1:
			numPorExtenso = "Um";
			break;

		case 2:
			numPorExtenso = "Dois";
			break;
		case 3:
			numPorExtenso = "Tr�s";
			break;
		case 4:
			numPorExtenso = "Quatro";
			break;
		case 5:
			numPorExtenso = "Cinco";
		default:
			numPorExtenso = "N�mero inv�lido";
			break;
		}
		System.out.println("N�mero por extenso: " + numPorExtenso);

		sc.close();
	}

}
