package org.example.utility;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Arrays;

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

    public static int[] copy(int[] array) {
        checkNotNull(array, "Array is null");
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

    public static int compareByNegativeCount(int[] a, int[] b) {
        checkNotNull(a, "Your array is empty.");
        checkNotNull(b, "Your array is empty.");

        if (a.length == b.length) {
            int first = countNegative(a);
            int second = countNegative(b);
            if (first > second) {
                return 1;
            }
            if (first < second) {
                return -1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException();
        }
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
