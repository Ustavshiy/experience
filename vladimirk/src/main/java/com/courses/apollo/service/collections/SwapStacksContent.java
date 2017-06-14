package com.courses.apollo.service.collections;

import java.util.Stack;

/**
 * Class for swaping content of two stacks.
 */
public class SwapStacksContent {

    /**
     * Method for swaping content of two stacks.
     */
    public <T> void swapStacksContent(Stack<T> stackOne, Stack<T> stackTwo) {
        Stack<T> bufferOne = new Stack<>();
        Stack<T> bufferTwo = new Stack<>();
        reverseSwapContent(stackOne, bufferOne);
        reverseSwapContent(stackTwo, bufferTwo);
        reverseSwapContent(bufferTwo, stackOne);
        reverseSwapContent(bufferOne, stackTwo);
    }

    /**
     * Method for reverse swaping content of two stacks.
     */
    private <T> void reverseSwapContent(Stack<T> source, Stack<T> dest) {
        while (!source.empty()) {
            dest.push(source.pop());
        }
    }
}