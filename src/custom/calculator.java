package custom;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome, this is a Calculator\nDeveloped by M.K.\n");
        // Calculator
        Scanner input = new Scanner(System.in);

        // Define the Var
        System.out.println("Please enter a number: ");
        int result_number1 = input.nextInt();

        System.out.println("Please enter a number: ");
        int result_number2 =  input.nextInt();

        // OPerators
        System.out.println("Please enter a operator (+, -, *, /, %): ");

        String result_operator = input.next();

        // If the Operator is none of them, it will just invalidate it and exit
        if (!result_operator.equals("+") && !result_operator.equals("-") && !result_operator.equals("*") && !result_operator.equals("/") && !result_operator.equals("%")) {
            System.out.println("Invalid input");
            return; // It will just exit...
        }

        int final_Result = 0; // Initalize the Number
        if (result_operator.equals("+")) {
            final_Result = result_number1 + result_number2;
        } else if (result_operator.equals("-")) {
            final_Result = result_number1 - result_number2;
        } else if (result_operator.equals("*")) {
            final_Result = result_number1 * result_number2;
        }  else if (result_operator.equals("/")) {
            final_Result = result_number1 / result_number2;
        } else if (result_operator.equals("%")) {
            final_Result = result_number1 % result_number2;
        }

        // This was just for fun, not required for a Calc!
        if (final_Result <= 30) {
            System.out.println("what a small Number: " + final_Result); // the output
        } else if (final_Result > 30 && final_Result <= 100) {
            System.out.println("what a medium Number: " + final_Result);
        } else {
            System.out.println("god damn, this is a huge Number: " + final_Result);
        }
        input.close(); // It will exit and close the Input field
    }
}