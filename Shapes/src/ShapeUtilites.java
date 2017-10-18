import java.util.Random;

/**
 * @author Kaitlyn Cao
 * Created 10/16/2017 
 * Lab 2.1 shapes
 *
 */

public class ShapeUtilites {
	
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double sum = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].perimeter();
		}
		return sum;
	}
	
	public static double sumArea(Shape[] shapeArr)
	{
		double sum = 0; 
		for(int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].area();
		}
		return sum;
	}
	
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
		case(0):
			return new Circle(r.nextInt(100)+1);
		case(1):
			return new Rectangle(r.nextInt(27), r.nextInt(27));
		case(2):
			return new Square(r.nextInt(9));

		default:
			return null;
		
		}
	}
	
}
