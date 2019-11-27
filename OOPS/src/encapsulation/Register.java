package encapsulation;

public class Register {
String number;
String name;
String address;
String  contactnumber;
String email;
String prooftype;
String proofid;
 int no=0,na=0,ad=0,co=0,em=0,pt=0,pi=0;
public String getNumber() {
	return number;
}
public boolean setNumber(String number) {
	if (number.matches("^[0-9]*$"))
    {
        this.number=number;
        return true;
        
    }
    else
    {
        //System.out.println("Invalid Prooftype");
    	no++;
        return false;
    }
}
public String getName() {
	return this.name;
}
public boolean setName(String name) {
	if (name.matches("^[a-zA-Z]*$"))
    {
        this.name=name;
        return true;
       
    }
    else
    {
        //System.out.println("Invalid Name");
    	na++;
        return false;
        
    }
}
public String getAddress() {
	
	return this.address;
}
public boolean setAddress(String address) {
	if (address.matches("^[a-zA-Z0-9]*$"))
    {
        this.address=address;
        return true;
    }
    else
    {
        //System.out.println("Invalid Address");
    	ad++;
        return false;
    }
}
public String  getContactnumber() {
	return this.contactnumber;
}
public boolean setContactnumber(String contactnumber)
{
    if (contactnumber.matches("^[0-9]*$"))
    {
        this.contactnumber=contactnumber;
        return true;
    }
    else
    {
        //System.out.println("Invalid Contact Number");
    	co++;
        return false;
    }
}
public String getEmail() {
	
	return this.email;
}

	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            //System.out.println("Invalid Email");
        	em++;
            return false;
        }
    
    
	
}
public String getProoftype() {
	return this.prooftype;
}
public boolean setProoftype(String prooftype) {
	if (prooftype.matches("^[a-zA-Z]*$"))
    {
        this.prooftype=prooftype;
        return true;
    }
    else
    {
        //System.out.println("Invalid Prooftype");
    	pt++;
        return false;
    }}
public String getProofid() {
	return this.proofid;
}
public boolean setProofid(String proofid) {
	if (proofid.matches("^[a-zA-Z0-9]*$"))
    {
        this.proofid=proofid;
        return true;
    }
    else
    {
       // System.out.println("Invalid ProofId");
    	pi++;
        return false;
    }}

public void display() {
	// TODO Auto-generated method stub
	System.out.println("Name: "+number);
	System.out.println("Name: "+name);
	System.out.println("Address: "+address);
	System.out.println("Contact Number: "+contactnumber);
	System.out.println("email: "+email);
	System.out.println("Proof Type: "+prooftype);
	System.out.println("Proof Id: "+proofid); 
}
public void check() {
	// TODO Auto-generated method stub
	


//if(number.matches("^[0-9]*$")&&name.matches("^[a-zA-Z]*$")&&
		//address.matches("^[a-zA-Z0-9-]*$")&&email.contains("@")&&
		//prooftype.matches("^[a-zA-Z]*$")&&proofid.matches("^[a-zA-Z0-9]*$"))
		//{
			//System.out.println("Registration Successful...");
		//}
	if(no==0&&na==0&&ad==0&&co==0&&em==0&&pt==0&&pi==0)
	{
		System.out.println("Registration Successful...");
		display();
	}
		else 
		{
			
			if(no==1)
			{
				System.out.println("Invalid Number");
			}
			if(na==1)
			{
				System.out.println("Invalid Name");
			}
			if(ad==1)
			{
				System.out.println("Invalid Address");
			}
			if(co==1)
			{
				System.out.println("Invalid contactNumber");
			}
			if(em==1)
			{
				System.out.println("Invalid email");
			}
			if(pt==1)
			{
				System.out.println("Invalid Prooftype");
			}
			if(pi==1)
			{
				System.out.println("Invalid Proofid");
			}
			System.out.println("Registration Not Successful...");
		}
}


}
