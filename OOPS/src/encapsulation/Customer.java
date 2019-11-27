package encapsulation;

import java.util.Scanner;

public class Customer {
public static void main(String[] pgk)
{
	Scanner s=new Scanner(System.in);
	
	Details de=new Details();
	Display dis=new Display();
	System.out.println("Registration\n");
	System.out.println("Enter your Name:");
	de.setName(s.next());
	System.out.println("Enter your Address:");
	de.setAddress(s.next());
	System.out.println("Enter Contact Number:");
	de.setContactnumber(s.nextInt());
	System.out.println("Enter your Email:");
	de.setEmail(s.next());
	System.out.println("Enter Proof Type:");
	de.setProoftype(s.next());
	System.out.println("Enter Proof Id:");
	de.setProofid(s.next());
	System.out.println("Thank you for Registering...your id is "+de.getI());
	dis.view(de.getName(),de.getAddress(),de.getContactnumber(),de.getEmail(),de.getProoftype(),de.getProofid());
}
}
