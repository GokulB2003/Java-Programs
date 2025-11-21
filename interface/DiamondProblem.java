//Multiple Inheritance
interface A
{
	void parent();
}
interface B
{
	void parent();
}
class C implements A,B
{
	public void parent()
	{
		System.out.println("this is an a method of the Class c:");
	}
		
}
public class DiamondProblem
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.parent();
		//Scanner sc=new Scanner(System.in);
		
	}
}