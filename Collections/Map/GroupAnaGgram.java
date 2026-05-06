import java.util.*;
public class GroupAnaGgram {
    public static String checkString(String s)
    {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    } 
    public static List<List<String>>check(String[] str)
    {
         LinkedHashMap<String,List<String>>ans=new LinkedHashMap<>();

        for(int i=0; i<str.length; i++)
        {
                String s=checkString(str[i]);
                 if(ans.containsKey(s))
        {
            ans.get(s).add(str[i]);
        }
        else
        {
            ArrayList<String>arr=new ArrayList<>();
            arr.add(str[i]);
            ans.put(s,arr);
        
        }
        }

        return new ArrayList<>(ans.values());
       
       

    }
    public static void main(String[] args)
    {
         String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
         List<List<String>>arr=check(strs);
         System.out.println(arr);


    }
}
