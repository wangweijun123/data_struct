package com.example.administrator.datastruct;

public class TestMain {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0, 4);
		linkedList.add(1);
		linkedList.add(6);
		linkedList.add(0,8);
		linkedList.remove(4);
		for(int i = 0; i < linkedList.size; i++) {
			System.out.print( i + ":" + linkedList.get(i) + "  ");
		}
	}

}
