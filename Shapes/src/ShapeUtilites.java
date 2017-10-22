
import java.util.Random;

/**
 * @author Kaitlyn Cao
 * Created 10/16/2017 
 * Lab 2.1 shapes
 *
 */

public class ShapeUtilites {

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double sum = 0;
		for(int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].calculatePerimeter();
		}
		return sum;
	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapeArr)
	{
		double sum = 0; 
		for(int i = 0; i < shapeArr.length; i++)
		{
			sum += shapeArr[i].calculateArea();
		}
		return sum;
	}
	
	/**
	 * Creates a random shape from the choices.
	 */	
	public static Shape randomShape()
	{
		Random rand = new Random();
		int x = rand.nextInt(5);
		switch(x)
		{
		case 0:
			return new Circle(rand.nextInt(100)+1);
		case 1:
			return new Rectangle(rand.nextInt(27), rand.nextInt(27));
		case 2:
			return new Square(rand.nextInt(9));
		case 3:
			return new Triangle(rand.nextInt(98), rand.nextInt(98), rand.nextInt(98));
		case 4: return new Parallelogram(rand.nextInt(20), rand.nextInt(50));
		default:
			return null;
		
		}
	}
	
}
