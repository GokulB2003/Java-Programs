/*Write program to create class name as Area with constructor overloading
       Area(float radius): this function can accept radius as input and calculate circle Area
      Area(int len,int width): this function can accept len and width as input and calculate area of rectangle
*/
import java.util.*;
class Area
{
	float radius;
	int len;
	int w;
	Area(float radius)
	{
		this.radius=radius;
		System.out.println("Area of the circle is"+3.14*radius*radius);
	}
        Area(int len,int w)
	{	this.len=len;
		this.w=w;
		System.out.println("Area of the rectangle is:"+len*w);
	}
	
	
	
}
public class ConstructorOverloading
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area a=new Area(6.4f);
		Area obj=new Area(13,15);
		
	}
}
