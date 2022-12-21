package testeDeEntidade;
import java.util.Scanner;

import entidade.CurrencyConverter;

public class CurrencyConverterMain {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.print("What is the dollar price?");
		CurrencyConverter.dollarPrice = x.nextDouble();
		System.out.print("How many dollar will be brought?");
		double quantDollar = x.nextDouble();
		System.out.print("Amount to be paid in reais = ");
		System.out.printf("%.2f",CurrencyConverter.realDollar(quantDollar));
		x.close();
		
	}
}
