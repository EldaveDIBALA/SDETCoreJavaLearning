package Lab1;

public class PriyaAmountComputing {
    int priceItemA = 200;
    int quantityItemA = 3;

    int priceItemB = 80;
    int quantityItemB = 5;

    int priceItemC = 150;
    int quantityItemC = 2;
    
    private static final double DISCOUNT_RATE = 0.15;
    private static final double TAX_RATE = 0.02;

    public void show() {
        int pricePerItemA = priceItemA * quantityItemA;
        int pricePerItemB = priceItemB * quantityItemB;
        int pricePerItemC = priceItemC * quantityItemC;
        
        int totalAmount = pricePerItemA + pricePerItemB + pricePerItemC;

        double discount = totalAmount * DISCOUNT_RATE;
        double discountedAmount = totalAmount - discount;

        double tax = discountedAmount * TAX_RATE;
        double finalAmount = discountedAmount + tax;

        System.out.println("After discount and tax, the amount is: " + finalAmount);
    }

    public static void main(String[] args) {
        PriyaAmountComputing computation = new PriyaAmountComputing();
        computation.show();
    }
}


