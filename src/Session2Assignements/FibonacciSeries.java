package Session2Assignements;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// User action method
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Enter the values of series whose Fibonacci you want to compute: ");
//		int values = scanner.nextInt();
//		
//		int first = 0, second = 1;
//		
//		System.out.println("----------------------------");
//		System.out.print("Fibonacci sequence of "+ values +" values is: " );
//		for(int i = 1; i <= values; i++) {
//			System.out.print(first + " ");
//			
//			int next = first + second;
//			first = second;
//			second = next;
//		}
//		scanner.close();
//	}

		// Assignment purpose
		int i = 1; 
		int values = 10;
		int first = 0, second = 1;
		
		System.out.println("----------------------------");
		System.out.print("Fibonacci sequence of "+ values +" values is: " );
		
		do {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
			i++;
		}while(i <= values);

	}

}