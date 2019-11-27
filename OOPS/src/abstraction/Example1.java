package abstraction;

import java.util.Scanner;

public class Example1 {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name:");
	String name=s.next();
	System.out.println("Enter id:");
	int id=s.nextInt();
	System.out.println("Enter Marks:");
	//int id=s.nextInt();
	System.out.println("Enter id:");
	//int id=s.nextInt();
	Student std=new Student();
	std.totalmark(name,id);
}
}
abstract class rank{
	abstract void totalmark(String name,int id);
	public void rank1() {
		System.out.println("Rank2");
	}
}
class Student extends rank
{
	void totalmark(String name,int id) {
		System.out.println("Total mark->455");
		super.rank1();
	}
}