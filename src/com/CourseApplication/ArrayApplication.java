package com.CourseApplication;

public class ArrayApplication {
//    public static void main(String[] args) {
//        int[] SiD = new int[5]; // Array of size 5.

//        SiD[0] = 10;
//        SiD[1] = 20;
//        SiD[2] = 30;
//        SiD[3] = 40;
//        SiD[4] = 50;

//        System.out.println("Les valeurs du tableau sont :");
//        for (int value : SiD) {
//            System.out.println(value);
//        }
//    }
//}
//    public static void main(String[] args) {
//        int[] SiD = {10, 20, 30, 40, 50};

//        System.out.println("Les valeurs du tableau sont :");
//        for (int value : SiD) {
//            System.out.println(value);
//        }
//    }
//}

    public static void main(String[] args) {
        int[] SiD = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int value : SiD) {
            sum += value;
        }
        
        int totalArraySize = SiD.length;

        System.out.println("Sum is equal to : " + sum);
        
        System.out.println("----------------------------");
        System.out.println("Average is equal to : "+ (sum/totalArraySize));
        
        System.out.println("----------------------------");
        System.out.print("Array is formed with :");
        for (int value : SiD) {
          System.out.print(value+ " ");
        }
    }
}
 