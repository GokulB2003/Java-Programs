import java.util.*;
class Employee implements Comparable
{
	private int id;
	private int sal;
	private String name;
	Employee(int id,int sal,String name)
	{
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public int getSal()
	{
		return sal;
	}
	public String getName()
	{
		return name;
	}

	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		if(this.id>e.id)
		{
			return 1;
			
		}
		else if(this.id<e.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

	
}
public class ComparableInterFace
{
	public static void main(String args[])
	{
		Employee emp1=new Employee(1,10000,"Raju");
		Employee emp2=new Employee(2,20000,"Mangu");
		Employee emp3=new Employee(0,11000,"Pinku");
		Employee emp4=new Employee(5,90222,"Rani");
	
		ArrayList arr=new ArrayList();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		arr.add(emp4);
		
		System.out.println("Before sorting the data using Id");
		for(Object obj:arr)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getSal()+"\t"+e.getName());
		}

		//After
	Collections.sort(arr);
	System.out.println("After sorting the Data is:");
	for(Object ob:arr)
	{

	Employee o=(Employee)ob;		System.out.println(o.getId()+"\t"+o.getName()+"\t"+o.getSal());
	}
		
		
	}
}