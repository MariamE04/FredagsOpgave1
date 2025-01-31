package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("cal test1")
    void testSomething1(){
        int expected = 10;
        int actual = calculator.add(5,5);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("cal test2")
    void testSomething2(){
        int expected = 4;
        int actual = calculator.subtract(6,2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("cal test3")
    void testSomething3(){
        int expected = 25;
        int actual = calculator.multiply(5,5);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("cal test4")
    void testSomething4(){
        int expected = 5;
        int actual = calculator.divide(10,2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("cal test5")
    void testSomething5(){
        String input = "1,2,3";
        int expected = 6;
        int actual = calculator.add("1,2,3");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("cal test6")
    void testSomething6(){
        int[] numbers = {1, 2, 3};
        int expected = 6;
        int actual = calculator.add(numbers);
        assertEquals(expected, actual);
    }

}