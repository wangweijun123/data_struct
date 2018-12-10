package com.example.administrator.datastruct;

import org.junit.Test;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestMyLinkedList {
    @Test
    public void test() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(2.5, 3);

        int size = myLinkedList.size();
        System.out.println("size:" + size);
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":" + myLinkedList.get(i).item + "   ");
        }
        int deleteIndex = 1;
        myLinkedList.remove(deleteIndex);

        size = myLinkedList.size();
        System.out.println();
        System.out.println("deleteIndex:" + deleteIndex + "被删除后的 size:" + size);
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":" + myLinkedList.get(i).item + "   ");
        }

    }


    @Test
    public void testMyLinkedList2() {
        MyLinkedList2 myLinkedList = new MyLinkedList2();
        myLinkedList.add(0, 0);
        myLinkedList.add(1, 0);
        myLinkedList.add(2, 0);
        myLinkedList.add(2.5, 2);

        int size = myLinkedList.size();
        System.out.println("size:" + size);
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":" + myLinkedList.get(i).item + "   ");
        }
    }
    /*@Test
    public void testUser() {
        User user = new User("first");
        User nextUser = user.next;
        System.out.println("nextUser: " +nextUser);
        user.next = new User("second");
        System.out.println("nextUser: " +nextUser);
        System.out.println("user.next: " +user.next);
        if (nextUser == null) {

        }

    }*/
}