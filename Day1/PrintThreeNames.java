package day1;
import java.util.*;
public class PrintThreeNames {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		PrintThreeNames print_threenames=new PrintThreeNames();
		
	}
	PrintThreeNames(){
		int n=3;
		Scanner sc=new Scanner(System.in);
		String[] Names=new String[10];
		System.out.println("Enter the element of an array");
		
		for(int i=0;i<n;i++) {
			Names[i]=sc.nextLine();
			
		}
		System.out.print("Hii"+" ");
		System.out.println(Names[2]+", "+Names[1]+","+Names[0]+".");
			sc.close();
		
	}
	

}
