import java.util.*;
/*Input:

12.34567

Output:

12.346
*/
public class ConvertSPecificDecimalToFloat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		System.out.printf("%.3f",num);
	}
}