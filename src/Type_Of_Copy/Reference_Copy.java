package Type_Of_Copy;

public class Reference_Copy 
{

	public static void main(String[] args) 
	{
		Student st = new Student(1,"neha");
		Student st1 = st;          //Two Reference One Object
		
		st1.name = "suraj";
		
		System.out.println(st.name);
		System.out.println(st1.name);
	}

}

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
}