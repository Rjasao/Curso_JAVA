package banco;

import java.util.Locale;
import java.util.Scanner;

import antities.Account;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Você quer iniciar um depósito? (s/n)? ");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.print("Entre com um valor inicial de depósito: ");
			double valor = sc.nextDouble();
			account = new Account(numero, valor, nome);
		}else {
			account = new Account(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double valor = sc.nextDouble();
		account.setValor(valor);
		System.out.println("Atualização dos dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Entre com o valor de Retirada: ");
		valor = sc.nextDouble();
		account.setRetira(valor);
		System.out.println("Atualização dos dados da conta:");
		System.out.println(account);
		
		
		sc.close();
	}

}
