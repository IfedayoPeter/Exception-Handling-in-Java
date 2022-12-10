package com.project.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public void juniors() {
		try {
			List<Integer> names = new ArrayList<>(4);
			names.add(1);
			int a = names.get(1);
			System.out.println(a);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("OutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("finally");
		}
	}

}
