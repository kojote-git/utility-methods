package org.exmple.utility;

import org.example.utility.UtilityMethods;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

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
        int[] array = {1, -1, 2, -2, 3, -3, 4, -4, -5, 5, -6, 6, -7, 7, -8, 8, -9, 9};

        int result = UtilityMethods.countPositive(array);

        assertEquals(9, result);
    }

    @Test
    public void countPositive_shouldThrowNullPointerException() {
        int[] array = null;

        Exception exception = assertThrows(NullPointerException.class, () -> UtilityMethods.countPositive(array));

        assertEquals("Your array is empty.", exception.getMessage());
    }

    @Test
    public void copy_shouldReturnCopiedArray() {
        int[] array = {1, 2, 3, -7};

        int[] expectedArray = {1, 2, 3, -7};
        int[] actualArray = UtilityMethods.copy(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(expectedArray[i], actualArray[i]);
        }

    }

    @Test
    public void copy_shouldThrowNullPointerException() {
        int[] array = null;

        Exception exception = assertThrows(NullPointerException.class, () -> UtilityMethods.copy(array));

        String expectedMassage = "Array is null";
        String actualMassage = exception.getMessage();

        assertEquals(expectedMassage, actualMassage);
    }

    @Test
    public void countNegative_shouldReturnFive() {
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3};

        int result = UtilityMethods.countNegative(array);
        assertEquals(5, result);
    }

    @Test
    public void countNegative_shouldReturnException() {
        int[] array = null;
        assertThrows(NullPointerException.class, () -> UtilityMethods.countNegative(array));
    }

    @Test
    public void compareByNegativeCount_shouldReturnOne() {
        int[] a = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByNegativeCount(a, b);
        assertEquals(1, result);
    }

    @Test
    public void compareByNegativeCount_shouldReturnMinusOne() {
        int[] a = {5, 4, -3, -2, -1, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByNegativeCount(a, b);
        assertEquals(-1, result);
    }

    @Test
    public void compareByNegativeCount_shouldReturnZero() {
        int[] a = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, -4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByNegativeCount(a, b);
        assertEquals(0, result);
    }

    @Test
    public void compareByNegativeCount_shouldThrowNullPointerException() {
        int[] a = null;
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        assertThrows(NullPointerException.class, () -> UtilityMethods.compareByNegativeCount(a, b));
    }

    @Test
    public void compareByNegativeCount_shouldThrowExceptionBecauseArraysHaveDifferentSize() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        assertThrows(IllegalArgumentException.class, () -> UtilityMethods.compareByNegativeCount(a, b));
    }

    @Test
    public void compareByOddCount_shouldReturnOne(){
        int[] a = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByOddCount(a, b);
        assertEquals(1, result);
    }

    @Test
    public void compareByOddCount_shouldReturnMinusOne(){
        int[] a = {-8, -4, -3, -2, -6, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByOddCount(a, b);
        assertEquals(-1, result);
    }

    @Test
    public void compareByOddCount_shouldReturnZero(){
        int[] a = {-7, -4, -3, -2, -6, 0, 1, 2, 3};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByOddCount(a, b);
        assertEquals(0, result);
    }

    @Test
    public void compareByOddCount_shouldThrowNullPointerException() {
        int[] a = null;
        int[] b = {-7, -4, -3, -2, -6, 0, 1, 2, 3};
        assertThrows(NullPointerException.class, () -> UtilityMethods.compareByOddCount(a, b));
    }

    @Test
    public void compareByOddCount_shouldThrowExceptionBecauseArraysHaveDifferentSize() {
        int[] a = { 9, 10, 11, 12};
        int[] b = {0, 1, 1, 2, 3, 4, 5, 6, 6};
        assertThrows(IllegalArgumentException.class, () -> UtilityMethods.compareByOddCount(a, b));
    }

    @Test
    public void reverse_shouldReverseArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] check = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        UtilityMethods.reverse(array);
        Assertions.assertArrayEquals(check, array);
    }

    @Test
    public void findIndex_shouldReturnNine() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int res = UtilityMethods.findIndex(a, 10);

        assertEquals(9, res);
    }

    @Test
    public void findIndex_shouldReturnNegativeNumber() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};

        int res = UtilityMethods.findIndex(a, 10);

        assertEquals(-1, res);
    }

    @Test
    public void compareByPositiveCount_shouldReturnZero(){
        int[] a = {1, 1, -3, 8, 7, 0, 3, -9, -6};
        int[] b = {0, 1, -2, -3, 4, 6, 7, 8, -9};
        int result = UtilityMethods.compareByPositiveCount(a, b);
        assertEquals(0, result);
    }

    @Test
    public void compareByPositiveCount_shouldReturnOne(){
        int[] a = {1, 1, 3, 8, -7, 0, 3, 9, 6};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        int result = UtilityMethods.compareByPositiveCount(a, b);
        assertEquals(1, result);
    }

    @Test
    public void compareByPositiveCount_shouldReturnMinusOne(){
        int[] a = {1, 1, -3, 8, -7, 0, -3, -9, -6};
        int[] b = {0, 1, 2, 3, 4, 6, 7, 8, -9};
        int result = UtilityMethods.compareByPositiveCount(a, b);
        assertEquals(-1, result);
    }

    @Test
    public void compareByPositiveCount_shouldThrownIllegalArgumentException(){
        int[] a = {0, 1, 2, 3, 4, -6, -7, -8, -9, 12, 23};
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        assertThrows(IllegalArgumentException.class, () -> UtilityMethods.compareByPositiveCount(a, b));
    }

    @Test
    public void compareByPositiveCount_shouldThrownNullPointerException(){
        int[] a = null;
        int[] b = {0, 1, 2, 3, 4, -6, -7, -8, -9};
        assertThrows(NullPointerException.class, () -> UtilityMethods.compareByPositiveCount(a, b));
    }
}
