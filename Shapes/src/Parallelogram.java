/**
 * @author Kaitlyn Cao
 * Created 10/22/2017 
 * Lab 2.1 shapes
 *
 */
public class Parallelogram implements Shape {
	private double side;
	private double base;
	
	public Parallelogram(double side, double base)
	{
		this.side = side;
		this.base = base;
	}
	
	public double calculatePerimeter()
	{
		return 2*(side + base);
	}
	
	public double calculateArea()
	{
		return side*base;
	}
	
	public String toString()
	{
		return "Parallelogram Base: " + base + " Side: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
