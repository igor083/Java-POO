package entidade;

public class Triangulo {
	public int a,b,c;

	
	
	public void printaTri() {
		
		System.out.printf("%d %d %d \n",a,b,c);
	}
	public double areaTri() {
		
		return (a*b)/2;
	}
}
