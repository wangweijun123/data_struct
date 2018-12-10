package com.example.administrator.datastruct.stack;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by wangweijun on 2018/12/10.
 */

public class StackByArrayTest {

    class MyStack {
        int capacity = 10;
        Object[] elementData = new Object[capacity];
        int elementCount;

        public void push(Object obj) {
            if (elementCount >= elementData.length) {
                int newLength = capacity * 2;
                elementData = Arrays.copyOf(elementData, newLength);
            }
            elementData[elementCount++] = obj;
        }

        public Object pop() {
            Object obj = elementData[elementCount - 1];
            elementData[elementCount - 1] = null;
            elementCount--;
            return obj;
        }
    }

    @Test
    public void testMyStack() {
        MyStack stack = new MyStack();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        print(stack.elementData);
        System.out.println("pop:"+stack.pop());
        System.out.println("pop:"+stack.pop());
        System.out.println("pop:"+stack.pop());
        print(stack.elementData);
    }

    @Test
    public void testArrayscopyOf() {
        Object[] elementData = new Object[3];
        for (int i = 0; i < elementData.length; i++) {
            elementData[i]  = 0;
        }
        print(elementData);

        elementData = Arrays.copyOf(elementData, 6);
        print(elementData);

    }


    @Test
    public void testArrayscopy() {
        Object[] elementData = new Object[10];
        for (int i = 0; i < elementData.length; i++) {
            elementData[i]  = i;
        }
        print(elementData);

        int index = 5;
        int length = elementData.length - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, length);

        print(elementData);
    }



    private void print(Object[] elementData) {
        for (int i = 0; i < elementData.length; i++) {
            System.out.print(i+"："+elementData[i] + "   ");
        }
        System.out.println();
    }
}
