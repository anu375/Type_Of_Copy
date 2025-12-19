package Type_Of_Copy;

public class Second 
{

	public static void main(String[] args) 
	{
		
		Addr a = new Addr("Pune");
		Car c = new Car("Scarpio",a);
		Car c1 = new Car(c);
		
		c1.addr.city = "Nashik";
		
		System.out.println(c.addr.city);
		System.out.println(c1.addr.city);
	}

}

class Addr
{
	String city;
	
	Addr(String city)
	{
		this.city = city;
	}
}
class Car
{
	String name;
	Addr addr;
	
	Car(String name,Addr addr)
	{
		this.name = name;
		this.addr = addr;
	}
	
	Car(Car c)
	{
		this.name = c.name;
		this.addr = c.addr;
	}
	
}
