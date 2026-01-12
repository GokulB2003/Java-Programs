/* Write a java program swap two number without using third variable. */
public class Revision
{
public static void main (String args[])
{

		 //Scanner sc=new Scanner(System.in);
        int arr[]={1,4,5};
        for(int i=1; i<arr.length; i++)
        {
            if((arr[i]-arr[i-1])!=1)
            {
                int k=arr[i-1]+1;
                while(k<arr[i])
                {
                    System.out.print(k+" ");
                    k++;
                }
            }
        }
}	

}
