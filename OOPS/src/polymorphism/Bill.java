package polymorphism;

public class Bill {
	private int billnumber;
	String name;
public void Bill(int id,String name, int nc, double costc )
{
	System.out.println("Bill Number:"+id);
	System.out.println("Customer Name:"+name);
	double x=nc*costc;
	System.out.println("Telephone Bill Number="+x);
}

}
