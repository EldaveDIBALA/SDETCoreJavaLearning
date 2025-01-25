package Lab1;

import java.util.Scanner;

public class RectangleMeasurment {
    private double length;
    private double depth;

    public RectangleMeasurment(double length, double depth) {
        this.length = length;
        this.depth = depth;
    }

    public double calculateArea() {
        return length * depth;
    }
    
    public double calculatePerimeter() {
    	return 2 * (length + depth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Veuillez entrer la longueur du rectangle : ");
        double length = scanner.nextDouble();

        System.out.print("Veuillez entrer la largeur du rectangle : ");
        double depth = scanner.nextDouble();


        RectangleMeasurment rectangle = new RectangleMeasurment(length, depth);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        
        System.out.printf("L'aire du rectangle est : %.2f%n", area);
        System.out.printf("Le périmètre du rectangle est : %.2f%n", perimeter);
        scanner.close();
    }
}
