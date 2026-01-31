/**/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public int getSal()
	{
		return sal;
	}

}
public class OperationsUsingPojo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee>ans=new ArrayList<Employee>();
		Employee emp=new Employee(10,"Raju",20);
		Employee emp1=new Employee(11,"Mangu",40);
		Employee emp2=new Employee(12,"pinku",30);
		ans.add(emp);
		ans.add(emp1);
		ans.add(emp2);
		for(int i=0; i<ans.size(); i++)
		{
			System.out.println("name"+ans.get(i).getName()+"ID:"+ans.get(i).getId()+"sal:"+ans.get(i).getSal());
		}
		

		
		
	}
}
