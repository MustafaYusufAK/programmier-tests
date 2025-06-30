package javacode.Aufgabe13_Polymorphismus;

public class Verkaeufer extends Angestellter {
    private double grundgehalt;
    private double provision;

    public Verkaeufer(String name, double grundgehalt, double provision) {
        super(name);
        this.grundgehalt = grundgehalt;
        this.provision = provision;
    }

    @Override
    public double getMonthlyPay() {
        return grundgehalt + provision;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public double getProvision() {
        return provision;
    }
}
