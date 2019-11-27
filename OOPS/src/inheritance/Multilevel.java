package inheritance;

import java.util.Scanner;

public class Multilevel {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		String n=s.next();
		Stud ob=new Stud();
		ob.about();
		ob.princi();
		ob.teach();
		ob.details(n);
	}

}
