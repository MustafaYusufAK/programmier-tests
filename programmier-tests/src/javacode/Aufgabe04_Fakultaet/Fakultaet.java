package javacode.Aufgabe04_Fakultaet;

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein, für die du die Fakultät berechnen möchtest: ");
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            System.out.println("Fehler: Fakultät ist nur für nicht-negative Zahlen definiert.");
            scanner.close();
            return;
        }

        long ergebnis = berechneFakultaet(zahl);
        System.out.println(zahl + "! = " + ergebnis);
        scanner.close();
    }

    public static long berechneFakultaet(int n) {
        long fakultaet = 1;
        for (int i = 2; i <= n; i++) {
            fakultaet *= i;
        }
        return fakultaet;
    }
}
