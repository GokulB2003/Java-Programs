/*Rearrange Array in Alternate Positive and Negative Items
Concept: Use auxiliary arrays or index manipulation to interleave.
 Use Case: Alternate scheduling, balancing data flow.
Input: arr = [2, 3, -4, -1, 6, -9]
 
Separate positives: [2, 3, 6]
Separate negatives: [-4, -1, -9]
Rearranged array: [2, -4, 3, -1, 6, 7]
*/

/*class Pos
{
	void alternate(int arr[])
	{

		Boolean flag=true;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0 && flag)
			{
				
				flag=false;
				
			}
			else if(flag==false)
			{
				if(arr[i]<0)
				{
					flag=true;
				}
				else
				{
					int j=i;
					while(arr[j]>0 && j<arr.length-1)
					{	
						j++;
					}
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					flag=true;
				}

			}
				
			
		}

		
		
	}
	void printArray()
	{
		for(int k=0; k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
	}


}
*/
		//OR

class Pos
{
	void alternate(int arr[])
	{
		int n=arr.length;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		
		int p=0,q=0,i=0;
		while(i<arr1.length)
		{
			if(arr[i]>0)
			{
				arr1[p++]=arr[i];
				i++;
			}
			else
			{
				arr2[q++]=arr[i];
				i++;
			}
		}
		int k=0,j=0;
		i=0;
		while(i<p && k<q)
		{
				arr[j++]=arr1[i++];
				arr[j++]=arr2[k++];
			
		}
		while(i<p)
		{
			arr[j++]=arr1[i++];
		}
		while(k<q)
		{
			arr[j++]=arr2[k++];
		}

	}
	void printArray(int arr[])
	{
		for(int k=0; k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
	}
}

public class ALternatePositiveAndNeg
{
	public static void main(String args[])
	{
		int arr[]={2,3,-4,-1,6,-9,9,7,-1};
		Pos obj=new Pos();
		obj.alternate(arr);
		obj.printArray(arr);
		
	}
}