package Estruturas_Condicional;

import java.util.Scanner;

public class Ex12_VereficarElegibilidadeParaVotar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int age = sc.nextInt();
		
		if((age <= 17 && age >= 16) || (age >=70)) {
			System.out.println("Pode votar(Voto não obrigatório)");
		}
		else if(age >= 18) {
			System.out.println("Pode votar(Voto obrigatório)");
		}
		else {
			System.out.println("Você ainda não possui idadade para votar");
		}
		
		

		sc.close();
	}
}
