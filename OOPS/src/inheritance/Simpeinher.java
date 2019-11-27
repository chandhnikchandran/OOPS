package inheritance;
import java.util.Scanner;


public class Simpeinher {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Speed:");
		int a=s.nextInt();
		Car2 ob=new Car2();
		ob.about();
		ob.name();
		ob.speed(a);
	}
}
