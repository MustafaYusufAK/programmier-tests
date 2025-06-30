package javacode.Aufgabe11_Steuerrechner;

import java.util.Scanner;

public class Steuerrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bruttoFest = 100.0;
        double ustFest = 20.0;

        double steuerFest = bruttoFest * ustFest / (100 + ustFest);
        double nettoFest = bruttoFest - steuerFest;

        System.out.println("Teil 1: Fester Bruttopreis von 100 € mit 20 % USt:");
        System.out.printf("Umsatzsteuer: %.2f €\n", steuerFest);
        System.out.printf("Netto-Preis:  %.2f €\n", nettoFest);

        System.out.println("\nTeil 2: Eigene Eingaben");
        System.out.print("Gib den Bruttopreis in € ein: ");
        double brutto = scanner.nextDouble();

        System.out.print("Gib den USt.-Satz in % ein: ");
        double ust = scanner.nextDouble();

        double steuer = brutto * ust / (100 + ust);
        double netto = brutto - steuer;

        System.out.printf("\nUmsatzsteuer: %.2f €\n", steuer);
        System.out.printf("Netto-Preis:  %.2f €\n", netto);

        scanner.close();
    }
}
