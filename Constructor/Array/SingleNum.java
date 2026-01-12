/*
	Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
Count the number of digits
Count how many digits are even
Find the product of all odd digits
Check if the number is an Armstrong number
Exit the program

*/
import java.util.*;
public class SingleNum
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number:");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		int choice;
		do
		{
			System.out.println("Select the choice:");
			System.out.println("1.the number of digits:");
			System.out.println("2count how many digits are even:");
			System.out.println("3.Find the product of all odd digits:");
			System.out.println("4.Check if the number is an Armstrong number");
			System.out.println("5.Exit the program");
			 choice=sc.nextInt();	
			switch(choice)
			{
				case 1:
					while(n!=0)
					{
						count++;
						n=n/10;
					}
					System.out.println("The count is:"+count);
					break;
				case 2:
					count=0;
					n=temp;
					while(n!=0)
					{	
						int rem=n%10;
						if(rem%2==0)
						{
						count++;
						
						}n=n/10;
					}
					System.out.println("The count is:"+count);
					break;
				case 3:
					count=0;
					n=temp;
					int product=1;
					while(n!=0)
					{	
						int rem=n%10;
						if(rem%2!=0)
						{
						product=product*rem;
						//count++;
						
						}n=n/10;
					}
					System.out.println("The product is:"+product);
					break;
				case 4:
					
					n=temp;
					count=0;
					while(n!=0)
					{
						count++;
						n=n/10;
					}
					System.out.println(count);
					n=temp;
					int t,sum=0;
					while(n!=0)
					{
						int rem=n%10;
						int p=1;
						t=1;
						while(t<=count)
						{
							p=p*rem;
							t++;
							
						}
						sum+=p;
						n=n/10;
					}
					System.out.println(sum);
					String str=(temp==sum) ? "AmStrong" : "NotArmStrong";
					System.out.println(str);
					break;

				case 5:
					System.out.println("EXIT......");
					//System.exit(0);
					break;
				default:
					System.out.println("please select the valid choice:");
					
			}		
		}while(choice!=5);		
	}
}