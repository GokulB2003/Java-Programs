/*Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.

ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.

Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
import java.util.*;
class Employee
{
	int salary;
	
	void setValue(int s)
	{
		this.salary=s;
		
		
	}
	public double calBonus()
	{
		return 0.0;
	}	

}
class Permanente extends Employee
{
	final double bonus=25.0;
	public double calBonus()
	{
		double total=salary*bonus/100;
		return total;
	}
	
}
class ContractEmployee extends Employee
{
	final double bonus=10.0;
	public double calBonus()
	{
		double total=salary*bonus/100;
		return total;
	}

}
class Emp
{	
	public void calBonus(Employee e)
	{
		double result=e.calBonus();
		System.out.println(result);
	}
		
}
public class EmployeeBonus
{
	public static void main(String args[])
	{	
		Emp s=new Emp();
		Employee e=new Employee();
		
		e=null;
		e=new ContractEmployee();
		e.setValue(50000);
		
		s.calBonus(e);

		e=new Permanente();
		e.setValue(80000);
		s.calBonus(e);		
	}

}