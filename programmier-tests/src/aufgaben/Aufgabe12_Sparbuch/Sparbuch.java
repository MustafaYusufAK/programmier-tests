package aufgaben.Aufgabe12_Sparbuch;

import java.util.Scanner;

public class Sparbuch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Startbetrag in €: ");
        double betrag = scanner.nextDouble();

        System.out.print("Zinssatz in %: ");
        double zinssatz = scanner.nextDouble();

        double faktor = (100.0 + zinssatz) / 100.0;

        System.out.println("\nEntwicklung über 10 Jahre:\n");

        for (int jahr = 1; jahr <= 10; jahr++) {
            betrag *= faktor;
            System.out.printf("Jahr %2d: %.2f €\n", jahr, betrag);
        }

        scanner.close();
    }
}
