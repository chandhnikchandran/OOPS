package encapsulation;

import java.util.Scanner;
public class Casestudy4 {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	Ticket1 obj=new Ticket1();
	System.out.println("Enter Price of a ticket :");
	obj.setPrice(s.nextInt());
	System.out.println("Enter Number of Persons :");
	obj.setP(s.nextInt());
	int a=obj.getP();
	String Name[]=new String[25];
	String Gender[]=new String[10];
	int Age[]=new int[5];
	int m=a;
	int j=1,i;
	int k=1;
	for(i=0;i<a;i++)
	{
	System.out.printf("Enter Details for Person %d :\n",j);
	System.out.println("Name:");
	obj.setName(s.next());
	String na=obj.getName();
	Name[i]=na;
	System.out.println("Gender (M or F) :");
	obj.setGender(s.next());
	String g=obj.getGender();
	Gender[i]=g;
	System.out.println("Age :");
	obj.setAge(s.nextInt());
	int ag=obj.getAge();
	Age[i]=ag;
	j++;

	}
	obj.ticket(obj.getP(),obj.getPrice());
	while(k<=obj.getP())
	{
	double total=obj.ticket1(obj.getAge(),obj.getGender(),obj.getP(),obj.getPrice());

	if(k==obj.getP()) {
		
		System.out.printf("TOTAL AMOUNT=%.1f",total);
		break;
	}
	k++;
	}
	System.out.printf("\nPasenger Details...\n");
	int q=1;
	for(i=0;i<m;i++)
	{
		System.out.printf("%d)%s(%s %d)\n",q,Name[i],Gender[i],Age[i]);
		q++;
	}
	}
}

