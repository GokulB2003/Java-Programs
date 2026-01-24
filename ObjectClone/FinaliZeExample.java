class FinalizeApp
{
	public void square(int n)
	{
		System.out.println(n*n);
	}
	public void finalize()
	{
		System.out.println("I am a garbge collction method:");
	}
	
}

public class FinaliZeExample
{
	public static void main(String args[])
	{

		FinalizeApp obj=new FinalizeApp();
		obj.square(10);
		obj=null;// Now object becomes unused
		System.gc();
	}
}
