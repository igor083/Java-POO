package testeDeEntidade;

import java.util.Scanner;
import entidade.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee pessoa = new Employee();
		Scanner input = new Scanner(System.in);
		double aumento = 0;
		System.out.print("Name: ");
		pessoa.Name = input.nextLine();
		System.out.print("Gross Salary: ");
		pessoa.GrossSalary = input.nextDouble();
		System.out.print("Tax: ");
		pessoa.Tax = input.nextFloat();

		System.out.println(pessoa);

		System.out.print("Escolha qual a porcentagem" + " de aumento no salario: ");
		aumento = input.nextDouble();

		pessoa.IncreaseSalary(aumento);

		System.out.println("Updated data: " + pessoa);

		input.close();
	}

}
