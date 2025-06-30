package aufgaben.Aufgabe09_Quadratzahlen;

public class Quadratzahlen {
    public static void main(String[] args) {
        System.out.println("Quadratzahlen von 1 bis 20:\n");

        for (int i = 1; i <= 20; i++) {
            int quadrat = i * i;
            System.out.println(i + " * " + i + " = " + quadrat);
        }
    }
}
