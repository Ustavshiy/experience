package com.courses.apollo.service.collections;

import java.util.Stack;

/**
 * Class for swaping content of two stacks.
 */
public class SwapStacksContent {

    /**
     * Method for swaping content of two stacks.
     */
    public void swapStacksContent(Stack stackOne, Stack stackTwo) {
        Stack bufferOne = new Stack();
        Stack bufferTwo = new Stack();
        reverseSwapContent(stackOne, bufferOne);
        reverseSwapContent(stackTwo, bufferTwo);
        reverseSwapContent(bufferTwo, stackOne);
        reverseSwapContent(bufferOne, stackTwo);
    }

    /**
     * Method for reverse swaping content of two stacks.
     */
    private void reverseSwapContent(Stack source, Stack dest) {
        while (!source.empty()) {
            dest.push(source.pop());
        }
    }
}