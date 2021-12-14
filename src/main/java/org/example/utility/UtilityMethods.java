package org.example.utility;

import com.google.common.base.Preconditions;

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

    public static void reverse(int[] array) {
        Preconditions.checkNotNull(array);
        int end = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[end];
            array[end] = array[i];
            array[i] = temp;
            end--;
        }
    }
}
