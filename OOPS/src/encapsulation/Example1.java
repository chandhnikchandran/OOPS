package encapsulation;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Student1 st=new Student1();
		System.out.println("Enter the Name:");
		st.setName(s.next());
		System.out.println("Enter the Id:");
		st.setId(s.nextInt());
		System.out.println("name: "+st.getName());
		System.out.println("id: "+st.getId());
		
	}

}
