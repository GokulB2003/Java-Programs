/* Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array
*/
class MergeTwoArray
{

	int arr1[];
	int arr2[];
	MergeTwoArray(int arr1[],int arr2[])
	{
		this.arr1=arr1;
		this.arr2=arr2;
	}
	void getMergeArray()
	{
		int arr3[]=new int[arr1.length+arr2.length];
	
		for(int i=0; i<arr1.length; i++)
		{
			arr3[i]=arr1[i];
		}
		int k=arr1.length;
		for(int i=0; i<arr2.length; i++)
		{
			arr3[k]=arr2[i];
			k++;
		}
		for(int i=0; i<arr3.length; i++)
		{
			System.out.println(arr3[i]+" ");
		}

		
	}
}

public class MergeArrayUsingConstructor
{
	public static void main(String args[])
	{
	int arr1[]={10,20,30,40,50,60};
	int arr2[]={70,80,90,100,120};
	MergeTwoArray obj=new MergeTwoArray(arr1,arr2);
	obj.getMergeArray();
	}
}