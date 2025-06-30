package aufgaben.Aufgabe13_Polymorphismus;

public class Manager extends Angestellter {
    private double grundgehalt;
    private boolean istGeschaeftsfuehrer;
    private boolean fuehrtMehrAls12;
    private boolean mehrAls10Jahre;

    public Manager(String name, double grundgehalt,
            boolean istGeschaeftsfuehrer,
            boolean fuehrtMehrAls12,
            boolean mehrAls10Jahre) {
        super(name);
        this.grundgehalt = grundgehalt;
        this.istGeschaeftsfuehrer = istGeschaeftsfuehrer;
        this.fuehrtMehrAls12 = fuehrtMehrAls12;
        this.mehrAls10Jahre = mehrAls10Jahre;
    }

    @Override
    public double getMonthlyPay() {
        double zulage = 0;
        if (istGeschaeftsfuehrer)
            zulage += 500;
        if (fuehrtMehrAls12)
            zulage += 300;
        if (mehrAls10Jahre)
            zulage += 200;
        return grundgehalt + zulage;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }
}
