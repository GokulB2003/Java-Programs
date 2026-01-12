import java.util.*;
public class ArrayMCQ1
{
	public static void main(String args[])
	{	
		
           int[] a={2,3,5,7,11};
        int p=1;
        for(int i=0;i<a.length;i+=2)
            p*=a[i];
        System.out.print(p);



	}

	
}