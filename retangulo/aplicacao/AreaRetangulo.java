package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import resolucao.CalculoArea;

public class AreaRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CalculoArea ret = new CalculoArea();// conexao

		System.out.println("Entre com a Largura e Altura do retângulo nesta ordem: ");

		System.out.print("Largura: ");
		ret.comprimento = sc.nextDouble();

		System.out.print("Altura: ");
		ret.altura = sc.nextDouble();

		System.out.println(ret);		
		
		sc.close();

	}

}
