package polymorphism;

import java.util.Scanner;

public class Car {
	public static void main(String[] arg)
	  {
		  Scanner s =new Scanner(System.in);
	    System.out.println("1.Car");
	    System.out.println("2.Bike");
	    int n=s.nextInt();
	    Car1 obj1=new Car1();
	    Bike obj2=new Bike();
	    if(n==2)
	    {
	    	System.out.println("Enter the details of bike");
	    	System.out.println("Enter the color:");
	    	String c=s.next();
	    	System.out.println("Enter the Maximum speed:");
	    	int sp=s.nextInt();
	    	System.out.println("Enter number of seats:");
	    	int se=s.nextInt();
	    	System.out.println("Enter the number of wheels:");
	    	int we=s.nextInt();
	    	System.out.println("Enter the status of disbreak(true/false):");
	    	String dis=s.next();
	    	obj2.display(c,sp,se,we,dis);
	    	
	    }
	    else if(n==1)
	    {
	    	System.out.println("Enter the details of Car");
	    	System.out.println("Enter the color:");
	    	String c=s.next();
	    	System.out.println("Enter the Maximum speed:");
	    	int sp=s.nextInt();
	    	System.out.println("Enter number of seats:");
	    	int se=s.nextInt();
	    	System.out.println("Enter the number of wheels:");
	    	int we=s.nextInt();
	    	System.out.println("Enter the number of doors:");
	    	int d=s.nextInt();
	    	System.out.println("Enter the status AC(true/false):");
	    	String dis=s.next();
	    	obj1.display(c,sp,se,we,dis,d);
	    	
	    }
	    else
	    {
	    	System.out.println("Invalid Option");
	    }
	    
	    
	  }

}


class Bike{
	public void display(String c, int sp, int se, int we, String dis) {
		// TODO Auto-generated method stub
		System.out.println("Bike details..");
		System.out.println("color:"+c);
		System.out.println("speed:"+sp);
		System.out.println("Number of seats:"+se);
		System.out.println("Number of wheels:"+we);
		System.out.println("Disk Break:"+dis);
		
	}
}
	
class Car1{
	public void display(String c, int sp, int se, int we, String dis,int d) {
		// TODO Auto-generated method stub
		System.out.println("Car details..");
		System.out.println("color:"+c);
		System.out.println("speed:"+sp);
		System.out.println("Number of seats:"+se);
		System.out.println("Number of wheels:"+we);
		System.out.println("Number of doors:"+d);
		System.out.println("AC:"+dis);
	}
		
		
	}
	
	

