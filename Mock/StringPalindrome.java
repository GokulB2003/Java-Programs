class Solution {

        public static boolean checkPal(String str)
        {
		boolean flag=true;
            int s=0,e=str.length()-1;
            while(s<e)
            {
                if(str.charAt(s)!=str.charAt(e))
                {
		  flag=false;
                    //return false;
		    
                }
                s++;
                e--;
            }
            return flag;
        }


    public static void isPalindrome(String s) {
        String str="";
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)) 
            {
                char ch=s.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    ch=(char)(s.charAt(i)+32);
                }
                str+=ch;
            }
        }
	System.out.println(str);	
	boolean ans=checkPal(str);
	System.out.println(ans);
        /*if(checkPal(str))
        {
            return true;
        }
        else
        {
            return false;
        }*/
        
    }
}
public class StringPalindrome{
	public static void main(String args[])
	{
		Solution s=new Solution();
		//Scanner sc=new Scanner(System.in);
		String str="A man, a plan, a canal: Panama";
		//System.out.println(s.checkPal(str));
		s.isPalindrome(str);
		
	}

}