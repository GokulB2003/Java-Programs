//Alphabet Palindromic Pyramid


import java.util.*;
public class AlphabetPalindromic
{
	public static void main(String args[])
	{	//char ch='A';
		for(int i=1; i<=9; i++)
		{

		    for(int j=1; j<=5; j++)
		    {
			
			
			if( j>=(6-i) && j<=(4+i))
			{
				System.out.print("*");
				//ch--;
				
			}
			else
			{
				System.out.print(" ");
			}
			
						
		     }
			System.out.println();
		    
						
		}
			
		
	}
}