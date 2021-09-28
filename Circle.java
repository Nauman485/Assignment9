package geekster;
import java.util.*;

public class Circle {
	
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	double r=sc.nextDouble(); 
	sc.close();
	double ar=area(r);
	System.out.println("Area="+ar);
	double pr=area(r);
	System.out.println("Perimeter="+pr);
	}
	
	public static double area(double r) {
		return Math.PI*(r*r);
	}
	
	public static double perimeter(float r) {
		return 2*Math.PI*r;
	}

}
