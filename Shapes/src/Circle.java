/**
 * @author Kaitlyn Cao 
 * Created 10/16/2017 
 * Lab 2.1 shapes
 *
 */
public class Circle implements Shape {
	
	private double radius;
	private static double pi = 3.14;
	
	public Circle(double rad)
	{
		this.radius = rad;
	}
	
	public double perimeter()
	{
		return 2*(pi*radius);
	}
	
	public double area()
	{
		return pi*(radius*2);
	}
	
	public String toString()
	{
		return "";
	}
}
