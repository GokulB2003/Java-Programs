import java.util.*;
class A {
	 int a=10;
    static {
			
        System.out.println("first"+new A().a);
    }
	void display()
	{
		System.out.println("display");
	}
}
class B extends A {

    static {
        System.out.println("B Static");
    }
}
public class Test {
    public static void main(String[] args) {

        System.out.println("Main");

	A obj=new A();

	obj.display();
	
    }
}