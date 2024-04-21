package Estruturas_Condicional;

import java.util.Scanner;

public class Ex05_TabelaCodigoQuantidadeValor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item: ");
		int code = sc.nextInt();
		System.out.println("Digite a quantidade de item: ");
		int amount = sc.nextInt();
		System.out.println();

		double value;

		if (code == 1) {
			value = amount * 4.00;
			System.out.printf("Código selecionado:%d-> Cachorro Quente%nQuantidade: %d%nValor a pagar: R$ %.2f", code, amount, value);
			
		} else if (code == 2) {
			value = amount * 4.50;
			System.out.printf("Código selecionado:%d-> X-Salada%nQuantidade: %d%nValor a pagar: R$ %.2f", code, amount, value);
		} else if (code == 3) {
			value = amount * 5.00;
			System.out.printf("Código selecionado:%d-> X-Bacon%nQuantidade: %d%nValor a pagar: R$ %.2f", code, amount, value);
		} else if (code == 4) {
			value = amount * 2.00;
			System.out.printf("Código selecionado:%d-> Torrada Simples%nQuantidade: %d%nValor a pagar: R$ %.2f", code, amount, value);
		} else {
			value = amount * 1.50;
			System.out.printf("Código selecionado:%d-> Refrigerante%nQuantidade: %d%nValor a pagar: R$ %.2f", code, amount, value);
		}

		sc.close();
	}

}
