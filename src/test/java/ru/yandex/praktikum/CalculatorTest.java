package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.calculator.Calculator;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "First = {0}, Second = {1}, Third = {2}")
    public static Object[][] getSumData() {
        return new Object[][] {
                { 1, 9, 10},
                { 1, 0, 1},
                { 1, -1, 0},
                { 1, -1, 1},
        };
    }

    @Test
    public void test(){
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals("Expected not Actual",expected, actual);
    }
}
