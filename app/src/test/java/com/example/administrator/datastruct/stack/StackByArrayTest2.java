package com.example.administrator.datastruct.stack;

import org.junit.Test;

import java.util.Arrays;

public class StackByArrayTest2 {

    class Stack {
        int capacity = 10;
        Object elementData[] = new Object[capacity];
        int count = 0;


        public void push(Object newData) {
            if (count >= elementData.length) {
                elementData = Arrays.copyOf(elementData, capacity*2);
            }
            elementData[count] = newData;
            count++;
        }

        public Object pop() {
            if (count == 0) {
                return null;
            }
            Object target = elementData[count-1];
            elementData[count-1] = null;
            count --;
            return target;
        }
    }

    @Test
    public void testMyStack() {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        print(stack.elementData);
        System.out.println("pop:"+stack.pop());
        System.out.println("pop:"+stack.pop());
        System.out.println("pop:"+stack.pop());
        print(stack.elementData);
    }


    private void print(Object[] elementData) {
        for (int i = 0; i < elementData.length; i++) {
            System.out.print(i+"："+elementData[i] + "   ");
        }
        System.out.println();
    }

 }
