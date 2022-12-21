package entidade;

public class ContaBancaria {
	private String nome;
	private int numConta;
	private double saldo;
	public ContaBancaria() {}
	
	public ContaBancaria (String nome,int numConta) {
		this.nome=nome;
		this.numConta=numConta;
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return "\nNome: " + nome 
				+ "\nNumero da conta:" + numConta 
				+ "\nSaldo: " + String.format("$%.2f", saldo);
	}
	
	public void Saque(double saque) {
		if(saldo - (saque+5)> 0 )this.saldo-=(saque+5);
		else {System.out.println("Transacao indisponivel. ");}
	}
	public void Deposito(double deposito) {
		if(deposito>0)this.saldo+=deposito;
		
	}
	
}
