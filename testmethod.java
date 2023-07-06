package corejava;

public class testmethod {

	public static void main(String[] args) {
		 int number1 = 10;
	        int number2 = 20;

	        displayIt(number1);
	        displayItTimesTwo(number1);
	        displayItPlusOneHundred(number1);

	        displayIt(number2);
	        displayItTimesTwo(number2);
	        displayItPlusOneHundred(number2);
	    }

	    public static void displayIt(int number) {
	        System.out.println("The number is: " + number);
	    }

	    public static void displayItTimesTwo(int number) {
	        System.out.println("The number times two is: " + (number * 2));
	    }

	    public static void displayItPlusOneHundred(int number) {
	        System.out.println("The number plus one hundred is: " + (number + 100));
	    }
	}


