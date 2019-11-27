package inheritance;

import java.util.Scanner;

public class Hierachical {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Two digits:");
		int a=s.nextInt();
		int b=s.nextInt();
		B obj1=new B();
		C obj2=new C();
		//obj1.op();
		obj1.add(a,b);
		//obj2.sub(a,b);
		//obj2.display();
	}
	

}
