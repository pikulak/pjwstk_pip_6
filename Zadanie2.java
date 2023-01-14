import java.util.Scanner;

public class Zadanie2 {
    // Utwórz metodę, która pobiera tablicę liczb całkowitych
    // i zwraca jej posortowaną kopię.
    // NIE UŻYWAJ bibliotek sortujących tablice, stwórz własną implementację.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tablicę liczb całkowitych: ");
        String[] tab = scanner.nextLine().split(" ");
        int[] tabInt = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tabInt[i] = Integer.parseInt(tab[i]);
        }
        int[] sortedTab = sortArray(tabInt);
        printArray(sortedTab);
    }
    public static int[] generateArray(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
        return tab;
    }
    public static void printArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public static int[] sortArray(int[] tab) {
        int[] sortedTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            sortedTab[i] = tab[i];
        }
        for (int i = 0; i < sortedTab.length; i++) {
            for (int j = 0; j < sortedTab.length - 1; j++) {
                if (sortedTab[j] > sortedTab[j + 1]) {
                    int temp = sortedTab[j];
                    sortedTab[j] = sortedTab[j + 1];
                    sortedTab[j + 1] = temp;
                }
            }
        }
        return sortedTab;
    }
}