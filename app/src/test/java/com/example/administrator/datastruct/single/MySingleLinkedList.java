package com.example.administrator.datastruct.single;

import org.junit.Test;

/**
 * Created by wangweijun on 2018/12/10.
 */

public class MySingleLinkedList<E> {

    Node<E> header;

    int size;

    public void add(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (header == null) {
            header = newNode;
        } else {
            Node<E> node = header;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    public void add(E e, int index) {
        Node<E> newNode = new Node<>(e, null);
        if (header == null) {
            header = newNode;
        } else {
            if (index == 0) {
                addHeader(newNode);
            } else {
                Node<E> node = header;
                while (index > 1) {
                    node = node.next;
                    index--;
                }
                // 要改變node.next 的指針
                Node<E> next = node.next;
                node.next = newNode;
                newNode.next = next;
            }
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            removeHeader();
        } else {
            Node<E> curr = header;
            Node<E> parent = null;
            while (index > 0) {
                parent = curr;
                curr = curr.next;
                index--;
            }
            parent.next = curr.next;
        }
        size--;
    }

    public void reverse() {

    }

    private void removeHeader() {
        header = header.next;
    }

    public void addHeader(Node<E> newNode) {
        newNode.next = header;
        header = newNode;
    }

    public int getSize() {
        return size;
    }

    public Node<E> getNode(int index) {
        Node<E> node = header;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public E get(int index) {
        return getNode(index).e;
    }


    class Node<E> {
        E e;
        Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }
    }


    @Test
    public void testMyLinkedList2() {
        MySingleLinkedList linkedList = new MySingleLinkedList();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);

        linkedList.add(5, 2);

        int size = linkedList.getSize();
        System.out.println("size:" + size);
        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        int deleteIndex = 0;
        linkedList.remove(deleteIndex);
        System.out.println();
        size = linkedList.getSize();
        System.out.println("deleteIndex:" + deleteIndex + "被删除后的 size:" + size);

        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

    }
}
