interface A
{
	void Add();
	public class ABC implements A
	{
		
		public void Add()
		{
			System.out.println("This is a inside the ABC");
		}		
	}
}
public class ClassWithinInterFace
{
	public static void main(String args[])
	{
		A.ABC obj=new A.ABC();
		obj.Add();
	}
}