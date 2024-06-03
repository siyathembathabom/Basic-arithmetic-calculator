package basic.calculator.arithmetic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class arithmeticCalculatorTest {

    @Test
    public void additionTest() {
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbersList.add(i);
        }
        int sum = arithmeticCalculator.addition(numbersList);
        assertEquals(10, sum);
    }

    @Test
    public void subtractionTest() {
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 2; i >= 1; i--) {
            numbersList.add(i);
        }
        int difference = arithmeticCalculator.subtraction(numbersList);
        assertEquals(1, difference);
    }

    @Test
    public void multiplicationTest() {
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            numbersList.add(i);
        }
        int product = (int) arithmeticCalculator.multiplication(numbersList);
        assertEquals(24, product);
    }


    @Test
    public void divisionTest() {
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            numbersList.add(i);
        }
        double quotient = arithmeticCalculator.division(numbersList);
        double delta = 0.0001;
        assertEquals(0.5, quotient, delta);
    }
}
