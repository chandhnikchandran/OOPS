package interfac;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=s.next();
		System.out.println("Enter the Id:");
		int id=s.nextInt();
		System.out.println("Enter the total:");
		int total=s.nextInt();
		Student1 st=new Student1();
		st.detail(name,id);
		st.total(total);
		
	}

}
interface rank{
	public void detail(String name,int id);
}
interface total{
	public void total(int total);
}
class Student1 implements rank,total
{
	public void detail(String name,int id)
	{
		System.out.println("Name ->"+name);
		System.out.println("Student Id :"+id);
	}
	public void total(int total)
	{
		System.out.println("total ->"+total);
	}
}