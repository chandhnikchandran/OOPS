package singleinheritance;

import java.util.Scanner;

public class Single {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Booking");
		System.out.println();
		System.out.println("Enter Number of Persons:");
		int n=s.nextInt();
		System.out.println("Enter Number of days:");
		int d=s.nextInt();
		System.out.println("Enter Room Type:");
		String r=s.next();
		System.out.println("Enter the tariff for single person");
		int t=s.nextInt();
		SeasonBooking obj= new SeasonBooking();
		obj.tariff(n,d,r,t);
	
		
	}

	

}
