package day2;

public class ErrorExample {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result1=add(a,b);
		System.out.println(result1);
		int result2=div(a,b);
		System.out.println(result2);
	}
	 static int add(int a,int b) {
		return a+b;
	}
	int mul(int a,int b) {
		return a*b;
	}
}
