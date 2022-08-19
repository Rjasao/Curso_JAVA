package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product04;
import enums.OrderStatus;

public class Programa09 {

	public static void main(String[] args) throws ParseException {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entrar com os dados do cliente: ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name1,email,birthDate);
		
		
		System.out.println();
		System.out.println("Insira os dados dos pedidos: ");
		System.out.print("Digite o estatos: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		System.out.print("Quantos itens tem seu pedido?: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++){
			System.out.println("Entre com os dados do #" + i +"º item");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String name2 =sc.nextLine();
			System.out.print("Preço do produto: ");
			double price2 = sc.nextDouble();
			
			
			Product04 product = new Product04(name2, price2);
	
		
		    System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			
			OrderItem orderItem = new OrderItem(quantity, price2, product); 

			order.addItem(orderItem);
		
			}
		System.out.println();
		System.out.println("Lista dos pedidos:");
		System.out.println(order);
				
		sc.close();
	}

}
