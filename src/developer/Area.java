package developer;

import java.util.Scanner;



/***
 * 
 * @author Madhulika
 * 
 * 
 * 
 * Write a class that has three overloaded static methods for calculating the areas of the following geometric shapes:

    circles
    rectangles
    cylinders

Here are the formulas for calculating the area of the shapes:
Shape	Formula
Area of a circle	Area = nr^2 where: n is Math.PI and r is the circle's radius
Area of a rectangle	Area = Width x Length
Area of a cylinder	Area = nr^2h where: n is Math.PI, r is the radius of the cylinder's base, and h is the cylinder's height

Because the three methods are to be overloaded, they should each have the same name, but different parameter lists. Demonstrate the class in a complete program.
 *
 */
public class Area {
	
	static void compute(double radius){
		double ara = 3.14*radius*radius;
		System.out.println("Area of circle" +ara);
	}
	static void compute(float length, double width){
		double ara = length * width;
		System.out.println("Area of rectangle" +ara);
	
	}

	static void compute(double radius, double height){
		double ara = 3.14*radius*radius*height;
		System.out.println("Area of circle" +ara);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter radius,length,width,height");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		float length = input.nextFloat();
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		compute(radius);
		compute(length,width);
		compute(radius,height);
		
		
	}

}
