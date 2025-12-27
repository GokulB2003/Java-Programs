import java.util.*;
public class VectorClassOperation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector(5,2);
		System.out.println("default capacity of Vector is:"+v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(10);
		//after 5 its becomes a 10 then its becomes 
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		System.out.println(v.capacity());
		
	}
}