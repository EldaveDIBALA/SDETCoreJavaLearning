package Lab2;

// TODO Define a class and create its objects, define its 
// attributes, constructors and member functions

public class MyCar {
	
	// Attributes of the class
	private String brand;
	private String model;
	private int year;
	private double price;
	
	// Default constructor
	public MyCar() {
		// Attributes initialization with default values
		this.brand = "Any brand";
		this.model = "Any model";
		this.year = 2024;
		this.price = 331800.0;
	}
	
	// Parameterized constructor
	public MyCar(String brand, String model, int year, double price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	// Print MyCar infos
	public void myCarInfos() {
		System.out.println("I bought a "+model+" "+brand+" car.");
		System.out.println("When I went to the dealership to by a recent model, I've "
				+ "been advised to take a "+year+ " version for "+price+" Dhs.");
	}

	public static void main(String[] args) {
		MyCar firstcar = new MyCar();
		firstcar.myCarInfos();
		
		MyCar secondcar = new MyCar("Honda", "HR-V", 2024, 351800.0);
		secondcar.myCarInfos();
	}

}
