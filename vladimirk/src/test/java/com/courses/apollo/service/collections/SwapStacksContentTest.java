package com.courses.apollo.service.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Class for testing SwapStacksContentTest.
 */
public class SwapStacksContentTest {
    private final static SwapStacksContentTest swapStacksTest = new SwapStacksContentTest();
    private final static SwapStacksContent swapStacks = new SwapStacksContent();
    private static Stack<Integer> stackOne = swapStacksTest.getStackOne();
    private static Stack<Integer> stackTwo = swapStacksTest.getStackTwo();

    private Stack<Integer> getStackOne() {
        return new Stack<Integer>() {{
            push(1);
            push(2);
            push(3);
        }};
    }

    private Stack<Integer> getStackTwo() {
        return new Stack<Integer>() {{
            push(4);
            push(5);
            push(6);
        }};
    }

    @Test
    public void swapStacksContentTest() {
        swapStacks.swapStacksContent(stackOne, stackTwo);
        Assert.assertTrue(stackOne.equals(swapStacksTest.getStackTwo())
                && stackTwo.equals(swapStacksTest.getStackOne()));
    }
}
