package Estruturas_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex17_CalculadoraSimples {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double num = sc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double num2 = sc.nextDouble();
		System.out.println("Escolha a oper��o(+,-,*,/)");
		char operacao = sc.next().charAt(0);

		double resultado = 0 ;

		switch (operacao) {
		case '+':
			resultado = num + num2;
			break;
		case '-':
			resultado = num - num2;
			break;
		case '*':
			resultado = num * num2;
			break;
		case '/':

			resultado = num / num2;
			break;
		default:
			System.out.println("Opera��o inv�lida");
		}
		System.out.println("O resultado da oper��o �: " + resultado);

		sc.close();
	}

}
