//package Lab1;
//
//public class ArrayApplication {
//
//    public static void main(String[] args) {
//        // Déclaration et initialisation du tableau
//        int[] SiD = new int[5]; // Tableau de taille 5
//
//        // Initialisation des valeurs
//        SiD[0] = 10;
//        SiD[1] = 20;
//        SiD[2] = 30;
//        SiD[3] = 40;
//        SiD[4] = 50;
//
//        // Affichage des valeurs du tableau
//        System.out.println("Les valeurs du tableau sont :");
//        for (int value : SiD) {
//            System.out.println(value);
//        }
//    }
//}

//package Lab1;
//
//public class ArrayApplication {
//
//    public static void main(String[] args) {
//        // Déclaration et initialisation du tableau en une seule étape
//        int[] SiD = {10, 20, 30, 40, 50};
//
//        // Affichage des valeurs du tableau
//        System.out.println("Les valeurs du tableau sont :");
//        for (int value : SiD) {
//            System.out.println(value);
//        }
//    }
//}

package CourseApplication;

public class ArrayApplication {

    public static void main(String[] args) {
        // Déclare et initialise un tableau d'entiers de 10 à 50 (10, 20, ..., 50)
        int[] SiD = {10, 20, 30, 40, 50};

        // Calculer la somme des éléments du tableau
        int sum = 0;
        for (int value : SiD) {
            sum += value;
        }

        // Afficher la somme des éléments
        System.out.println("La somme des valeurs du tableau est : " + sum);
        System.out.print("Les valeurs du tableau sont :");
        for (int value : SiD) {
          System.out.print(value+ " ");
        }
    }
}
 