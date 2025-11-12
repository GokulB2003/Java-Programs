/*Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it and override 
arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it.


*/
import java.util.*;
class ArrParent
{	
	int arr[];
	public void setValue(int arr[])
	{
		this.arr=arr;
		
	}
	public void arrangeSeq()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
		
}

class ArrangeAscendingOrder extends ArrParent
{
	public void arrangeSeq()
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void display()
	{
		super.arrangeSeq();
	}
	
}
class ReverseArray extends ArrParent
{
	
	public void arrangeSeq()
	{
		int s=0,e=arr.length-1;
		while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
	public void display()
	{
		super.arrangeSeq();
		
	}
}
public class ArrayOperation{

	public static void main(String args[])
	{
		int arr[]={10,20,3,5,1};
		ArrangeAscendingOrder a=new ArrangeAscendingOrder();
		a.setValue(arr);
		a.arrangeSeq();
		a.display();
		System.out.println("After reversing the array:");
		ReverseArray r=new ReverseArray();
		r.setValue(arr);
		r.arrangeSeq();
		r.display();
		
		
	}
}
