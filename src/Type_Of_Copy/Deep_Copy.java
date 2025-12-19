package Type_Of_Copy;

public class Deep_Copy
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		Address adr = new Address("Nashik");
		Emp emp = new Emp(1,"Nirav",adr);
		
		Emp emp1 = (Emp)emp.clone();
		
		emp1.address.city = "Mumbai";
		System.out.println(emp.address.city);
		System.out.println(emp1.address.city);
	}

}

class Address implements Cloneable
{
	String city;
	
	Address(String city)
	{
		this.city = city;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	};
}
class Emp implements Cloneable
{
	int id;
	String name;
	
	Address address;
	
	Emp(int id,String name,Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		
		Emp emp = (Emp)super.clone();
	    emp.address = (Address)address.clone();
		return emp;
		
	}
}