/*Valid parenthisis*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character>ans=new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
                if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                {
                    ans.push(s.charAt(i));
                }
                else if(!ans.isEmpty())
                {
                    int top=ans.peek();
                    if((s.charAt(i)==')' && top=='(') || (s.charAt(i)==']' && top=='[') || (s.charAt(i)=='}' && top=='{'))
                    {
                        ans.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                return false;
        }
        if(ans.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class ValidParenthisis
{
	public static void main(String args[])
	{
		//Stack<Integer>ans=new Stack<>();
		String s = "()";
		Solution obj=new Solution();
		boolean ans=obj.isValid(s);
		if(ans)
		{
			System.out.println("Valid Parenthesis");
		}
		else
		{
			System.out.println("Not a valid Parenthesis");
		}
	}
}