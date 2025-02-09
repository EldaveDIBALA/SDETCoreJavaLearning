package PolymorphismApplication;

/////////////////////////Linked to Method 3/////////////////////////
import java.util.HashMap;
import java.util.Map;
////////////////////////////////////////////////////////////////////

/////////////////////////Method 1///////////////////////////////////
public class AmazonPayment {
//
//    public void payment(String paymentMethod) {
//        if (paymentMethod.equalsIgnoreCase("PayPal") || 
//            paymentMethod.equalsIgnoreCase("Payoneer") || 
//            paymentMethod.equalsIgnoreCase("Carte de Crédit")) {
//            System.out.println("Votre mode de paiement est : " + paymentMethod);
//        } else {
//            System.out.println("Mode de paiement non valide. Veuillez choisir entre PayPal, Payoneer ou Carte de Crédit.");
//        }
//    }
//
//    public static void main(String[] args) {
//        AmazonPayment payment = new AmazonPayment();
//
//        payment.payment("PayPal");
//        payment.payment("Payoneer");
//        payment.payment("Carte de Crédit");
//        payment.payment("Bitcoin");
//    }
// Applying polymorphism with overloading method.
//////////////////////////////////////////////////////////////////////////
	
/////////////////////////***Method 2***///////////////////////////////////	
//	public void payment(String paypal) {
//		System.out.println("Your payment gateway is: PayPal");
//	}
//	
//    public void payment(int payoneer) {
//        System.out.println("Your payment gateway is: Payoneer");
//    }
//    
//    public void payment(double creditCard) {
//        System.out.println("Your payment gateway is: Credit Card");
//    }
////////////////////////////////////////////////////////////////////
	
/////////////////////////Method 3///////////////////////////////////
    private static Map<Class<?>, String> paymentMethods = new HashMap<>();
    
    static {
        paymentMethods.put(String.class, "Your payment gateway is: PayPal");
        paymentMethods.put(Integer.class, "Your payment gateway is: Payoneer");
        paymentMethods.put(Double.class, "Your payment gateway is: Credit Card");
    }

    public void payment(Object method) {
        String message = paymentMethods.getOrDefault(method.getClass(), "Invalid payment method");
        System.out.println(message);
    }
    
	public static void main(String[] args) {
		  AmazonPayment payment = new AmazonPayment();
		
		  payment.payment("String data type");
		  payment.payment(123);
		  payment.payment(21.21);
		  payment.payment("Paypal");
		}
	    
//	public void payment()
}