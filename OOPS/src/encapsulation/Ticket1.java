package encapsulation;

import java.util.Scanner;

public class Ticket1 {
int price;
int p;
String name;
String gender;
int age;
int i=1,j=0;
double total=0,sum=0;
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getP() {
	return p;
}
public void setP(int p) {
	this.p = p;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void ticket(int p,int price)
{
	System.out.println("TICKET DETAILS ARE....\n");
	System.out.printf("NO.OF PASSENGERS:%d\n",p);
	System.out.printf("PRICE OF TICKET:%d\n",price);
}
double ticket1(int age,String gender,int p,int price)
{
			j++;total=0;
			double m=.25,o=.10,q=.50;
		if(age<16)
		{
			total=(double)sum+(price-(price*q));
			sum=total;
			return total;
		}
		else if(gender.contentEquals("F")==true&&age>=16)
		{
			total=sum+(price-price*o);
			sum=total;
			return total;
		}
		else if(age>64)
		{
			total=sum+(price-price*m);
			sum=total;
			return total;
		}
		else
		{
			total=sum+price;
			sum=total;
			return total;
		}
	
}
}
