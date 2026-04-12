import java.util.*;

public class LamdaaExpression{
    public static void main(String[] args) {
       
        Runnable obj=new Runnable()
        {
            public void run()
            {
                System.out.println("run");
            }
        };
        Thread t=new Thread(obj);
        t.start();
        //System.out.println(((Square)(int n)-> n*n).getsqr(5));
    }
}