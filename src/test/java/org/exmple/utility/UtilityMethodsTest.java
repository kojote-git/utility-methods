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
}
