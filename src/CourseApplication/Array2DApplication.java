package CourseApplication;

public class Array2DApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] data = {{"UserName", "Password"},{"Pooja", "test123"},{"Admin", "admin123"},{"Priyanka", "tester"},{"Sarang", "t123"},{"abhi", "test312"}};

        System.out.println("Tableau des utilisateurs :");
        for (Object[] row : data) {
        	System.out.printf("%-10s | %-10s%n", row[0], row[1]);
        }	

	}

}
