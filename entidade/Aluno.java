package entidade;

import java.util.Scanner;

public class Aluno {
	public String Nome;
	public double trim[] = new double[3];
	double Soma;
	Scanner input = new Scanner(System.in);
		
	
	public void Resutado() {
		if (this.Soma<90) {
			System.out.print(this.Nome+"\nFINAL GRADE = " + this.Soma+ "\nFAILED"+
			"\nMISSING "+ (60-this.Soma)+ "POINTS");
			
		}
		else {
			System.out.print(this.Nome+"\nFINAL GRADE = " + this.Soma+ "\nPASS");
		}
	}
	
	public void Notas() {
		for(int i =0;i<3;i++) {
			System.out.printf("%da Nota: ",i+1);
			this.trim[i] = input.nextDouble();
			this.Soma+=this.trim[i];
		}
			
		
	}
}
