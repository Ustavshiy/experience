package com.courses.apollo.service.collections;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Stack;

/**
 * Class for testing SwapStacksContentTest.
 */
public class SwapStacksContentTest {
    private final static SwapStacksContentTest swapStacksTest = new SwapStacksContentTest();
    private final static SwapStacksContent swapStacks = new SwapStacksContent();
    private static Stack<Integer> stackOne;
    private static Stack<Integer> stackTwo;
    private static Stack<Integer> stackOneSwaped;
    private static Stack<Integer> stackTwoSwaped;

    @BeforeClass
    public static void addStacks() {
        stackOne = new Stack<Integer>() {{
            push(1);
            push(2);
            push(3);
        }};
        stackTwo = new Stack<Integer>() {{
            push(4);
            push(5);
            push(6);
        }};
        stackOneSwaped = new Stack<Integer>() {{
            push(4);
            push(5);
            push(6);
        }};
        stackTwoSwaped = new Stack<Integer>() {{
            push(1);
            push(2);
            push(3);
        }};
        swapStacks.swapStacksContent(stackOne, stackTwo);
    }

    @Test
    public void swapStacksContentTest() {
        Assert.assertTrue(stackOne.equals(stackOneSwaped) && stackTwo.equals(stackTwoSwaped));
    }
}