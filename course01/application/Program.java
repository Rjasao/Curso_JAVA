package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();//conexao
		
		System.out.println("Entre com o produto: ");
		
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();

		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto em estoque: "+product);
		
		System.out.println();
		System.out.print("Entre com a quantidade do produto para ser adicionado ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Estoque atualizado: "+product);
		
		System.out.println();
		System.out.print("Entre com a quantidade do produto a ser removido do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Estoque atualizado: "+product);
		
		
		sc.close();
	}

	
	
	
}
