package Estruturas_Condicional;

import java.util.Scanner;

public class Ex13_DirecaoPersonagam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Direção: ");
		char caractere = sc.next().charAt(0);

		if (caractere == 'w') {
			System.out.println("O jogador se move para cima");
		} else if (caractere == 'd') {
			System.out.println("O jogado se move para direira");
		} else if (caractere == 'a') {
			System.out.println("O jogador se move para esquerda");
		} else if (caractere == 's') {
			System.out.println("O jogar se move para baixo");
		} else {
			System.out.println("Comando ivalido");
		}

		sc.close();
	}

}
