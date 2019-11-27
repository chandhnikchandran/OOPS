package inheritance;

import java.util.Scanner;

public class Singleinhe {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Model");
	String m=s.next();
    Lap l=new Lap();
    l.about();
    l.name();
    l.model(m);
    l.price();
}
}
