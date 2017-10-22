/**
 * @author Kaitlyn Cao
 * Created 10/22/2017 
 * Lab 2.1 shapes
 *
 */

public class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double A, double B, double C)
	{
		this.sideA = A;
		this.sideB = B;
		this.sideC = C;
	}
	
	public double calculatePerimeter()
	{
		return sideA + sideB + sideC;
	}
	
	public double calculateArea()
	{
		//Heron's Formula
		return (sideA + sideB + sideC)/2;
	}
	
	public String toString()
	{
		return "Triangle Side A: " + sideA + " Side B: " + sideB + " Side C: " + sideC + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
	
}
