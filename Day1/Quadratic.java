package day1;
import java.util.*;
import java.math.*;
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("a=");
		a=sc.nextDouble();
		double b;
		System.out.println("b=");
		b=sc.nextDouble();
		double c;
		System.out.println("c=");
		c=sc.nextDouble();
		sc.close();
		new Quadratic(a,b,c);
	}
	
	 Quadratic(double a,double b,double c){
		
		double delta=b*b-4.0*a*c;
		double sqrt=Math.pow(delta,0.5);
		double x1=(-b +(sqrt/2.0*a));
		System.out.println("x1="+x1);
		double x2=(-b-(sqrt/2.0*a));
		System.out.println("x2="+x2);
		
	}

}
