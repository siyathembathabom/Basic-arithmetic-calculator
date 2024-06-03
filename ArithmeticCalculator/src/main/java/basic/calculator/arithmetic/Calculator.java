package basic.calculator.arithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private static final ArrayList<Integer> numbersArray = new ArrayList<>();
    private static final Scanner userInput = new Scanner(System.in);

    // 1. Addition method.
    private static int addition() {
        int sum = 0;
        for (int number: numbersArray) {
            sum += number;
        }
        numbersArray.clear();
        return sum;
    }

    // 2. Subtraction method.
    private static int subtraction() {
        int difference = numbersArray.getFirst();

        for (int i = 1; i < numbersArray.size(); i++) {
            difference -= numbersArray.get(i);
        }
        numbersArray.clear();
        return difference;
    }

    // 3. Multiplication method.
    private static double multiplication() {
        int product = 1;

        for (int number: numbersArray) {
            product *= number;
        }
        numbersArray.clear();
        return product;
    }

    // 4. Division method.
    private static double division() {
        double quotient = numbersArray.getFirst();

        for (int i = 1; i < numbersArray.size(); i++) {
            quotient /= numbersArray.get(i);
        }
        numbersArray.clear();
        return quotient;
    }

    private static void numberInput() {

        while (true) {
            System.out.print("Enter the number or done: ");
            String number = userInput.nextLine();

            if (number.equalsIgnoreCase("Done")) {
                break;
            } else if (isNumber(number)) {
                numbersArray.add(Integer.parseInt(number));
            }
        }
    }

    private static String askForType() {
        System.out.println("\nThere are 4 types of operations: add (+), subtract (-), multiply (*), divide (/)");

        while (true) {
            System.out.print("Enter the type of operation you want: ");
            String theType = userInput.nextLine();

            switch (theType) {
                case "add", "+", "subtract", "-", "multiply", "*", "divide", "/":
                    return theType;
            }
        }
    }

    private static void type(String type) {

        if (type.equalsIgnoreCase("add") || type.equalsIgnoreCase("+")) {
            System.out.println(addition());
        } else if (type.equalsIgnoreCase("subtract") || type.equalsIgnoreCase("-")) {
            System.out.println(subtraction());;
        } else if (type.equalsIgnoreCase("multiply") || type.equalsIgnoreCase("*")) {
            System.out.println(multiplication());
        } else if (type.equalsIgnoreCase("divide") || type.equalsIgnoreCase("/")) {
            System.out.println(division());
        }
    }

    private static boolean isNumber(String userInput) {

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

    private static void welcome() {
        System.out.println("This is a basic arithmetic calculator.");
        System.out.println("Enter the numbers you wish to add/subtract/multiply/divide.\nEnter \"done\" when finished.");
        System.out.println("Note the operations occur by the sequence of numbers you add.\n*** If you enter 1 thereafter 2, and you decide to divide it, it will be 1 / 2 resulting 0.5. ***\n");
    }

    public static void main(String[] args) {
        welcome();
        numberInput();
        type(askForType());
    }
}
