package entidade;

public class CurrencyConverter {
	public static double dollarPrice;
	
	public static double realDollar(double quantDollar) {
		return dollarPrice*quantDollar*1.06; 
	}
}
