package aufgaben.Aufgabe06_DreieckUndTannenbaum;

import java.util.Scanner;

public class DreieckUndTannenbaum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Höhe des Dreiecks ein: ");
        int hoehe = scanner.nextInt();

        System.out.println("\nTeil 1: Gleichschenkliges Dreieck\n");
        for (int i = 0; i < hoehe; i++) {

            for (int j = 0; j < hoehe - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("\nGib die Höhe des Tannenbaums ein: ");
        int tannenhoehe = scanner.nextInt();

        System.out.println("\nTeil 2: Tannenbaum\n");
        for (int i = 0; i < tannenhoehe; i++) {

            for (int j = 0; j < tannenhoehe - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < tannenhoehe - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        scanner.close();
    }
}
