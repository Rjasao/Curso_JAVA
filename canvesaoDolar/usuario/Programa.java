package usuario;

import java.util.Locale;
import java.util.Scanner;

import reais.ConversaoDolar;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar de hoje? :");
		double dolar1 = sc.nextDouble();
		System.out.print("Quantos dolares você quer comprar:");
		double quantidade = sc.nextDouble();
		
		double res = ConversaoDolar.transformacao(dolar1, quantidade);
		
		System.out.printf("O valor a ser pago em Reais é de : R$ %.2f", res);
	}

}
