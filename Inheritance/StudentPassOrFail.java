/* Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/
import java.util.*;
class Student
{
	String name;
	int marks;
	void setvalue(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public String checkPassOrFail()
	{
		if(marks>50)
		{
			return "pass";		}
		else
		{
			return "Student fail:";
		}

	}
	
}
class EnginneringStudent extends Student
{
	public String checkPassOrFail()
	{
		return super.checkPassOrFail();
	}
}	
class MedicalStudent extends Student
{
	
	public String checkPassOrFail()
	{
		return super.checkPassOrFail();

	}
	
}
public class StudentPassOrFail
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	MedicalStudent m =new MedicalStudent();
	m.setvalue("Raju",60);
	System.out.println(m.checkPassOrFail());

	EnginneringStudent E =new EnginneringStudent();
	E.setvalue("Raju",50);
	System.out.println(E.checkPassOrFail());
	
	}
	
}