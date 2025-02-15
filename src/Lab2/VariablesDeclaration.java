package Lab2;

public class VariablesDeclaration {
	int number = 11;
	static String type = "Data";
	
	public static void main(String[] args) {
		// TODO A program where 3 different types of variables are declared, a 
		// member function and value of each printed
		
		VariablesDeclaration obj = new VariablesDeclaration();
		System.out.println("Value of my instance variable number is: "+obj.number);
		
		double count = 10.10;
		System.out.println("Value of my local variable count is: "+count);
		System.out.println("Value : "+type+", is associated with static variable");
	}
}
