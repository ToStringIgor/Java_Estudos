package Estruturas_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_ImpostoNoSalario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário recebido: ");
		double salary = sc.nextDouble();
		
		double imposto;
		if(salary < 2000.00) {
			imposto = 0.0;
		}
		else if(salary <= 3000.0) {
			imposto = (salary - 2000.0) * 0.08;
		}
		else if( salary <= 4500.0) {
			imposto = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if(imposto == 0.0) {
			System.out.println("Inseto de imposto");
		}
		else {
			System.out.printf("R$ %.2f", imposto);
		}
		
		
		sc.close();
	}

}
