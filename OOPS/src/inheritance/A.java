package inheritance;

import java.util.Scanner;

public class A {
	public void tariff(int p,int d,String r,int t,int dis) {
		// TODO Auto-generated method stub
	
		int sum=p*d*t;
		int temp=dis/100;
		int tariff=sum*temp;
		System.out.println("Total tariff:"+tariff+"/-");
		
	}
	public void tariff1(int p,int d,String r,int t,int pe) {
		// TODO Auto-generated method stub
	
		int sum=p*d*t*pe;
		
		System.out.println("Total tariff:"+sum+"/-");
		
	}
		
		
	}


