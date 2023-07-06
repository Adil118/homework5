package corejava;
import java.util.Scanner;

public class exponent2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        int squaredValue = square(number);
	        int cubedValue = cube(number);

	        System.out.println("Square: " + squaredValue);
	        System.out.println("Cube: " + cubedValue);
	    }

	    public static int square(int number) {
	        return number * number;
	    }

	    public static int cube(int number) {
	        int squaredValue = square(number);
	        return squaredValue * number;
	    }
	}




