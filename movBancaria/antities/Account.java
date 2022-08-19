package antities;

public class Account {
	
	private int numero;
	private double valor;
	private String nome;
	
	public Account() {
		
	}

	public Account(int numero, double valor, String nome) {
		this.numero = numero;
		this.valor = valor;
		this.nome = nome;
	}
	
	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	

	public void setValor(double valor) {
		this.valor += valor;
	}
	public void setRetira(double valor) {
		this.valor -= (valor + 5);
	}
		
	public String toString() {
		return "Conta "
				+ numero
				+", "
				+ "Titular: "
				+ nome
				+", "
				+"saldo: "
				+ "R$ "
				+ valor;
				
	}
	

}
