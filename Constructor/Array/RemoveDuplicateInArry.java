import java.util.*;
public class RemoveDuplicateInArry
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,1,3,4,4,4};
        Set<Integer>ans=new LinkedHashSet<>();
        for(int num:arr)
        {
            ans.add(num);
        }
        int arr1[]=new int[ans.size()];
        int i=0;
        for(int n:ans)
        {

            //System.out.print(n);
            arr1[i++]=n;
        }
        for(int a:arr1)
        {
            System.out.print(a);
        }
    }
}