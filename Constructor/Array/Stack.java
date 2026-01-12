/*Q3. Given an integer array, find the next greater element for each element using a stack. 
  If no greater element exists, print -1 for that position. 
Example: 
 Input: {4, 5, 2, 25} 
 Output: {5, 25, 25, -1}

*/
/*Implement stack with stack operation*/

import java.util.*;
public class MyStack
{
	
	static int top=-1;
	public static void push(int arr[],int val)
	{	
		if(top==arr.length-1)
		{
			System.out.println("Stack Overflow:");
		}
		else
		{
			top=top+1;
			arr[top]=val;
		}
		
	}
	public static int pop(int arr[])
	{	
		if(top==-1)
		{
			return 0;
		}
		else
		{
			int val=arr[top];
			top=top-1;
			return val;
		}
	}
	public static void display(int stack[])
	{	
		if(top==-1)
		{
			System.out.println("Stack is Empty:");
		}
		else
		{
			for(int i=stack.length-1; i>0; i--)
			{
				System.out.println(stack[i]+" ");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int stack[]=new int[5];
		System.out.println("Enter the values:");
		for(int i=0; i<stack.length; i++)
		{	
			int val=sc.nextInt();
			push(stack,val);
		}
		System.out.println("Pop");
		int popE=pop(stack);
		if(popE!=0)
		{
			System.out.println("the value Pop is:"+popE);
		}
		else
		{
			System.out.println("Stack underflow");
		}
		display(stack);
			
	}
}