package Estruturas_Condicional;

import java.util.Scanner;

public class Ex18_MaquinaDeBebidas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma bebida:");
		System.out.println("1.Caf�");
		System.out.println("2.Ch�");
		System.out.println("3.Refrigerante");
		System.out.println("4.�gua");

		int opcao = sc.nextInt();
		String bebidas;

		switch (opcao) {
		case 1:
			bebidas = "Caf�";
			break;
		case 2:
			bebidas = "Ch�";
			break;
		case 3:
			bebidas = "Refrigerante";
			break;
		case 4:
			bebidas = "�gua";
			break;
		default:
			bebidas = "Op��o inv�lida";
			break;

		}
		if (!bebidas.equals("Op��o iv�lida")) {
			System.out.println("Voc� escolheu " + bebidas + ". Por favor, insira o pagamento.");
		} else {
			System.out.println("Op��o inv�lida. Por favor escolha uma op��o v�lida.");
		}

		sc.close();
	}

}
