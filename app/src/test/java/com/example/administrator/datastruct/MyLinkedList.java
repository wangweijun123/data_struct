package com.example.administrator.datastruct;

public class MyLinkedList<E> {
    Node<E> first;
    Node<E> last;
    int size;

    public void add(E e) {
        linkLast(e);
    }

    public void add(E e, int index) {
        if (index == size) {
            linkLast(e);
        } else {
            linkBefore(e, index);
        }
    }

    private void linkBefore(E e, int index) {
        Node<E> succ = get(index);
        Node<E> preNode = succ.pre;
        Node<E> newNode = new Node<E>(e, preNode, succ);
        succ.pre = newNode;
        if (preNode == null) {
            first = newNode;
        } else {
            preNode.next = newNode;
        }
        size++;
    }

    // 都有四部
    private void linkLast(E e) {
        System.out.println("添加到最后 e:" + e);
        Node<E> l = last;
        Node<E> newNode = new Node<E>(e, l, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public Node<E> remove(int index) {
        Node<E> target = get(index);
        Node<E> preNode = target.pre;
        Node<E> nextNode = target.next;
        target.pre = null;
        target.next = null;

        if (preNode == null) {
            first = nextNode;
        } else {
            preNode.next = nextNode;
        }

        if (nextNode == null) {
            last = preNode;
        } else {
            nextNode.pre = preNode;
        }
        size--;
        return target;
    }


    public Node<E> get(int index) {
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
