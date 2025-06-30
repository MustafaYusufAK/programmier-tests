package aufgaben.Aufgabe08_ArraySortieren;

public class ArraySortieren {
    public static void main(String[] args) {
        int[] original = { 45, 52, 2, 1, 0, 98, 445, 4, 42, 65, 3, 12, 11, 20, 42 };

        System.out.println("Original-Array:");
        ausgabeArray(original);

        int[] aufsteigend = original.clone();
        bubbleSort(aufsteigend, true);
        System.out.println("\nAufsteigend sortiert:");
        ausgabeArray(aufsteigend);

        int[] absteigend = original.clone();
        bubbleSort(absteigend, false);
        System.out.println("\nAbsteigend sortiert:");
        ausgabeArray(absteigend);
    }

    public static void bubbleSort(int[] array, boolean aufsteigend) {
        int n = array.length;
        boolean getauscht;

        for (int i = 0; i < n - 1; i++) {
            getauscht = false;
            for (int j = 0; j < n - i - 1; j++) {
                boolean bedingung = aufsteigend
                        ? array[j] > array[j + 1]
                        : array[j] < array[j + 1];
                if (bedingung) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    getauscht = true;
                }
            }
            if (!getauscht)
                break;
        }
    }

    public static void ausgabeArray(int[] array) {
        for (int zahl : array) {
            System.out.print(zahl + " ");
        }
        System.out.println();
    }
}