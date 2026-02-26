import java.util.*;
class Test<E>
{
	Vector v;
	Object obj[];
	int count=0;
	public Test(){
		obj=new Object[5];
	}
	void add(E e){
		obj[count]=e;
		++count;
	}
	int size()
	{
		return count;
	}
	E get(int index)
	{
		return (E)obj[index];
	}
	
}

public class GenericsClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	Test<String>t=new Test<>();
	t.add("Good");
	t.add("MNO");
	for(int i=0; i<t.size(); i++)
	{
		String val=t.get(i);
		System.out.println(val);
	}
		
	}
}