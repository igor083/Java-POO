package testeDeEntidade;
import java.util.Scanner;

import entidade.Triangulo;

public class TrianguloMain {
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		Triangulo triA, triB;
		triA = new Triangulo();
		triB = new Triangulo();
		
		double areaA = triA.areaTri();
		double areaB = triB.areaTri();
		triA.a=2;
		triA.b=2;
		triA.c=2;
		triB.a=56;
		triB.b=56;
		triB.c=56;
		
		triA.printaTri();
		triA.printaTri();
		System.out.println(areaA);
		System.out.println(areaB);
		
		input.close();
	}
}
