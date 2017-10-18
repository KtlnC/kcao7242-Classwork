/**
 * @author Kaitlyn Cao 
 * Created 10/16/2017 
 * Lab 2.1 shapes
 *
 */
public class Square extends Rectangle {

	double side;
	
	public Square(double side)
	{
		super(side,side);
		this.side = side;
	}
	
	public String toString()
	{
		return "";
	}
}

/*	private double side;

public Square(double side)
{
	this.side = side;
}

public double perimeter()
{
	return side+side+side+side;
}

public double area()
{
	return side*4;
}
*/