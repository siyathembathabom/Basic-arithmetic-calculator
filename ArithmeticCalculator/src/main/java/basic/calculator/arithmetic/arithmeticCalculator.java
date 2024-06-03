package basic.calculator.arithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class arithmeticCalculator {
    public static final Scanner userInput = new Scanner(System.in);

    // 1. Addition method.
    public static int addition(ArrayList<Integer>numbersArray) {
        int sum = 0;
        for (int number: numbersArray) {
            sum += number;
        }
        numbersArray.clear();
        return sum;
    }

    // 2. Subtraction method.
    public static int subtraction(ArrayList<Integer> numbersArray) {
        int difference = numbersArray.getFirst();

        for (int i = 1; i < numbersArray.size(); i++) {
            difference -= numbersArray.get(i);
        }
        numbersArray.clear();
        return difference;
    }

    // 3. Multiplication method.
    public static double multiplication(ArrayList<Integer> numbersArray) {
        int product = 1;

        for (int number: numbersArray) {
            product *= number;
        }
        numbersArray.clear();
        return product;
    }

    // 4. Division method.
    public static double division(ArrayList<Integer> numbersArray) {
        double quotient = numbersArray.getFirst();

        for (int i = 1; i < numbersArray.size(); i++) {
            quotient /= numbersArray.get(i);
        }
        numbersArray.clear();
        return quotient;
    }

    public static ArrayList<Integer> numberInput() {
        ArrayList<Integer> numbersArray = new ArrayList<>();

        while (true) {
            System.out.print("Enter the number or done: ");
            String number = userInput.nextLine();

            if (number.equalsIgnoreCase("Done")) {
                break;
            } else if (isNumber(number)) {
                numbersArray.add(Integer.parseInt(number));
            }
        }
        return numbersArray;
    }

    public static String askForType() {
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

    public static void type(String type, ArrayList<Integer> numbersArray) {

        if (type.equalsIgnoreCase("add") || type.equalsIgnoreCase("+")) {
            System.out.println(addition(numbersArray));
        } else if (type.equalsIgnoreCase("subtract") || type.equalsIgnoreCase("-")) {
            System.out.println(subtraction(numbersArray));;
        } else if (type.equalsIgnoreCase("multiply") || type.equalsIgnoreCase("*")) {
            System.out.println(multiplication(numbersArray));
        } else if (type.equalsIgnoreCase("divide") || type.equalsIgnoreCase("/")) {
            System.out.println(division(numbersArray));
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

    public static void welcome() {
        System.out.println("This is a basic arithmetic calculator.");
        System.out.println("Enter the numbers you wish to add/subtract/multiply/divide.\nEnter \"done\" when finished.");
        System.out.println("Note the operations occur by the sequence of numbers you add.\n*** If you enter 1 thereafter 2, and you decide to divide it, it will be 1 / 2 resulting 0.5. ***\n");
    }

    public static void main(String[] args) {
        welcome();
        ArrayList<Integer> numbersArray = numberInput();
        type(askForType(), numbersArray);
    }
}
