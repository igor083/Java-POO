package entidade;

public class Product {

	private String nome;
	private double valor;
	private int quantidade;
	
	public Product() {}
	public Product(String nome,double valor) {
		this.nome=nome;
		this.valor=valor;
	}
	public Product(String nome,double valor, int quantidade) {
		this.nome=nome;
		this.quantidade=quantidade;
		this.valor=valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	/*public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}*/ //so podera ser merxido caso haja uma adicao
	
	
	public double valorEmEstoque() {
		
		return valor*quantidade;}
	
	public void addProduct(int num) {
		quantidade = quantidade+num;
	}
	
	public void removeProduct(int quantidade) {
		this.quantidade=this.quantidade-quantidade;
	}
	@Override
	public String toString() {
		return "nome= " 
				+ nome 
				+ ", valor= " 
				+ valor 
				+ ", quantidade= " 
				+ quantidade;
	}
}
