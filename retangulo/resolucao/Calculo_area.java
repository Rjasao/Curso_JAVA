package resolucao;

public class Calculo_area {
	public String resposta;
	public double altura;
	public double comprimento;
		
	public double calculoArea() {
		return altura * comprimento;
	}
	public double calculoPerimetro() {
		return (2*altura) + (2*comprimento);
	}
	public double calcuDiagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(comprimento, 2));
	}
	
	public String toString() {
		return resposta 
				+ "AREA = "
				+ String.format("%.2f", calculoArea())+"\n"
				+ "PERIMETRO = "
				+ String.format("%.2f", calculoPerimetro())+"\n"
				+ "DIAGONAL = "
				+ String.format("%.2f", calcuDiagonal());
	}
	
	
	
	
	
}
