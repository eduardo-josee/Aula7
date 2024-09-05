package Entidade;

public class Funcionarios {
	
	private String nome;
	private Cargo Tipo;
	private double salario;
	public Funcionarios(String nome, Cargo Tipo, double salario) {
		super();
		this.nome = nome;
		this.Tipo = Tipo;
		this.salario = salario;
	}
	 
	public String getNome() {
	return nome;
	}
	
	public Cargo getTipo() {
		return Tipo;
	}
	public double getSalario() {
	return salario;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
