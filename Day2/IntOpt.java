package day2;
import java.util.*;
public class IntOpt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of a=");
		a=scan.nextInt();
		int b;
		System.out.println("Enter the value of b=");
		b=scan.nextInt();
		int c;
		System.out.println("Enter the value of c=");
		c=scan.nextInt();
		scan.close();
		new IntOpt(a,b,c);
	}
	IntOpt(int a,int b,int c){
		int result1=a+b*c;
		System.out.println("result1="+result1);
		int result2=a*b+c;
		System.out.println("result2="+result2);
		int result3=c+a/b;
		System.out.println("result3="+result3);
		int result4=a%b+c;
		System.out.println("result4="+result4);
	}
	

}
