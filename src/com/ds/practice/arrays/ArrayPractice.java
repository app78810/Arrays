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
			
			if(index<=arr.length) {
			{
				System.out.println(arr[index]);
			}
			}
			else
			{
				throw new IndexOutOfBoundsException();
			}
		}
		
		/*
		 * search given key in array and print index of 
		 * the key if key exist in the array else print -1
		 */
		public static void search(int[] arr, int key) {
		
			int indexval = 0;
			for(int i=0; i<arr.length; i++) {
				indexval = arr[i];
				if(key==indexval) {
				System.out.println(indexval);
				}
								
			}
		}
		
		/**
		 * write method which will create another array and copy elements 
		 * from passed array to newly created array and return newly created array
		 */
		public static int[] clone(int[] arr) {
			
			int[] arr2 = arr.clone();
			
			System.out.print("Cloned Array is as follow: {");
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i]);
				System.out.print(",");	
			}
			System.out.print("}");
			return arr2;
			
			}
		
		public static void main(String[] args) {
			int[] arr = {0,5,4,6,3,9};
			printElement(arr, 2);
			printElement(arr, 4);
			
			search(arr, 5);
			search(arr, 9);
			
			//int[] clone = clone(arr);
			
			clone(arr);
		}
}
