package testeDeEntidade;

import java.util.Scanner;

import entidade.Rectangle;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle ret = new Rectangle();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter rectangle width and height: ");
		System.out.println("Width: ");
		ret.Width = input.nextDouble();
		System.out.println("Height: ");
		ret.Height = input.nextDouble();
		System.out.println(ret);

		input.close();

	}

}
