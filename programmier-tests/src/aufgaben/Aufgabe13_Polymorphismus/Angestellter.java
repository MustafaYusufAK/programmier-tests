package aufgaben.Aufgabe13_Polymorphismus;

public abstract class Angestellter {
    protected String name;

    public Angestellter(String name) {
        this.name = name;
    }

    public abstract double getMonthlyPay();

    public double getYearlyPay() {
        return getMonthlyPay() * 12;
    }

    public String getName() {
        return name;
    }
}
