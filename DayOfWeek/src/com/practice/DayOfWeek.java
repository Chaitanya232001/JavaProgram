package com.practice;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("day");
		int day=scan.nextInt();
		if (day ==1)
			System.out.println("Monday");
		else if(day ==2)
			System.out.println("Tuesaday");
		else if(day ==3)
			System.out.println("wednesday");
		else if(day ==4)
			System.out.println("Thursday");
		else if(day ==5)
			System.out.println("Friday");
		else if(day ==6)
			System.out.println("saturday");
		else if(day==7)
			System.out.println("Sunday");
		else 
			System.out.println("Invalid Option");
	}

}
