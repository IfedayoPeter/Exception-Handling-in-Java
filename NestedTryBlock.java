package com.project.exceptionhandling;

public class NestedTryBlock {
	public static void main(String[] args) {

		try {// block1
			try {// block2
				try {// block3
					int arr[] = { 2, 3, 4, 5, };
					System.out.println(arr[4]);

				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("out of bounds in block1:");
					throw e;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("out of bounds in block2:");
				throw e;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("out of bounds in block3:");
			throw e;

		}
	}
}
