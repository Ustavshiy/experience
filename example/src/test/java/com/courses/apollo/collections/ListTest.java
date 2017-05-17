package com.courses.apollo.collections;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

    @Test
    public void testIterator() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Test");
        stringList.add("Test");
        stringList.add("Test");
        for(String str: stringList) {
            System.out.println(str);
        }
    }

    @Test
    public void testVector() {
        Vector<String> strings = new Vector<>();
        strings.add("Test");
        strings.addElement("Test");
    }

    @Test
    public void testCopyOnWriteArrayList() {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("Test");

    }

    @Test
    public void testStack() {
        Stack<String> stringStack = new Stack<>();
        stringStack.add("A");
        System.out.println(stringStack.size());
        stringStack.push("B");
        System.out.println(stringStack.size());
        String fromStackOne = stringStack.peek();
        System.out.println(stringStack.size());
        System.out.println(fromStackOne);
        fromStackOne = stringStack.pop();
        System.out.println(stringStack.size());
        System.out.println(fromStackOne);
    }

    @Test
    public void testLinkedList() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("A");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.remove();
        strings.get(9);
    }

    public static class MyArrayList<E> extends AbstractList<E> {

        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
