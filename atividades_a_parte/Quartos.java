package atividades_a_parte;

public class Quartos {
	
	private String nome,email;
	
	
	public Quartos(String nome ,String email) {
		this.email=email;
		this.nome=nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


	@Override
	public String toString() {
		return "Quartos [nome=" + nome + ", email=" + email;
	}




}
