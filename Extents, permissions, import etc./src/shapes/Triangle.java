package shapes;

public class Triangle extends Shape_2D{
	protected double length, breadth;
	double computeArea(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
		return(((double)1/(double)2)*breadth*length);
	}
	public double area(double length, double breadth) {
		return(computeArea(length,breadth));
	}
	public double area() {
		return(computeArea(length,breadth));
	}
	public Triangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public Triangle(){
		System.out.println("TRIANGLE!");
	}
}
