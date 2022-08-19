package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContratoHora;
import entidade.Departamento;
import entidade.Trabalhador;
import entidade.enums.NivelDeTrabalho;

public class Programa08 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
				
		System.out.println("Digite os dados do Trabalhador");
		System.out.print("Nome: ");
		String nomeTrab= sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrab = sc.nextLine();
		System.out.print("Salário base: ");
		double baseSalario = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelDeTrabalho.valueOf(nivelTrab), baseSalario, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos esse trabalhador vai ter?: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entrar com os dados do #" + i+"º contrato:" );
			System.out.print("Data (DD/MM/YYYY): ");
			Date contratoDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do contrato (Horas): ");
			int horas = sc.nextInt();
			
			ContratoHora contrato =	new ContratoHora(contratoDate, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
			System.out.println();
			System.out.print("Entre com mês e ano para calcular o salário (MM/YYYY): ");
			String mesEAno = sc.next();
			int mes = Integer.parseInt(mesEAno.substring(0, 2));
			int ano = Integer.parseInt(mesEAno.substring(3));
			
			System.out.println("Nome: " + trabalhador.getName());
			System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
			System.out.printf("Renda para " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
			
		
		sc.close();
	
	}

}
