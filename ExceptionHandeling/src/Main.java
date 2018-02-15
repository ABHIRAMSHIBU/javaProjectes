import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Entered String is : "+a);
		scan.close();
		try {
			System.out.println(1/a);
			Bla();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
		catch(Exception e) {
			System.out.println("Other exceptions will be caught here!");
		}
	}
	static void Bla() throws FileNotFoundException{
		throw new FileNotFoundException();
	}

}
