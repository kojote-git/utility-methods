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

    public static int countNegative(int[] array) {
        checkNotNull(array, "Array is null.");
        return (int) Arrays.stream(array)
                .filter(value -> value < 0)
                .count();
    }
}
