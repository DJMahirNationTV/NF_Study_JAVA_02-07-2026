package Operators;

import java.util.Scanner;

public class exerciseOperator {
    public static void main(String[] args) {
        // L1.1
        // Returns true or false if the numbers are the same or not.
        int num1 = 3;
        int num2 = 11;
        int calcResult = num1 + num2;
        System.out.println("Calculated: " + calcResult);

        // L1.2
        if (num1 == num2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // L1.3
        if (calcResult > 0 && calcResult <= 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // L2.1
        int diviResult = num1 % num2;

        if (diviResult == 0 && true) {
            System.out.println("Result: " + diviResult + " (true)");
        } else {
            System.out.println("Result: " + diviResult + " (false)");
        }

        // L2.2
        int preis = 43;
        boolean rabbat = true;

        if (rabbat == true) {
            System.out.println(preis % 10);
        } else {
            System.out.println(preis);
        }

        // L2.3, L3.1, L3.2 (Skipped)
        // L3.3
        System.out.println("Welcome!\nDeveloped by M.K.\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Age: ");
        int userAge = input.nextInt();

        System.out.println("Are you a Member? (true/false): ");
        boolean isMember = input.nextBoolean();

        if (userAge >= 18 && isMember == true) {
            System.out.println("Welcome back!");
        } else if (userAge >= 18 && isMember == false) {
            System.out.println("You must be a Member before entering!");
        } else if (userAge < 18) {
            System.out.println("You must be 18 Years old and be a Member before entering!");
        }
        input.close();
    }
}
