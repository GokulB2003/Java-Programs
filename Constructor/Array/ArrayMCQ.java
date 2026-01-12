import java.util.*;
public class ArrayMCQ
{
	public static void main(String args[])
	{	
		
        int[] a = {1, 2, 3, 4};
        int s = 0;
        for (int i = 0; i < a.length; i++)
	{
            if (a[i] % 2 == 0)
		s += a[i];
        	System.out.print(s);
    	}
	}

	
}