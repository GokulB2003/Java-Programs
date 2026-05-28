//constructor In child class
class A
{
	A()
	{
		System.out.println("this is a default constructor:");
	}
	public void checkData(int data)
	{
		System.out.println("the data is:"+data);
	}
}
class B extends A
{

	B()
	{
		this(5.5f);
		System.out.println("this is a B class Constructor:");
	}
	B(float d)
	{
		System.out.println("float number is :"+d);
	}
	public void display()
	{
		System.out.println("child class Method:");
	}
}
public class ConstructorApp
{
	public static void main(String args[])
	{
		A obj=new B();
		//obj.display();
		
		
	}

}