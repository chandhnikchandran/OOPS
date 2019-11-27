package polymorphism;

import java.util.Scanner;

public class Casestudy2 {
	public static void main(String[] arg)
	  {
		  Scanner s =new Scanner(System.in);
		 
		  System.out.println("Enter Telephone Bill Number:");
		  int tno=s.nextInt();
		  System.out.println("Enter the Customer Name:");
		  String cname=s.next();
		  System.out.println("Enter the Number of Calls made :");
		  int nc=s.nextInt();
		  System.out.println("Enter the Cost per Call :");
		  double costc=s.nextDouble();
		  System.out.println("Enter the Current Bill Number :");
		  int bn=s.nextInt();
		  System.out.println("Enter the Customer Name:");
		  String custname=s.next();
		  System.out.println("Enter the Number of Units Consumed:");
		  int uc=s.nextInt();
		  System.out.println("Enter the Cost per Unit :");
		  int costu=s.nextInt();
		  
		  Telephonebill tb=new Telephonebill();
		  tb.Bill(tno,cname,nc,costc);
		  Currentbill cb=new Currentbill();
		  cb.Bill(bn,custname,uc,costu);
	  }

}
