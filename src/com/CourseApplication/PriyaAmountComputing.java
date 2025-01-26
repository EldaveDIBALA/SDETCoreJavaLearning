package com.CourseApplication;

import java.util.Scanner;

public class PriyaAmountComputing {
	
//    Method 1
	
//	  int priceItemA = 200;
//    int quantityItemA = 3;
//
//    int priceItemB = 80;
//    int quantityItemB = 5;
//
//    int priceItemC = 150;
//    int quantityItemC = 2;
//    
//    private static final double DISCOUNT_RATE = 0.15;
//    private static final double TAX_RATE = 0.02;
//
//    public void show() {
//        int pricePerItemA = priceItemA * quantityItemA;
//        int pricePerItemB = priceItemB * quantityItemB;
//        int pricePerItemC = priceItemC * quantityItemC;
//        
//        int totalAmount = pricePerItemA + pricePerItemB + pricePerItemC;
//
//        double discount = totalAmount * DISCOUNT_RATE;
//        double discountedAmount = totalAmount - discount;
//
//        double tax = discountedAmount * TAX_RATE;
//        double finalAmount = discountedAmount + tax;
//
//        System.out.println("The amount A Items is: " + pricePerItemA);
//        System.out.println("The amount B Items is: " + pricePerItemB);
//        System.out.println("The amount C Items is: " + pricePerItemC);
//        System.out.println("The amount is: " + totalAmount);
//        System.out.println("After discount, the amount is: " + discountedAmount);
//        System.out.println("After discount and tax, the amount is: " + finalAmount);
//    }
//
//    public static void main(String[] args) {
//        PriyaAmountComputing computation = new PriyaAmountComputing();
//        computation.show();
//	}
    
//   Method 2, with more fun :)
    
//	public static void main(String[] args) {
//		
//		Object data[][] =	{
//				{"Items", "Price", "Quantity bought"},
//				{"Item A", 200, 3},
//				{"Item B", 80, 5},
//				{"Item C", 150, 2}
//		};
//	
//	    final double DISCOUNT_RATE = 0.15;
//	    final double TAX_RATE = 0.02;
//	    
//	    double totalAmount = 0.0;
//	    
//	    System.out.println("Details of purchased items: ");
//        System.out.println("----------------------------");
//		
//		for(Object[] i : data) {
//			for(Object j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//	    for(int i = 1; i < data.length; i++) {
//	    	int pricePerItem = (int) data[i][1];
//	    	int quantityPerItem = (int) data[i][2];
//	    	totalAmount += pricePerItem * quantityPerItem;
//	    }
//        System.out.println("----------------------------");
//	    System.out.println("Your cart is up to: "+totalAmount);
//	    
//	    double discountedAmount = totalAmount - (totalAmount * DISCOUNT_RATE);
//        System.out.println("----------------------------");
//        System.out.println("After disctount, the amount is: "+discountedAmount);
//		
//		double finalAmount = discountedAmount + (discountedAmount * TAX_RATE);
//        System.out.println("----------------------------");
//		System.out.print("After discount and tax, the amount is: "+finalAmount);
//	}	
//} 

//Method 3, going further ;)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Object data[][] =	{
				{"Items", "Price", "Quantity bought"},
				{"Item A", 0, 0},
				{"Item B", 0, 0},
				{"Item C", 0, 0}
		};
		
		for(int i = 1; i < data.length; i++) {
			System.out.print("Enter the price of "+ data[i][0] +": ");
			data[i][1] = scanner.nextInt();

			System.out.print("Enter the quantity of "+ data[i][0] +": ");
			data[i][2] = scanner.nextInt();
		}
	
	    final double DISCOUNT_RATE = 0.15;
	    final double TAX_RATE = 0.02;
	    
	    double totalAmount = 0.0;
	    
	    System.out.println("----------------------------");
	    System.out.println("Details of purchased items: ");
        System.out.println("----------------------------");
		
		for(Object[] i : data) {
			for(Object j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	    for(int i = 1; i < data.length; i++) {
	    	int pricePerItem = (int) data[i][1];
	    	int quantityPerItem = (int) data[i][2];
	    	totalAmount += pricePerItem * quantityPerItem;
	    }
        System.out.println("----------------------------");
	    System.out.println("Your cart is up to: $"+totalAmount);
	    
	    double discountedAmount = totalAmount - (totalAmount * DISCOUNT_RATE);
        System.out.println("----------------------------");
        System.out.println("After disctount, the amount is: $"+discountedAmount);
		
		double finalAmount = discountedAmount + (discountedAmount * TAX_RATE);
        System.out.println("----------------------------");
		System.out.print("After discount and tax, the amount is: $"+finalAmount);
		
		scanner.close();
	}	
} 

