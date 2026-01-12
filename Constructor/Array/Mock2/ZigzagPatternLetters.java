//Zig-zagPattern

import java.util.*;
public class ZigzagPatternLetters
{
	public static void main(String args[])
	{	char ch='A';
		for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=5; j++)
		    {
			if(i<=3)
			{
				if(i==j || j==(6-i))
				{
					System.out.print(ch);
					ch++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			else
			{
				if(j==(6-i) || j==i)
				{	
					System.out.print(ch);
					ch++;
				}
				else
				{
					System.out.print(" ");	
				}
			}
		   }
			System.out.println();
		}
	}
}