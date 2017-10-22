
/**
 * @author Kaitlyn Cao 
 * Created 10/16/2017 
 * Lab 2.1 shapes
 *
 */
public class Circle implements Shape {
	
	//fields
	private double radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double calculatePerimeter()
	{
		return 2*(pi*radius);
	}
	
	public double calculateArea()
	{
		return pi*(radius* radius);
	}
	
	public String toString()
	{
		return "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
