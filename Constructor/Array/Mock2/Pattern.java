import java.util.*;
public class Pattern
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i<=5)
				{
					if((j==6-i) || j==(i+4))
					{
						System.out.print("*");
					}
					else if((i>=4 && i<=6) && (j==5))
					{
						System.out.print("+");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				else
				{
					if((i-4==j) || (14-i)==j)
					{
						System.out.print("*");
					}
					else if((i>=4 && i<=6) && (j==5))
					{
						System.out.print("+");
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