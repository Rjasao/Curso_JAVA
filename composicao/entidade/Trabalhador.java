package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.NivelDeTrabalho;

public class Trabalhador {
	
	private String name;
	private NivelDeTrabalho nivel;
	private Double baseSalario;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String name, NivelDeTrabalho nivel, Double baseSalario, Departamento departamento) {
		super();
		this.name = name;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelDeTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelDeTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	//public void setContratos(List<ContratoHora> contratos) {
	//	this.contratos = contratos;
	//}
	
	public void addContrato (ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato (ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double  renda(int ano, int mes) {
		
        double soma = baseSalario;	
		
		Calendar cal = Calendar.getInstance();
		
		for (ContratoHora c : contratos) {
			
			cal.setTime(c.getDate());
			
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if(ano == c_ano && mes == c_mes) {
			soma += c.valorTotal();
			}
		}
		
		return soma;
	}

	

}
