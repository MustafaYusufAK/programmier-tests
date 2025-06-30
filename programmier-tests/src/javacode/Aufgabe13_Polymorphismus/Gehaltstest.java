package javacode.Aufgabe13_Polymorphismus;

public class Gehaltstest {
    public static void main(String[] args) {
        Angestellter[] angestellte = new Angestellter[] {
                new Sekretaerin("Susi Sekretärin", 2500),
                new Verkaeufer("Victor Verkäufer", 2000, 800),
                new Manager("Max Manager", 4000, true, true, false),
                new Manager("Mara Managerin", 4200, false, false, true)
        };

        System.out.println("Gehälter Übersicht:\n");

        for (Angestellter a : angestellte) {
            System.out.printf("%s:\n", a.getName());
            System.out.printf("  Monatlich: %.2f €\n", a.getMonthlyPay());
            System.out.printf("  Jährlich:  %.2f €\n\n", a.getYearlyPay());
        }
    }
}
