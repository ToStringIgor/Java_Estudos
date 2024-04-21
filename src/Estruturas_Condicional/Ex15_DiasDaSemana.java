package Estruturas_Condicional;

import java.util.Scanner;

public class Ex15_DiasDaSemana {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana de 1 a 7: ");
		int day = sc.nextInt();
		
		String dia;
		
		switch(day) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:

			dia ="Valor inválido";
			break;
		
		}
		System.out.println("Dia da semana " + dia);
		
		
		sc.close();
	}

}
