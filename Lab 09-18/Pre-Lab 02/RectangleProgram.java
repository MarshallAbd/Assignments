/*
 * Student Name: David Haley
 * Lab Professor: Professor David Haley
 * Due Date: September 23, 2023
 * Description: Lab Exercise 02 (23F) Pre-Lab Sample Solution
 */
/*
 * This class reads the dimensions of a big rectangle
 * from the user (length and width). It then reads the dimensions
 * of a smaller rectangle from the user. Given that the smaller
 * rectangle is placed inside the larger rectangle, this class
 * calculates how much empty space would remain inside the larger
 * rectangle, using Use length x width for computing the area of
 * a rectangle and then subtracting the area of the small rectangle
 * from the area of the bigger rectangle.
*/
import java.util.Scanner;

public class RectangleProgram {
	public static void main(String[] args) {
		// Entry point for the application.
		int lengthBig;		// Length of the Bigger Rectangle
		int widthBig;		// Width of the Bigger Rectangle
		int areaBig;		// Area of the Bigger Rectangle
		int lengthSmall;	// Length of the Smaller Rectangle
		int widthSmall;		// Width of the Smaller Rectangle
		int areaSmall;		// Area of the Smaller Rectangle
		int areaLeft;		// Area between the Bigger and Smaller Rectangle

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the large box: ");
		lengthBig = input.nextInt();

		System.out.print("Enter the width of the large box: ");
		widthBig = input.nextInt();

		areaBig = lengthBig * widthBig;

		System.out.print("Enter the length of the small box: ");
		lengthSmall = input.nextInt();

		System.out.print("Enter the width of the small box: ");
		widthSmall = input.nextInt();

		areaSmall = lengthSmall * widthSmall;

		areaLeft = areaBig - areaSmall;

		System.out.printf("The area remaining is %d%s\n", areaLeft, " square units");
	}
}

