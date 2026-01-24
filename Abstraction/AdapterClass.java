abstract class A
{  abstract void show();
   abstract void display();
}
class D extends A {
	void show(){
	}
	void display(){
	}
}
class  B extends D
{  void show(){
	 System.out.println("I am show method in B");
	}	
}
class C extends D 
{    void display(){
		   System.out.println("I am C i need display");
	  }
}
public class AdapterClass
{   public static void main(String x[])
    {    A a1 = new B();
		 a1.show();  
	}
} 
