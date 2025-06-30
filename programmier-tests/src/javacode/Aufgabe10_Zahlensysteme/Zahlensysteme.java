package javacode.Aufgabe10_Zahlensysteme;

import java.util.Scanner;

public class Zahlensysteme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nMenü: Z)eichen, O)ktal, heX), E)nde? ");
            String eingabe = scanner.nextLine().trim().toUpperCase();

            switch (eingabe) {
                case "Z":
                    System.out.print("Gib ein einzelnes Zeichen ein: ");
                    char zeichen = scanner.nextLine().charAt(0);
                    int ascii = (int) zeichen;
                    System.out.println("Dezimal: " + ascii);
                    System.out.println("Binär:   " + Integer.toBinaryString(ascii));
                    break;

                case "O":
                    System.out.print("Gib eine Oktalzahl ein (z.B. 17): ");
                    String oktal = scanner.nextLine().trim();
                    try {
                        int dezOktal = Integer.parseInt(oktal, 8);
                        System.out.println("Dezimal: " + dezOktal);
                        System.out.println("Binär:   " + Integer.toBinaryString(dezOktal));
                    } catch (NumberFormatException e) {
                        System.out.println("Ungültige Oktalzahl.");
                    }
                    break;

                case "X":
                    System.out.print("Gib eine Hexadezimalzahl ein (z.B. 1A): ");
                    String hex = scanner.nextLine().trim();
                    try {
                        int dezHex = Integer.parseInt(hex, 16);
                        System.out.println("Dezimal: " + dezHex);
                        System.out.println("Binär:   " + Integer.toBinaryString(dezHex));
                    } catch (NumberFormatException e) {
                        System.out.println("Ungültige Hexadezimalzahl.");
                    }
                    break;

                case "E":
                    System.out.println("Programm wird beendet.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ungültige Eingabe. Bitte Z, O, X oder E eingeben.");
            }
        }
    }
}
