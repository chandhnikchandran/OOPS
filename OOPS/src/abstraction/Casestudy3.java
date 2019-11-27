package abstraction;

import java.util.Scanner;

public class Casestudy3 {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Registration\n");
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Contact Number");
		String contactnumber=s.next();
		System.out.println("E-mail ID");
		String email=s.next();
		System.out.println("Enter Proof type");
		String prooftype=s.next();
		System.out.println("Enter Proof id");
		String proofid=s.next();
		String pr="";
		Registration r=new Registration();
		r.display(name,address,contactnumber,email,prooftype,proofid);
		System.out.println("Do you want to continue registration(y/n)");
		pr=s.next();
		if (pr.equals("y")==true)
		{
			r.update(name,address,contactnumber,email,prooftype,proofid);
			
		}
		else
		{
			return;
		}
	}

}
abstract class Customer
{
	Scanner s=new Scanner(System.in);
	abstract void display(String name, String address, String contactnumber, String email, String prooftype,
			String proofid);
	public void update(String name, String address, String contactnumber, String email, String prooftype,
			String proofid) {
		// TODO Auto-generated method stub
		System.out.println("Update Email");
		System.out.println("Enter your new Email id");
		String email1=s.next();
		System.out.println("Email Updated\n");
		System.out.println("Your details are as follows");
		System.out.println("name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+contactnumber);
		System.out.println("Email:"+email1);
		System.out.println("Proof Type:"+prooftype);
		System.out.println("Proof Id:"+proofid);
	}
}
class Registration extends Customer{

	public void display(String name, String address, String contactnumber, String email, String prooftype,
			String proofid) {
		// TODO Auto-generated method stub
		System.out.println("Registration\n");
		System.out.println(name);
		System.out.println(address);
		System.out.println(contactnumber);
		System.out.println(email);
		System.out.println(prooftype);
		System.out.println(proofid);
		System.out.println("Thank you for registering. Your id is 1...");	
	
	//super.Customer();
	}
	
	
}
