package corejava;

import java.util.Scanner;

public class eggs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int numberOfEggs = sc.nextInt();

        displayDozens(numberOfEggs);
    }

    public static void displayDozens(int numberOfEggs) {
        int dozens = numberOfEggs / 12;
        int remainingEggs = numberOfEggs % 12;

        System.out.println(numberOfEggs + " eggs is " + dozens + " full dozen(s) with " + remainingEggs + " egg(s) remaining.");
    }
}



