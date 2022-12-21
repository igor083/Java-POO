package testeDeEntidade;
import java.util.Scanner;

import entidade.ContaBancaria;

public class BancoMain {
	public static void main(String args[]) {
	Scanner x = new Scanner(System.in);
	double deposito;
	System.out.println("Digite seu nome: ");
	String nome = x.nextLine();
	System.out.println("Digite o numero da conta: ");
	int numConta = x.nextInt();
	ContaBancaria conta = new ContaBancaria(nome,numConta);
	System.out.println("Voce deseja realizar um saque inicial? (Sim ou Nao)");
	String escolha = x.next();
	
	if (escolha.toUpperCase().equals("SIM")) {
		System.out.println("Digite o valor a ser depositado: ");
		deposito=x.nextDouble();
		conta.Deposito(deposito);
	}
	System.out.println(conta);
	//FIm da criação da conta.
	
	//Operacao de deposito
	System.out.println("Digite o valor a ser depositado: ");
	deposito=x.nextDouble();
	conta.Deposito(deposito);
	System.out.println(conta);
	
	//Operacao de saque
	System.out.println("Digite o valor a ser sacado: ");
	double saque=x.nextDouble();
	conta.Saque(saque);
	System.out.println(conta);
	x.close();
	}
}
