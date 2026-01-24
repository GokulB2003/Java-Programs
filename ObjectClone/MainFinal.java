class Square
{
    int a;
    Square(int a)
    {
        this.a=a;
    }
    public void prints()
    {
        System.out.println(a*a);
    }
    public void finalize()
    {
        System.out.println("this is a ");
    }
}
public class MainFinal
{
    public static void main(String args[])
    {
        Square s=new Square(10);
        s.prints();
        s=null;
        System.gc();

    }
}