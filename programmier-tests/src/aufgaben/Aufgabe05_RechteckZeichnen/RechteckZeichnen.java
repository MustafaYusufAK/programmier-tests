package aufgaben.Aufgabe05_RechteckZeichnen;

import java.util.Scanner;

public class RechteckZeichnen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Teil 1: Festes 5x5 Quadrat");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nTeil 2: Benutzerdefiniertes Rechteck");
        System.out.print("Gib die Höhe ein: ");
        int hoehe = scanner.nextInt();

        System.out.print("Gib die Breite ein: ");
        int breite = scanner.nextInt();

        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}