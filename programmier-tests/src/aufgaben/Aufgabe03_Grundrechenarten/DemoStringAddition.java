package aufgaben.Aufgabe03_Grundrechenarten;

import java.util.Scanner;

public class DemoStringAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die erste Eingabe ein: ");
        String eingabe1 = scanner.nextLine();

        System.out.print("Gib die zweite Eingabe ein: ");
        String eingabe2 = scanner.nextLine();

        String ergebnis = eingabe1 + eingabe2;

        System.out.println("Das Ergebnis (String + String): " + ergebnis);
        scanner.close();
    }
}
