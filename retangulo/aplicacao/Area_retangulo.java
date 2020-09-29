package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import resolucao.Calculo_area;


public class Area_retangulo {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	Calculo_area retangulo = new Calculo_area();//conexao
	
	System.out.println("Entre com a Largura e Altura do retângulo \n nesta ordem: ");
	
	retangulo.comprimento = sc.nextDouble();
	retangulo.altura = sc.nextDouble();
	
	sc.close();
	
	}

}
