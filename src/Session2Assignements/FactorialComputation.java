package Session2Assignements;

import java.util.Scanner;

public class FactorialComputation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number whose factorial you want to calculate: ");
		int number = scanner.nextInt();
		
		if(number < 0) {
			System.out.println("Sorry! Cannot calculate the factorial of a negative number.");
		}else {
			int factorial = 1;
			int i = 1;
			
			while(i <= number) {
				factorial *= i;
				i++;
			}
			System.out.println("----------------------------");
			System.out.print("Fatorial of " +number+ " is "+factorial+".");
		}
		scanner.close();
		
	}

}
