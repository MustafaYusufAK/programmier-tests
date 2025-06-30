package aufgaben.Aufgabe02_EingabeBegruessung;

import java.util.Scanner;

public class EingabeBegruessung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie heißt du? ");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name + "!");
        scanner.close();
    }
}
