/*Singleton class means class can create only one object in whole application called as singleton class 
*/

class Single
{
	private static Single s=null;
	private Single()
	{
		System.out.println("I am a singletonw class:");
	}
	public static Single singlet()
	{
		if(s==null)
		{
			s=new Single();
		}
		return s;
	}
}
public class SingletoneClass
{
	public static void main(String args[])
	{
		 Single s1 = Single.singlet();
        Single s2 = Single.singlet();

        System.out.println(s1 == s2);
		
		
	}
}
