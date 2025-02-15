package Assignement1;

import java.util.Scanner;

public class ArrayElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of your array : ");
		int size = scanner.nextInt();
		
//		System.out.println("***********Array of integer elements***********");
//		int[] array = new int[size];
//		
//		System.out.println("Enter " + size + " integer elements for your array : ");
//		
//		for (int i = 0; i < size; i++) {
//			System.out.print("Element " + (i + 1) + ": ");
//			array[i] = scanner.nextInt();
//		}
//		
//		System.out.println("Here is your Array:");
//		for (int num : array) {
//			System.out.print(num +" ");
//		}
		
		System.out.println("***********Array of String elements***********");
		scanner.nextLine();

		String[] array = new String[size];
		
		System.out.println("Enter " + size + " String elements for your array : ");
		
		for (int i = 0; i < size; i++ ) {
			System.out.print("Element " + (i + 1) + ": ");
			array[i] = scanner.nextLine();
		}
		
		System.out.println("Here is your Array:");
		for (String el : array) {
			System.out.print(el +" ");
		}
		
		scanner.close();
	}
}
