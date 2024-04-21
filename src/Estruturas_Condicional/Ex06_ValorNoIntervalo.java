package Estruturas_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_ValorNoIntervalo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double num = sc.nextDouble();
		
		
		if(num < 0.0 || num > 100.0) {
			System.out.println("Fora Do intervalo");
		}
		else if (num < 25.0) {
			System.out.println("Intervalo [0,25]");
			
		}else if(num < 50.0) {
			System.out.println("Intervalo (25,50]");
			
		} else if (num < 75.0) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalor (75,100]");
		}
		
		
		sc.close();
	}

}
