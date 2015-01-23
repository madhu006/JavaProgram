package pattern;

public class ColorFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType){
		
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED"))
		{
			return new Red();
		}
		else if(color.equalsIgnoreCase("GREEN"))
		{
			return new Green();
		}
		else if(color.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}
		return null;
	}

}

