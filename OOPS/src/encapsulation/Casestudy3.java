package encapsulation;
import java.util.Scanner;
public class Casestudy3 {
	public static void main(String[] pgk)
	{
		Scanner s=new Scanner(System.in);
		Ticket obj=new Ticket();
		System.out.println("Enter Price of a ticket :");
		obj.setPrice(s.nextInt());
		System.out.println("Enter Number of Persons :");
		obj.setP(s.nextInt());
		int a=obj.getP();
		int i=1;
		int k=1;
		do
		{
		System.out.printf("Enter Details for Person %d :\n",i);
		System.out.println("Name:");
		obj.setName(s.next());
		System.out.println("Gender (M or F) :");
		obj.setGender(s.next());
		System.out.println("Age :");
		obj.setAge(s.nextInt());
		i++;
		a--;
		}while(a>0);
		
		obj.ticket(obj.getP(),obj.getPrice());
		//ss=total;
		while(k<=obj.getP())
		{
		
		double total=obj.ticket1(obj.getAge(),obj.getGender(),obj.getP(),obj.getPrice());

		if(k==obj.getP()) {
			
			System.out.printf("TOTAL AMOUNT=%.1f",total);
			break;
		}
		k++;
		}
		}
	}

