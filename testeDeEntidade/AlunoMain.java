package testeDeEntidade;

import java.util.Scanner;

import entidade.Aluno;

public class AlunoMain {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner x = new Scanner(System.in);
		aluno.Nome = x.nextLine();
		aluno.Notas();
		aluno.Resutado();
		x.close();
	}

}
