package atividades_a_parte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioListaMain {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		System.out.println("Digite a quantidade de funcionarios " + "que deseja adicionar:");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {

			scanner.nextLine();
			System.out.println("Digite o ID do funcionario:");
			String id=scanner.nextLine();
			id=verificaId(id,lista);
			
			System.out.println("Digite o Nome do funcionario:");
			String nome = scanner.nextLine();
			nome=nome.toLowerCase();
			System.out.println("Digite o salario do funcionario:");
			double salario = scanner.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
			System.out.print("limpa buffer: \n");
			scanner.nextLine();
		}
		for (Funcionario x : lista) {
			System.out.println(x+";");
		}
		System.out.println("Digite o id e em seguida a porcentagem de aumento:");
		String id = scanner.nextLine();
		
		if(achaFuncionario(id,lista)==null) {
			System.out.println("Id invalidado, programa abortado!");
			}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = scanner.nextDouble();
			Funcionario a = achaFuncionario(id,lista);
			a.mudaSalario(porcentagem);
		}
		
		
		
		
		
		for (Funcionario x : lista) {
			System.out.println(x+";");
		}
		scanner.close();
	}
	
	private static String verificaId(String id,List<Funcionario> lista) {
		for(Funcionario x : lista) {
			while(x.getId().equals(id)){
			System.out.println("Digite um id valido: ");
			id=scanner.nextLine();}
		}
		return id;
		
	}
	
	public static Funcionario achaFuncionario(String id,List<Funcionario> lista) {
		for(Funcionario y:lista) {
			if(y.getId().equalsIgnoreCase(id)) {
				return y;
			}
		}
		return null;
	}
}
