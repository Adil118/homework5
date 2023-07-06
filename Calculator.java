package corejava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the price of the item: ");
	        double productPrice = scanner.nextDouble();

	        System.out.print("Enter the salesperson's commission rate (%): ");
	        double commissionRate = scanner.nextDouble();

	        System.out.print("Enter the customer discount rate (%): ");
	        double discountRate = scanner.nextDouble();

	        double finalPrice = calculateFinalPrice(productPrice, commissionRate, discountRate);

	        System.out.println("Final Price: $" + finalPrice);
	    }

	    public static double calculateFinalPrice(double productPrice, double commissionRate, double discountRate) {
	        double commissionAmount = (commissionRate / 100) * productPrice;
	        double totalPrice = productPrice + commissionAmount;
	        double discountAmount = (discountRate / 100) * totalPrice;
	        double finalPrice = totalPrice - discountAmount;
	        return finalPrice;
	    }
	}




