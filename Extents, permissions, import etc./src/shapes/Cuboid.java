package shapes;

public class Cuboid extends Shape_3D{
	protected double length, breadth, height;
	double computeArea(double length, double breadth, double height) {
		return(2*(length*breadth+breadth*height+height*length));
	}
	public double area(double length, double breadth, double height) {
		this.length=length;
		this.height=height;
		this.breadth=breadth;
		return computeArea(length,breadth,height);
	}
	public double area() {
		return(computeArea(this.length, this.breadth, this.height));
	}
	public double volume(double length, double breadth, double height) {
		this.length=length;
		this.height=height;
		this.breadth=breadth;
		return computeVolume(length,breadth,height);
	}
	public double volume() {
		return computeVolume(this.length, this.breadth, this.height);
	}
	double computeVolume(double length, double breadth, double height) {
		return(length*breadth*height);
	}
	public Cuboid() {
		
	}
	public Cuboid(double length, double breadth, double height) {
			this.length=length;
			this.breadth=breadth;
			this.height=height;	
	}
}
