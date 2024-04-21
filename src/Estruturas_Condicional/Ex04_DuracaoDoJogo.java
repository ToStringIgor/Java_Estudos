package Estruturas_Condicional;

import java.util.Scanner;

public class Ex04_DuracaoDoJogo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Inicio do jogo: ");
		int start = sc.nextInt();
		System.out.println("Fim do jogo: ");
		int end = sc.nextInt();

		int duration;

		if (start < end) {
			duration = end - start;

		} else {
			duration = 24 - start + end;
		}
		System.out.println("O jogo durou " + duration + " horas");

		sc.close();
	}

}
