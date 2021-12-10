package org.example.utility;

import java.util.Objects;

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

    public static int[] copy(int[] array){
        if(Objects.isNull(array)){
            throw new NullPointerException("Array is null");
        }
        int size = array.length;
        int[] copiedArray = new int[size];
        System.arraycopy(array, 0, copiedArray, 0, size);

        return copiedArray;
    }
}
