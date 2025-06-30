package aufgaben.Aufgabe07_PascalschesDreieck;

import java.util.Scanner;

public class PascalschesDreieck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Anzahl der Zeilen für das Pascalsche Dreieck ein: ");
        int zeilen = scanner.nextInt();

        System.out.println("\nPascalsches Dreieck mit " + zeilen + " Zeilen:\n");

        for (int i = 0; i < zeilen; i++) {
            for (int k = 0; k < zeilen - i; k++) {
                System.out.print(" ");
            }

            int wert = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", wert);
                wert = wert * (i - j) / (j + 1);
            }

            System.out.println();
        }

        scanner.close();
    }
}
