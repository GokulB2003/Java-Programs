/* Write a java program to Identify and display duplicate numbers in an integer ArrayList.
Explanation:
 This helps you understand:
Nested loops
Comparison logic
Handling repeated values
*/
import java.util.*;
public class DuplicateNum
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		System.out.println("ENter the number in Array");
		for(int i=0; i<5; i++)
		{
			int val=sc.nextInt();
			arr.add(val);	
		}
		Collections.sort(arr);
		int i=1;
		while(i<arr.size())
		{
			if(arr.get(i)==arr.get(i-1))
			{
				System.out.println(arr.get(i));
			}
			i++;
		}
		
	}
}