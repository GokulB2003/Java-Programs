/* Write program to Create class name as PersonalInfo with parameterized constructor
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to define void show() method in ProfessionalInfo and you have to show the all data in show() method.
*/
import java.util.*;
class PersonalInfo
{
	String name;
	String middlename;
	String lastname;
	public PersonalInfo(String fname,String mname,String lastnm)
	{
		this.name=fname;
		this.middlename=mname;
		this.lastname=lastnm;
		
	}
	
}
class ProfessionalInfo extends PersonalInfo
{
	int id;
	String desc;
	int salary;
	String skillset;
	ProfessionalInfo(int id,String des,int salary,String skillset,String name,String middlename,String lastname)
	{
		super(name,middlename,lastname);
		this.id=id;
		this.desc=des;
		this.salary=salary;
		this.skillset=skillset;
		
		
	}
	public void show()
	{
		System.out.println("**************************"+name+"***************************");
		System.out.println("the id of the Employee is:"+id);
		System.out.println("the name of the Employee is:"+name);
		System.out.println("the middlename of the Employee is:"+middlename);
		System.out.println("the last name of the Employee is:"+lastname);
		System.out.println("DEsc of Employee is:"+desc);
		System.out.println("salary"+salary);
		System.out.println("Skillset of the Employee is:"+skillset);
	}
}
public class EmployeeInfo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("name");
		String name=sc.nextLine();
		System.out.println("id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("middlename");
		String middlename=sc.nextLine();
		System.out.println("Last name");
		String lastname=sc.nextLine();
		
		System.out.println("Slary of the Employee");
		int salary=sc.nextInt();
		sc.nextLine();
		System.out.println("desc");
		String desc=sc.nextLine();
		sc.nextLine();
		System.out.println("Skillset");
		String Skillset=sc.nextLine();
		ProfessionalInfo p=new ProfessionalInfo(id,desc,salary,Skillset,name,middlename,lastname);
		p.show();
		
	}
}
