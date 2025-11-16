/*Create a base class Student with a constructor Student(String name, int marks) to store values.
 Create a child class Result that extends Student and has function getGrade() which returns:
"A Grade" if marks ≥ 75
"B Grade" if marks ≥ 50
"Fail" otherwise.
*/
import java.util.*;
class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
class Result extends Student
{
	Result(String name,int marks)
	{
		super(name,marks);
	}
	public String getGrade()
	{
		if(marks>=75)
		{
			return "A";
		}
		else if(marks>=50)
		{
			return "B";
		}
		else
		return "fail";
	}
				
}

public class StudentResult
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Result r=new Result("Raju",90);
		System.out.println(r.getGrade());
				
		
		
	}
}