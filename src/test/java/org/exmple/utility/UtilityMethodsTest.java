package org.exmple.utility;

import org.example.utility.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilityMethodsTest {

    @Test
    public void add_shouldAddTwoNumbers() {
        int a = 1;
        int b = 2;

        var result = UtilityMethods.add(a, b);

        assertEquals(3, result);
    }

    @Test
    public void subtract_shouldSubtractTwoNumbers() {
        int a = 1;
        int b = 2;

        var result = UtilityMethods.subtract(a, b);

        assertEquals(-1, result);
    }

    @Test
    public void multiply_shouldMultiplyTwoNumbers() {
        int a = 1;
        int b = 2;

        var result = UtilityMethods.multiply(a, b);

        assertEquals(2, result);
    }
}
