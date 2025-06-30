package aufgaben.Aufgabe04_Fakultaet;

import java.util.Scanner;

public class FakultaetRekursiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein: ");
        int zahl = scanner.nextInt();

        if (zahl < 0) {
            System.out.println("Fehler: Fakultät nur für n ≥ 0 definiert.");
            scanner.close();
            return;
        }

        System.out.println(zahl + "! = " + fakultaet(zahl));
        scanner.close();
    }

    public static long fakultaet(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fakultaet(n - 1);
    }
}
