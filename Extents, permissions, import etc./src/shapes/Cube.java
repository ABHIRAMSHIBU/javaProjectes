package shapes;

public class Cube extends Cuboid {
	public Cube(){
	}
	public Cube(double length) {
		this.length=length;
		this.breadth=length;
		this.height=length;
	}
	public double area(double length) {
		this.length=length;
		this.breadth=length;
		this.height=length;
		return(computeArea(this.length,this.breadth,this.height));
	}
	public double area() {
		return(computeArea(this.length,this.breadth,this.height));
	}
	public double volume(double length) {
		this.length=length;
		this.breadth=length;
		this.height=length;
		return(computeVolume(this.length,this.breadth,this.height));
	}
	public double volume() {
		return(computeVolume(this.length,this.breadth,this.height));
	}
}
