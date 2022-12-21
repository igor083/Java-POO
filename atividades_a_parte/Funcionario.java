package atividades_a_parte;

public class Funcionario {
	@Override
	public String toString() {
		return "id=" + id 
				+ ", nome=" + nome 
				+ ", salario=" + salario ;
	}
	private String id,nome;
	private double salario;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}


	public Funcionario (String id,String nome,double salario) {
		this.id=id;
		this.nome=nome;
		this.salario=salario;
	}
	public void mudaSalario(double porcentagem) {
		porcentagem/=100;
		this.salario= salario*(porcentagem+1);
	}
}
