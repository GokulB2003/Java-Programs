import java.util.*;
import java.lang.Cloneable;
class Square implements Cloneable
{
    int n;
    public void setValue(int n)
    {
        this.n=n;
    }
    public int getSqr()
    {
        return n*n;
    }
    public Square getObj()throws CloneNotSupportedException
    {
        Object s=this.clone();
        return (Square)s;
    }
    
}
public class ObjectCloning {
     public static void main(String[] args) {
        try{
        Square s1=new Square();
        s1.setValue(10);
       
        Square s2=s1.getObj();
        // s1=s2;
        s2.setValue(20);
        System.out.println(s2.getSqr());
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }
        
    }
}
