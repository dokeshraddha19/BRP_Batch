package day2;
import java.util.*;
public class Distance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the x=");
		x=sc.nextInt();
		int y;
		System.out.println("Enter the y=");
		y=sc.nextInt();
		sc.close();
		double square=Math.pow(x,2)+Math.pow(y, 2);
		double calculatedistance=Math.pow(square, 0.5);
		System.out.println("calculatedistance = "+calculatedistance);
	}

}
