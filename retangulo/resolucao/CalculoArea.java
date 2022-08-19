package resolucao;

public class CalculoArea {
	
	
	public double comprimento;
	public double altura;	
	
	
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
		return  "\nAREA = "
				+ String.format("%.2f", calculoArea())
				+"u²"
				+"\n"
				+ "PERIMETRO = "
				+ String.format("%.2f", calculoPerimetro())
				+"u"
				+"\n" 
				+ "DIAGONAL = "
				+ String.format("%.2f", calcuDiagonal())
				+"u";
	}
}
