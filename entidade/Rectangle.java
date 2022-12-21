package entidade;

public class Rectangle {
	@Override
	public String toString() {
		return "Area: " + String.format("%.2f",this.Area()) + "\nPerimeter: " + String.format("%.2f",this.Perimeter()) + "\nDiagonal: " + String.format("%.2f",this.Diagonal());
	}

	public double Width,Height;
	
	public double Area() {		
		return this.Height*this.Width;
	}
	public double Perimeter() {
		return this.Height*2 + this.Width*2;
	}
	
	public double Diagonal() {
		double baseQua = this.Width*this.Width;
		double alturaQua = this.Height*this.Height;
		return Math.sqrt(baseQua + alturaQua);
	}
}
