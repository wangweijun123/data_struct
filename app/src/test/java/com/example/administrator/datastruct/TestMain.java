package com.example.administrator.datastruct;

import org.junit.Test;

import java.util.HashMap;

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



	@Test
	public void testHashMap() {
		HashMap<User, String> hashmap = new HashMap<>();
		String pre = hashmap.put(new User("xxx"), "xxx");
		System.out.println(hashmap.size() + ", pre:"+pre);

		pre = hashmap.put(new User("xxx"), "yyyy");
		System.out.println(hashmap.size() + ", pre:"+pre);

	}

}
