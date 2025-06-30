package aufgaben.Aufgabe03_Grundrechenarten;

import java.util.Scanner;

public class Grundrechenarten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Gib die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        System.out.print("Welche Rechenart möchtest du verwenden? (+, -, *, /): ");
        String operator = scanner.next();

        double ergebnis;

        switch (operator) {
            case "+":
                ergebnis = addieren(zahl1, zahl2);
                break;
            case "-":
                ergebnis = subtrahieren(zahl1, zahl2);
                break;
            case "*":
                ergebnis = multiplizieren(zahl1, zahl2);
                break;
            case "/":
                ergebnis = dividieren(zahl1, zahl2);
                break;
            default:
                System.out.println("Ungültiger Operator!");
                scanner.close();
                return;
        }

        System.out.println("Ergebnis: " + ergebnis);
        scanner.close();
    }

    public static double addieren(double a, double b) {
        return a + b;
    }

    public static double subtrahieren(double a, double b) {
        return a - b;
    }

    public static double multiplizieren(double a, double b) {
        return a * b;
    }

    public static double dividieren(double a, double b) {
        if (b == 0) {
            System.out.println("Fehler: Division durch 0 nicht erlaubt!");
            return 0;
        }
        return a / b;
    }
}
