package atividades_a_parte;

import java.util.Scanner;

public class QuartosMain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		System.out.println("Informe a quantidade de quartos a serem ocupados: ");
		int numerodeQuartos= scanner.nextInt();
		Quartos vetor[] = new Quartos[10];
		System.out.println();
		for(int i =0; i<numerodeQuartos;i++) {
			System.out.println("Digite o nome: ");
			x.nextLine();
			String nome = x.nextLine();
			
			System.out.println("Digite o email: ");
			String email = x.next();
			
			System.out.println("Digite o quarto: ");
			int quarto = x.nextInt();
			
			
			
			vetor[quarto]=new Quartos(nome,email);
			
		}
		for (int i=0;i<10;i++){
			System.out.println(vetor[i]);
		}
			
			
			
			
			scanner.close();
		
	}
}
