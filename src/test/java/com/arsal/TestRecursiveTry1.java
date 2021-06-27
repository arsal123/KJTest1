package com.arsal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecursiveTry1 {

    // Run the test
    RecursiveTry1 recursiveTry1UnderTest = new RecursiveTry1();

    @Test
    public void testSquareroot() {
        // Setup
        final double result = recursiveTry1UnderTest.squarerootDoWhile(16);

        // Verify the results
        assertEquals(4, result, 0.0001);
    }
}
