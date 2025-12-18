package Type_Of_Copy;

public class Copy_Constructor
{

	public static void main(String[] args) 
	{
		
		Employee emp = new Employee(1,"Sweta","math");
		Employee emp1 = new Employee(emp);
		
		emp1.name = "Washington";
		
		System.out.println(emp.name);
		System.out.println(emp1.name);

	}

}

class Employee
{
	int id;
	String name;
	String dept;
	
	Employee(int id,String name,String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	Employee(Employee emp)
	{
		this.id = emp.id;
		this.name = emp.name;
		this.dept = emp.dept;
	}
	
	public String toString()
	{
		return this.id+" "+this.name+" "+this.dept;
	}
}