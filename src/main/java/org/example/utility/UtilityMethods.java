package org.example.utility;

import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;

public final class UtilityMethods {
    private UtilityMethods() {
        throw new AssertionError();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return b * a;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }

    public static int countEven(int[] array) {
        checkNotNull(array, "Your array is null!");
        int evenElements = 0;
        for (int e : array) {
            if (isEven(e)) {
                evenElements++;
            }
        }
        return evenElements;
    }

    public static int replace(int[] array, int element, int replacement) {
        checkNotNull(array, "Your array is null!");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = replacement;
                count++;
            }
        }
        return count;
    }

    public static int countPositive(int[] array) {
        checkNotNull(array, "Your array is empty.");
        int countPositive = 0;
        for (int i : array) {
            if (i > 0) {
                countPositive++;
            }
        }
        return countPositive;
    }

    public static int[] copy(int[] array){
        checkNotNull(array,"Array is null");
        int size = array.length;
        int[] copiedArray = new int[size];
        System.arraycopy(array, 0, copiedArray, 0, size);

        return copiedArray;
    }

    public static int countNegative(int[] array) {
        checkNotNull(array, "Array is null.");
        return (int) Arrays.stream(array)
                .filter(value -> value < 0)
                .count();
    }

    public static int countOdd(int[] array) {
        checkNotNull(array, "Array is null");
        int count = 0;
        for (int j : array) {
            if (isOdd(j)) {
                count++;
            }
        }
        return count;
    }
}
