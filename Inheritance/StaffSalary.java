/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.


Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
*/
import java.util.*;
class Staff
{
	int salary;
	
	void getsalary(int s)
	{
		this.salary=s;
	}
}
class TeachingStaff extends Staff
{
	final double increment=15.0;
	double total=0.0;
	void incrementSalary()
	{
		total=salary*increment/100;	
		System.out.println(total);
	}
}
class NonTeachingStaff extends Staff
{
	final double increment=15.0;
	double total=0.0;
	void incrementSalary()
	{
		total=salary*increment/100;	
		System.out.println(total);
	}

	
	
}
public class StaffSalary
{
	public static void main(String args[])
	{
		NonTeachingStaff n=new NonTeachingStaff();
		n.getsalary();
		n.incrementSalary();

		TeachingStaff t=new TeachingStaff();
		t.getsalary();
		t.incrementSalary();

		
	}
}