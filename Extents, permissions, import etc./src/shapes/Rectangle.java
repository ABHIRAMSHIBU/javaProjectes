package shapes;

public class Rectangle extends Triangle{
	double computeArea(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
		return(breadth*length);
	}
	public Rectangle(){
		System.out.println("RECTANGLE!");
	}
	public Rectangle(double length, double breadth){
		super(length,breadth);
	}
}
