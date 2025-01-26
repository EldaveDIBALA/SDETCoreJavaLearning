package com.CourseApplication;

import java.util.Scanner;

public class RectangleMeasurment {
    private double length;
    private double width;

    public RectangleMeasurment(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
    	return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Please enter rectangle length: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter rectangle width: ");
        double width = scanner.nextDouble();


        RectangleMeasurment rectangle = new RectangleMeasurment(length, width);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("----------------------------");
        System.out.println("The surface is up to: " +area+ " square.");
        System.out.println("----------------------------");
        System.out.println("The perimeter is up to: " +perimeter+ " meters.");
        
        //A program where you evaluate the result of an arithmetic expressions using unary operators.
        
        System.out.println("----------------------------");
	    System.out.println("Planting a tree in the area makes us remain with: " + --area +" square.");
        
	    //A program to print the quotient and remainder of two numbers.
        System.out.println("----------------------------");
        if(width == 0) {
        	System.out.println("Error: width cannot be null.");
        }else if(length < width) {
        	System.out.println("Error: Length & width values have certainly been mismatched.");
        } else {
        	double quotient = length / width;
        	double remainder = length % width;
        	
        	System.out.println(
        			"Based on calculations, length is "+quotient+" times the width, plus a remainder of "+remainder+"."
        			);
        	
        }
        scanner.close();
     }
}
