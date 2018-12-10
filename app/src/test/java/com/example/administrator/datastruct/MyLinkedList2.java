package com.example.administrator.datastruct;

public class MyLinkedList2<E> {
    Node<E> first;
    Node<E> last;
    int size;

    public void add(E e, int index) {
        if (first == null) {// 空集合
            System.out.println("空集合添加"+index);
            Node<E> newNode = new Node<>(e, null, null);
            first = newNode;
            last = newNode;
        } else {
            Node<E> targetNode = get(index);
            if (targetNode == null) {// 添加到尾部
                System.out.println("添加到尾部 index:"+index);
                Node<E> l = last;
                Node<E> newNode = new Node<>(e, l, null);
                last = newNode;
                l.next = newNode;
            } else {//
                System.out.println("添加到前面"+index);
                Node<E> pre = targetNode.pre;
                Node<E> newNode = new Node<>(e, pre, targetNode);
                targetNode.pre = newNode;
                if (pre == null) {
                    first = newNode;
                } else {
                    pre.next = newNode;
                }
            }
        }
        size ++;
    }
    
    public Node<E> remove(int index) {
        Node<E> target = get(index);
        Node<E> pre = target.pre;
        Node<E> next = target.next;
        target.pre = null;
        target.next = null;

        if (pre == null) {
            first = next;
        } else {
            pre.next = next;
        }

        if (next == null) {
            last = pre;
        } else {
            next.pre = pre;
        }

        size--;
        return  null;
    }

    public Node<E> get(int index) {
        if (index >= size) {
            return null;
        }
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.pre;
            }
        }
        return node;
    }

    public int size() {
        return size;
    }


    class Node<E> {
        E item;
        Node<E> pre;
        Node<E> next;

        public Node(E item, Node<E> pre, Node<E> next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
}
