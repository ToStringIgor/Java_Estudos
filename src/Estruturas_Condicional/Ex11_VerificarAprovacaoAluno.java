package Estruturas_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex11_VerificarAprovacaoAluno {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		double note = sc.nextDouble();
		
		if(note >=60 ) {
			System.out.println("Você foi aprovado");
		}
		else {
			System.out.println("Você foi reprovado");
		}
		
		
		sc.close();
	}

}
