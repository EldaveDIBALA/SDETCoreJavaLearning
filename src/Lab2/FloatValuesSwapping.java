package Lab2;

public class FloatValuesSwapping {

	public static void main(String[] args) {
		// TODO : Write a program where to swap values of two float variables.
		
		float firstValue = 2.5f;
		float secondValue = 5.2f;
		
		System.out.println("First value and second value are respectively: "+
		firstValue+" and "+secondValue+", before permutation.");
		
		float temp = secondValue;
		secondValue = firstValue;
		firstValue = temp;
		
		System.out.print("First value and second value are respectively: "+
				firstValue+" and "+secondValue+", after permutation.");
	}

}
