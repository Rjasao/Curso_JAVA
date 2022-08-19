package funcionario;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;



public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		//inserir dados:
		
		System.out.print("Quantos empregados você registrará? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (nextId(list, id)) {
				System.out.print("Id já existe. Tente outro: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Empregado(id, nome, salario));
		}
		//alterando salario
		
		System.out.println();
		System.out.print("Insira o Id do funcionário que terá aumento de salário: ");
		int id = sc.nextInt();
				
		 while (nextId2(list, id)) {
			System.out.print("Este Id não existe.Tente outro: ");
			id = sc.nextInt();
		 }
		    
		    int id2 = id;
		    Empregado emp2 = list.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		   	System.out.print("Entre com o valor da porcentagem: ");
			double percentagem = sc.nextDouble();
			emp2.incrementaSalario(percentagem);
				
		// Lista de empregados
		System.out.println();
		System.out.println("Lista de empregados");
		for(Empregado obj : list) {
			System.out.println(obj);
		}
		
	sc.close();
	
	}

	private static boolean nextId2(List<Empregado> list, int id) {
		Empregado emp2 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp2 == null;
	}

	private static boolean nextId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
		

}
