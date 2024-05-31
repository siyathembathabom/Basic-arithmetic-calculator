package basic.calculator.arithmetic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private static ArrayList<Integer> numbersArray = new ArrayList<>();

    // 1. Addition method.
    public static int addition() {
        int sum = 0;
        for (int number: numbersArray) {
            sum += number;
        }
        return sum;
    }

    // 2. Subtraction method.
    public static int subtraction() {
        // TODO
        return 1;
    }

    // 3. Multiplication method.
    public static double multiplication() {
        // TODO
        return 1.0;
    }

    // 4. Division method.
    public static double division() {
        // TODO
        return 1.0;
    }

    public static void input() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the numbers you wish to add/subtract/multiply/divide.\nEnter a \"done\" when finished.");

        while (true) {
            System.out.print("Enter the number: ");
            String number = userInput.nextLine();

            if (number.equalsIgnoreCase("Done")) {
                break;
            } else if (isNumber(number)) {
                numbersArray.add(Integer.parseInt(number));
            }
        }
    }

    public static boolean isNumber(String userInput) {

        // try/catch block to try change a string input by the user to an int type.
        // and catch a NumberFormatException if it cannot become an int.
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. ");
            return false;
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(addition());
    }
}
