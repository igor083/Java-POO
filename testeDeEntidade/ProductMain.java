package testeDeEntidade;

import java.util.Scanner;

import entidade.Product;

public class ProductMain {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do produto:");
		String nome = input.nextLine();
		System.out.println("Digite o preço do produto:");
		double valor = input.nextFloat();
		
		Product tv = new Product() ;
		tv.setNome(nome);tv.setValor(valor);
		
		System.out.println(tv.getQuantidade());
		System.out.println(tv);
		tv.addProduct(20);
		System.out.println("Valor atualizado: "+tv.valorEmEstoque());;
		System.out.println("Quantidade atualizada: "+tv.getQuantidade());
		
		
		
		input.close();
	}
}
