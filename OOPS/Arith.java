package oops;

import java.util.Scanner;

public class Arith {
	public static void main(String[] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number1");
		int a=s.nextInt();
		System.out.println("Enter the number2");
		int b=s.nextInt();
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
		int n=s.nextInt();
		Operation c=new Operation(a,b);
		switch(n)
		{
		
		case 1:
			Operation.add(a,b);
			break;
		case 2:
			Operation.sub(a,b);
			break;
		case 3:
			Operation.mul(a,b);
			break;
		case 4:
			Operation.div(a,b);
			break;
		case 5:
			Operation.mod(a,b);
			break;
			
		}
	}

}
class Operation{
	int a,b;
	public Operation(int a,int b) {
		a=a;
		b=b;
		
	}
	public static void add(int a,int b) {
		System.out.printf("Add->%d",a+b);
	}
	public static void sub(int a,int b) {
		System.out.printf("Sub->%d",a-b);
	}
	public static void mul(int a,int b) {
		System.out.printf("Mul->%d",a*b);
	}
	public static void div(int a,int b) {
		System.out.printf("Div->%d",a/b);
	}
	public static void mod(int a,int b) {
		System.out.printf("Mod->%d",a%b);
	}
}
