/*Q11. Write a program to print the first character of a string.
 Input : Apple is good
 Output : A i g
 */
import java.util.*;
public class PrintFirstChar
{
    public static void main(String argsp[])
    {
        String str="Apple is good";
        String s="";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==0)
            {
                System.out.println(str.charAt(i));
            }
            else if(str.charAt(i-1)==' ')
            {
                System.out.println(str.charAt(i));
            }
        }
    }
}

