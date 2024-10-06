package com.todo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Main.fibonacci(0));
        assertEquals(1, Main.fibonacci(1));
        assertEquals(55, Main.fibonacci(10));
    }
}

