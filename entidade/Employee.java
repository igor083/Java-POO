package entidade;

public class Employee {
	@Override
	public String toString() {
		return Name + ", " + String.format(
				"$%.2f",NetSalary());
	}
	public String Name;
	public double GrossSalary,Tax;
	
	public double NetSalary() {
		return this.GrossSalary - this.Tax;
	}
	public void IncreaseSalary( double percentage) {
		double porCent = percentage/100 + 1;
		this.GrossSalary *=porCent;
	}
}
