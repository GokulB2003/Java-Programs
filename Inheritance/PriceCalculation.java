/*3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation*/
import java.util.*;
class Product
{
	int id;
	int price;
	Product(int id,int p)
	{
		this.id=id;
		this.price=p;
		
	}
	
}
class Electronics extends Product
{
	final double discount=10.0;
	double total=0.0;
	Electronics(int id,int p)
	{
		super(id,p);
	}
	void calculateDis()
	{
		
	 total=price*discount/100;
	}
	void display()
	{
		System.out.println("total price after applying the discount is:"+(price-total));
	}
	
}
class Clothing extends Product
{
	final double discount=20.0;
	double total=0.0;
	Clothing(int id,int p)
	{
		super(id,p);
		
	}
	void calculateDis()
	{
		total=price*discount/100;
	}
	void display()
	{
		System.out.println("total price after applying the discount is:"+(price-total));

	}
}
public class PriceCalculation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Clothing c=new Clothing(1,20000);
		c.calculateDis();
		c.display();

		Electronics E=new Electronics(2,400000);
		E.calculateDis();
		E.display();
		

				

	}
}
 