package escola;

import java.util.Locale;
import java.util.Scanner;

import aluno.Calculo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculo media = new Calculo();
		
		System.out.print("Nome :");
		media.nome = sc.nextLine();
		
		System.out.print("1ª Nota :");
		double nota01T = sc.nextDouble();
		if(nota01T < 30) {
		media.nota01 = nota01T;	
		}else {
		System.out.print("Só são permitidas notas abaixo de ou igual a 30. \nDigite novamente :");
		media.nota01 = sc.nextDouble();
		}
		
		
			
		System.out.print("2ª Nota :");
		double nota02T = sc.nextDouble();
		if(nota02T < 35) {
		media.nota02 = nota02T;	
		}else {
		System.out.print("Só são permitidas notas abaixo de ou igual a 35. \nDigite novamente :");
		media.nota02 = sc.nextDouble();
		}
		
		
		
		System.out.print("3ª Nota :");
		double nota03T = sc.nextDouble();
		if(nota03T < 35) {
		media.nota03 = nota03T;	
		}else {
		System.out.print("Só são permitidas notas abaixo de ou igual a 35. \nDigite novamente :");
		media.nota03 = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println(media);
		
		sc.close();
	}

}
