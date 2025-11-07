/*Q2. Write program to create class name Area with methods name as void setRadius(float   radius) and void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have to define float getCircleArea() method in Circle child class and calculate area of circle and return it and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and return it*/


import java.util.*;
class Area
{
	float r;
	void setRadius(float r)
	{
		this.r=r;
	}
	int len;
	int wid;
	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	
	
	
}
class Rectangle extends Area
{
	public int area()
	{
		return len*wid;
	}
}
class Circle extends Area
{
	float getCircleArea()
	{
		return 3.14f*r*r;
	}
}
class CalArea
{
	public static void main(String args[])
	{	
		Circle r=new Circle();
		r.setRadius(2.4f);
		System.out.println("Area of the circle :"+r.getCircleArea());
		Rectangle c=new Rectangle();
		c.setLengthWidth(5,10);
		System.out.println("the Area of the Rectangle:"+c.area());
		
		
		
	}
}
