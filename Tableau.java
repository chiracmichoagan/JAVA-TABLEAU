import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Tableau {
    public static  void main(String[] args) {
//  EXERCICE 1
        int[] nombre = {5, 2, 9, 1, 5, 6};
        Arrays.sort(nombre); // Trier le tableau en ordre croissant


    for (int i = 0 ; i < nombre.length; i++){
        System.out.println(nombre[i] + " ");

         // Afficher le tableau trié en utilisant Arrays.toString()
        // System.out.println(Arrays.toString(nombre));
    }

    //  EXERCICE 2
int [] tabEntier = {1, 2, 3, 4, 5, 6};
for (int i = 0 ; i < tabEntier.length; i++){
  if (tabEntier[i] % 2 == 0 ) {

      System.out.println(tabEntier[i] + " ");
  }
 }

//  EXERCICE 3
        int[] tableau = {3, 5, 7, 2, 8};

        // Vérifier que le tableau n'est pas vide
        if (tableau.length == 0) {
            System.out.println("Le tableau est vide.");
            return;
        }

        // Initialiser les variables max et min avec le premier élément du tableau
        int max = tableau[0];
        int min = tableau[0];

        // Parcourir le tableau pour trouver le maximum et le minimum
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }

        // Afficher les résultats
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        //EXERCICE 3

          // Créer un tableau d'entiers triés
        int[] tableau1 = {1, 3, 5, 7, 9};

        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre à rechercher : ");
        int nombreRecherche = scanner.nextInt();

        // Utiliser Arrays.binarySearch() pour rechercher le nombre dans le tableau
        int index = Arrays.binarySearch(tableau, nombreRecherche);

        // Afficher le résultat de la recherche
        if (index >= 0) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("L'élément n'est pas présent dans le tableau.");
        }

        // Fermer le scanner
        scanner.close();

        // EXERCICE 

         // Créer un tableau d'entiers avec des doublons
        int[] tableauAvecDoublons = {1, 2, 2, 3, 4, 4, 5};

        // Convertir le tableau en un Set pour éliminer les doublons
        Set<Integer> setSansDoublons = new LinkedHashSet<>();
        for (int i : tableauAvecDoublons) {
            setSansDoublons.add(i);
        }

        // Convertir le Set en un tableau
        int[] tableauSansDoublons = setSansDoublons.stream().mapToInt(Integer::intValue).toArray();

        // Afficher le tableau sans doublons
        System.out.println(Arrays.toString(tableauSansDoublons));
    }


}