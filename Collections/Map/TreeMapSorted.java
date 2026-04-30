import java.util.*;
public class TreeMapSorted
{
    public static void main(String args[])
    {
        TreeMap<Integer,Character>map=new TreeMap<>();
        map.put(3,'A');
        map.put(1,'B');
        map.put(2,'C');

        NavigableMap<Integer,Character>des=map.descendingMap();
        for(Map.Entry<Integer,Character>s:des.entrySet())
        {
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}