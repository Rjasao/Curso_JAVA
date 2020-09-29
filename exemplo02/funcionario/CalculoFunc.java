package funcionario;

public class CalculoFunc {
	
	public String nome;
	public double salariob;
	public double desconto;
	public double taxa;
	
	public double salDesconto() {
		return salariob*(taxa/100)+(salariob - desconto);
	}
	
	
	public String toString() {
		return nome
	           +", "
	           +"$ "
	           +String.format("%.2f",salDesconto())
	           +"\n";
		
	}
}
