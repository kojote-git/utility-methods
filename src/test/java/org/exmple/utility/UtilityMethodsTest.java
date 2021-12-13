package org.exmple.utility;

import org.example.utility.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilityMethodsTest {

    @Test
    public void add_shouldAddTwoNumbers() {
        int a = 1;
        int b = 2;

        int result = UtilityMethods.add(a, b);

        assertEquals(3, result);
    }

    @Test
    public void subtract_shouldSubtractTwoNumbers() {
        int a = 1;
        int b = 2;

        int result = UtilityMethods.subtract(a, b);

        assertEquals(-1, result);
    }

    @Test
    public void multiply_shouldMultiplyTwoNumbers() {
        int a = 1;
        int b = 2;

        int result = UtilityMethods.multiply(a, b);

        assertEquals(2, result);
    }

    @Test
    public void isEven_shouldReturnTrue() {
        int a = 2;

        boolean result = UtilityMethods.isEven(a);

        assertTrue(result);
    }

    @Test
    public void isEven_shouldReturnFalse() {
        int a = 1;

        boolean result = UtilityMethods.isEven(a);

        assertFalse(result);
    }

    @Test
    public void isOdd_shouldReturnTrue() {
        int a = 1;

        boolean result = UtilityMethods.isOdd(a);

        assertTrue(result);
    }

    @Test
    public void isOdd_shouldReturnFalse() {
        int a = 2;

        boolean result = UtilityMethods.isOdd(a);

        assertFalse(result);
    }

    @Test
    public void countOdd_shouldReturn4() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0};

        int expected = 4;
        int result = UtilityMethods.countOdd(numbers);

        assertEquals(expected, result);

    }

    @Test
    public void countOdd_shouldReturn0() {
        int[] numbers = new int[]{12, 2, 16, 4, 54, 6, 90, 8, 0};

        int expected = 0;
        int result = UtilityMethods.countOdd(numbers);

        assertEquals(expected, result);

    }
}
