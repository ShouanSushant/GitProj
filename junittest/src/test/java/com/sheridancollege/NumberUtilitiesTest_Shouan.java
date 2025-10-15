package com.sheridancollege;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilitiesTest_Shouan {

    NumberUtilities numUtil = new NumberUtilities();

    //checks for prime numbers,non-prime numbers, and edge cases.

    @Test
    public void testIsPrime_S() {

        assertTrue(numUtil.isPrime(2), "2 needs to be stated prime");
        assertTrue(numUtil.isPrime(13), "13 needs to be stated prime");

        assertFalse(numUtil.isPrime(4), "4 needs not be prime");
        assertFalse(numUtil.isPrime(9), "9 needs not be prime");

        assertFalse(numUtil.isPrime(1), "1 is not prime");
        assertFalse(numUtil.isPrime(0), "0 is not prime");
        assertFalse(numUtil.isPrime(-5), "Negative numbers can not prime");
    }

    //verifies the max in three numbers
    @Test
    public void testFindMaximum_S() {
        // Normal
        assertEquals(10, numUtil.findMaximum(5, 10, 3), "Max should be 10");
        assertEquals(15, numUtil.findMaximum(15, 10, 5), "Max should be 15");
        assertEquals(8, numUtil.findMaximum(2, 8, 6), "Max should be 8");

        // Edge 
        assertEquals(7, numUtil.findMaximum(7, 7, 7), "All equal, max should be 7");
        assertEquals(9, numUtil.findMaximum(9, 9, 5), "Two equal largest values");
    }
    // Test findMaximum method with zero, positive, and negative numbers.
    @Test
    public void testFindMaximumWithZero_S() {
        assertEquals(10, numUtil.findMaximum(0, -5, 10), "Max should be 10");
        assertEquals(0, numUtil.findMaximum(-3, 0, -1), "Max should be 0");
}
}
