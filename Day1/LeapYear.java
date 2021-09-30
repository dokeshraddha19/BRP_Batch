package day1;

import java.util.Scanner;


public class LeapYear {
	@SuppressWarnings("unused")
	public static  void main(String[] args) {
		LeapYear leapyear=new LeapYear();

		
	}
	LeapYear(){
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the Year to check Leap year or not= ");
		year=sc.nextInt();
		sc.close();
		
		if(year >=1582) {
			if(((year%4==0) && (year%100!=0))||(year%400==0)) {
				System.out.println(year +" is leap year");
			}else {
				System.out.println(year +" is not leap year");
			}
				
		}else {
			System.out.println("The year is not from Gregorian Calender");
	}

	}

}
