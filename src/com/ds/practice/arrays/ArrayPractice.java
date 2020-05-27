package com.ds.practice.arrays;

/**
 * for each method write time complexity in terms of O(n) or O(1)
 * 
 *
 */
public class ArrayPractice {

	/*method to print element from given index for given array
	handle index out of bound scenario
	*/
	public static void printElement(int[] arr, int index) {
		
	}
	
	/*
	 * search given key in array and print index of 
	 * the key if key exist in the array else print -1
	 */
	public static void search(int[] arr, int key) {
		
	}
	
	/**
	 * write method which will create another array and copy elements 
	 * from passed array to newly created array and return newly created array
	 */
	public static int[] clone(int[] arr) {
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0,5,4,6,3,9};
		printElement(arr, 2);
		printElement(arr, 8);
		
		search(arr, 5);
		search(arr, 11);
		
		int[] clone = clone(arr);
		
		System.out.println(clone);
	}

}
