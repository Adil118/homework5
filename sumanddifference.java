package corejava;

public class sumanddifference {

	public static void main(String[] args) {

        int num1 = 40;
        int num2 = 25;

        sum(num1, num2);
        difference(num1, num2);
    }

    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Sum: " + result);
    }

    public static void difference(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Difference: " + result);
    }
}



