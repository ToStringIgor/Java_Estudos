package Estruturas_Condicional;

import java.util.Scanner;

public class Ex14_ValidacaoDeEntrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Usuário: ");
		String entrada = sc.nextLine();
		System.out.println("Senha: ");
		String senha = sc.nextLine();

		String logim = "Dark";
		String senhaa = "12345678";

		if (entrada.equals(logim) && senha.equals(senhaa)) {
			System.out.println("Seja bem vindo " + entrada);
		} else {
			System.out.println("Usuário ou senha inválidos");
		}

		sc.close();
	}

}
