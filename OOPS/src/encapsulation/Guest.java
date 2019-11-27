package encapsulation;

import java.util.Scanner;

public class Guest {
	public static void main(String[] pgk)
	{
		Scanner s=new Scanner(System.in);
		
		Register re=new Register();
		
		System.out.println("Enter the Number:");
		re.setNumber(s.next());
		System.out.println("Enter your Name:");
		re.setName(s.next());
		System.out.println("Enter your Address:");
		re.setAddress(s.next());
		System.out.println("Enter Contact Number:");
		re.setContactnumber(s.next());
		System.out.println("Enter your Email:");
		re.setEmail(s.next());
		System.out.println("Enter Proof Type:");
		re.setProoftype(s.next());
		System.out.println("Enter Proof Id:");
		re.setProofid(s.next());
		re.check();
		
	}
}
