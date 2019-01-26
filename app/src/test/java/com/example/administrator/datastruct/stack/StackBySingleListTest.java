package com.example.administrator.datastruct.stack;

import org.junit.Test;

/**
 * Created by wangweijun on 2018/12/10.
 */

public class StackBySingleListTest {

    Node header;


    class Node {
        Object item;
        Node next;

        public Node(Object item) {
            this.item = item;
        }
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (header == null) {
            header = newNode;
            return;
        }
        Node currentNode = header;
        Node parentNode = null;
        while (currentNode != null) {
            parentNode = currentNode;
            currentNode = currentNode.next;
        }
        parentNode.next = newNode;
    }

    public Object pop() {
        if (header == null) {
            return null;
        }
        if (header.next == null) {
            Node current = header;
            header = null;
            return current;
        }

        Node currentNode = header;
        Node parent = null;
        while (currentNode.next != null) {
            parent = currentNode;
            currentNode = currentNode.next;
        }
        if (parent != null) {
            parent.next = null;
        }
        return currentNode;
    }


    @Test
    public void testMyLinkedList2() {
        StackBySingleListTest test = new StackBySingleListTest();
        for (int i=0; i<5; i++) {
            test.push(i);
        }
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
        test.pop();
        print(test.header);
    }

    public void print(Node node) {
        if (node ==  null) {
            System.out.println("node list is null");
            return;
        }
        while (node != null) {
            System.out.print(node.item + " ");
            node = node.next;
        }
        System.out.println();
    }

}
