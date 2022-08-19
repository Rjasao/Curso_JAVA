package aluno;

public class Calculo {
	
	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	
	public double resto;
	
	public double verificaResto() {
		return 60 - (nota01 + nota02 + nota03);
	}
		
	public double verificaMedia() {
		return (nota01 + nota02 + nota03);	
	}
	
	
	public String toString() {
				
		if(verificaMedia()>= 60) {
		return "Nota final = " 
			+String.format("%.2f", verificaMedia())
			+"\n"
			+"Aluno "
			+nome 
			+" foi aprovado";
		}else {
		return "Nota final = " 
			+String.format("%.2f", verificaMedia())
			+"\n"
			+"Aluno "
			+nome 
			+" foi reprovado"
			+"\n"
			+"Faltaram "
			+String.format("%.2f", verificaResto())
			+" pontos";
		}
	}

}
