package Type_Of_Copy;

public class First
{

	public static void main(String[] args) 
	{
		Student_1 st = new Student_1(1,"NISHA");
		Student_1 st1 = new Student_1(st);
		
		st1.name = "SITA";
		
		System.out.println(st.name);
		System.out.println(st1.name);
	}

}

class Student_1
{
	int id;
	String name;
	
	Student_1(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	Student_1(Student_1 st)
	{
		this.id = st.id;
		this.name = st.name;
	}
}