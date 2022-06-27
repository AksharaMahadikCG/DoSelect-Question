package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Source{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		ArrayListOps obj = new ArrayListOps();
		ArrayList<Integer> list1 =obj.makeArrayListInt(4);
		ArrayList<Integer> list2 =obj.reverseList(list);
		ArrayList<Integer> list3 =obj.changeList(list2,28,20);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}
