/*CapitaliZe Title*/
import java.util.*;
class Solution {
    public String capitalizeTitle(String title) {
    
        String arr[]=title.split(" ");
      /*  for(int i=0; i<arr.length; i++)
        {

            if(arr[i].length()<=2)
            {
               ans+=arr[i].toLowerCase();
            }
            else
            {
                char ch=arr[i].charAt(0);
               if(ch>='a' && ch<='z')
                {
                    ans+=(char)(ch-32);
                }
                else
                {
                    ans+=ch;
                     
                }
                ans+=arr[i].substring(1).toLowerCase();

                //ans+=ch.toUpperCase();
               
               
            }
            if(i<arr.length-1)
            {
                ans+=" ";
            }

           
        }
        return ans;*/
        //Every time its creates a new Object in memory instead of that we need to use a mutable TSring by using String Builder Class.
        StringBuilder ans=new StringBuilder();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length()<=2)
            {
                ans.append(arr[i].toLowerCase());
            }
            else
            {
                char ch=arr[i].charAt(0);
                if(ch>='a' && ch<='z')
                {
                    ch=(char)(ch-32);
                    ans.append(ch);
                }
                else
                {
                    ans.append(ch);
                }
                ans.append(arr[i].substring(1).toLowerCase());

            }
            if(i<arr.length-1)
            {
                ans.append(" ");
            }


        }
        return ans.toString();
        
    }
}
public class CapitalFirstWordInEveryWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 String title = "capiTalIze tHe titLe";
		//Output: "Capitalize The Title";
		Solution s=new Solution();
		String ans=s.capitalizeTitle(title);
		System.out.println(ans);
		
	}

}