package Estruturas_Condicional;

import java.util.Scanner;

public class Ex18_MaquinaDeBebidas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma bebida:");
		System.out.println("1.Café");
		System.out.println("2.Chá");
		System.out.println("3.Refrigerante");
		System.out.println("4.Água");

		int opcao = sc.nextInt();
		String bebidas;

		switch (opcao) {
		case 1:
			bebidas = "Café";
			break;
		case 2:
			bebidas = "Chá";
			break;
		case 3:
			bebidas = "Refrigerante";
			break;
		case 4:
			bebidas = "Água";
			break;
		default:
			bebidas = "Opção inválida";
			break;

		}
		if (!bebidas.equals("Opção iválida")) {
			System.out.println("Você escolheu " + bebidas + ". Por favor, insira o pagamento.");
		} else {
			System.out.println("Opção inválida. Por favor escolha uma opção válida.");
		}

		sc.close();
	}

}
