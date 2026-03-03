import java.util.*;
//@Functional Interface;
interface getSquare
{
	int getVal(int val);
	//void p();
}
public class LamdaExpression
{
	public static void main(String args[])
	{
		//ABC obj=()->System.out.println("I am show");
		getSquare g=(int val)->val*val;
			//};
		//};
		
		System.out.println(g.getVal(10));
		//obj.p();
	}
}