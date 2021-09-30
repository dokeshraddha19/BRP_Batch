package day1;
import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		sc.close();

		if ((month == 3 && day >= 20 && day < 31) || (month == 4 && day <= 30) || (month == 5 && day <= 31)
				|| (month == 6 && day <= 20)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
