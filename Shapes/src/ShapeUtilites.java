import java.util.Random;

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
		int x = r.nextInt(4);
		switch(x)
		{
		case(0):
			return new Circle(r.nextInt(100)+1);
		case(1):
			return new Rectangle(r.nextInt(27), r.nextInt(27));
		case(2):
			return new Square(r.nextInt(9));
		case(3):
			return new Triangle(r.nextInt(12), r.nextInt(13));
		default:
			return null;
		
		}
	}
	
}
