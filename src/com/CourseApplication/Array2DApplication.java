package com.CourseApplication;

public class Array2DApplication {

	public static void main(String[] args) {
		
	Object data[][] = {
			{"UserName", "Password"},
			{"Pooja", "test123"},
			{"Admin", "admin123"},
			{"Priyanka", "tester"},
			{"Sarang", "t123"},
			{"abhi", "test312"}
			};
	
	for (Object[] i : data)
		{
			for(Object j : i ) {
				System.out.print(j+" " );
			}				
	 		System.out.println();
		}
	
	}
	
}