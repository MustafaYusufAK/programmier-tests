package javacode.Aufgabe13_Polymorphismus;

public class Sekretaerin extends Angestellter {
    private double festgehalt;

    public Sekretaerin(String name, double festgehalt) {
        super(name);
        this.festgehalt = festgehalt;
    }

    @Override
    public double getMonthlyPay() {
        return festgehalt;
    }

    public double getFestgehalt() {
        return festgehalt;
    }
}
