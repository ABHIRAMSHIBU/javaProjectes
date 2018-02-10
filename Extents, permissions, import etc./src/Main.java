import shapes.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double a,b,c;
		System.out.print("Enter 'a' :");
		a=scan.nextDouble();
		System.out.print("Enter 'b' :");
		b=scan.nextDouble();
		System.out.print("Enter 'c' :");
		c=scan.nextDouble();
		scan.close();
		/** 
		 * Idk how the hell below statement works
		 * a,b,c are final, but I am able to assign a value to them for some reason.
		 * If you know why, please tell me....
		 */
		System.out.println("Entered Values of a is "+a+", b is "+b+" and c is "+c);
		System.out.println("Triangle : Empty Constructor!");
		Triangle obj1 = new Triangle();
		System.out.println(obj1.area(a, b));
		System.out.println("Triangle : Parmetrised constructor");
		Triangle obj2 = new Triangle(a, b);
		System.out.println(obj2.area());
		System.out.println("Rectangle : Empty Constructor!");
		shapes.Rectangle obj3 = new shapes.Rectangle();
		System.out.println("Rectangle : Parametrised constructor");
		Rectangle obj4 = new Rectangle(a,b);
		System.out.println(obj3.area(a,b));
		System.out.println(obj4.area());
		Cube obj5 = new Cube(a);
		Cube obj6 = new Cube();
		System.out.println("Cube : Empty Constructor");
		System.out.println("The area is :"+obj5.area());
		System.out.println("The volume is :"+obj5.volume());
		System.out.println("Cube : Parametrised Constructor");
		System.out.println("The area is :"+obj6.area(a));
		System.out.println("The volume is :"+obj6.volume(a));
		Cuboid obj7 = new Cuboid(a,b,c);
		Cuboid obj8 = new Cuboid();
		System.out.println("Cuboid : Empty Constructor");
		System.out.println("The area is :"+obj7.area());
		System.out.println("The volume is :"+obj7.volume());
		System.out.println("Cuboid : Parametrised Constructor");
		System.out.println("The area is :"+obj8.area(a,b,c));
		System.out.println("The volume is :"+obj8.volume(a,b,c));
	}
}
