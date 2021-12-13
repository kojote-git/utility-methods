package org.exmple.utility;

import org.example.utility.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertNotNull;

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
    public void countEven_shouldCountEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = UtilityMethods.countEven(array);

        assertEquals(5, result);
    }

    @Test
    public void countEven_shouldThrowNullPointerException() {
        int[] array = null;

        Exception exception = assertThrows(NullPointerException.class, () -> UtilityMethods.countEven(array));

        String expectedMessage = "Your array is null!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void countPositive_shouldCountPositiveNum() {
        int[] array = {1,-1,2,-2,3,-3,4,-4,-5,5,-6,6,-7,7,-8,8,-9,9};

        int result = UtilityMethods.countPositive(array);

        assertEquals(9, result);
    }
    @Test
    public void countPositive_shouldThrowNullPointerException() {
        int[] array = null;

        Exception exception = assertThrows(NullPointerException.class,() -> UtilityMethods.countPositive(array));
        assertEquals("Your array is empty.",exception.getMessage());
    }
}
