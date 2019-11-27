package singleinheritance;

import java.util.Scanner;

public class Casestudy2 {
	public static void main(String[] arg) {
	Scanner s=new Scanner(System.in);
	System.out.println("Booking");
	System.out.println();
	System.out.println("Enter Number of Persons:");
	int p=s.nextInt();
	System.out.println("Enter Number of days:");
	int d=s.nextInt();
	System.out.println("Enter Room Type:");
	String r=s.next();
	System.out.println("Enter Month:");
	int m=s.nextInt();
	C obj2=new C();
	B obj1= new B();
	System.out.println("Enter the tariff for single person");
	int t=s.nextInt();
	if(m==4||m==5||m==6||m==9||m==11||m==12)
	{
		System.out.println("Enter PeakCharge:");
		int pe=s.nextInt();
		obj2.tariff1(p,d,m,pe,t);
		
	}
	else {
	System.out.println("Enter Discount:");
	int dis=s.nextInt();
	obj1.tariff(p,d,m,t,dis);
	}

}}
