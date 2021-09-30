package day2;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a;
		System.out.println("Enter the value of a=");
		a=scan.nextDouble();
		double b;
		System.out.println("Enter the value of b=");
		b=scan.nextDouble();
		double c;
		System.out.println("Enter the value of c=");
		c=scan.nextDouble();
		scan.close();
		new DoubleOpt(a,b,c);
	}
	DoubleOpt(double a,double b,double c){
		double result1=a+b*c;
		System.out.println("result1="+result1);
		double result2=a*b+c;
		System.out.println("result2="+result2);
		double result3=c+a/b;
		System.out.println("result3="+result3);
		double result4=a%b+c;
		System.out.println("result4="+result4);
	}
	


}
