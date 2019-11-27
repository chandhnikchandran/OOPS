package singleinheritance;

public class A {
	public void tariff(int p,int d,int m,int t,int dis) {
		// TODO Auto-generated method stub
	
		int sum=p*t*d;
		int temp=dis*30;
		int tariff=sum-temp;
		System.out.println("Total tariff:"+tariff+"/-");
		
	}
	public void tariff1(int p1,int d1,int m1,int t1,int pi) {
		// TODO Auto-generated method stub
	
		int sum=p1*t1*d1;
		int temp=pi*m1;
		int tariff=sum+temp;
		System.out.println("Total tariff:"+tariff+"/-");
		
	}
}
