package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import funcionario.CalculoFunc;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoFunc repara = new CalculoFunc();//conecta class CalcFunc
		
        System.out.print("Nome: ");
        repara.nome= sc.nextLine();//carrega dados
		System.out.print("Salário bruto: ");
		repara.salariob = sc.nextDouble();//carrega dados
		System.out.print("Valor de desconto: ");
		repara.desconto = sc.nextDouble();//carrega dados
		System.out.println();// pula linha
		
		System.out.print("Dados do empregado: "+repara); // devolve os dados resolvidos
		System.out.println();// pula linha
		
		System.out.print("Porcentagem de aumento salarial? : ");
		double taxa = sc.nextDouble();
		repara.addTaxa(taxa);//carrega dados
		
		
		System.out.println();// pula linha
		System.out.print("Dados do empregado atualizado: "+repara); // devolve os dados resolvidos
		
		sc.close();
	}

}
