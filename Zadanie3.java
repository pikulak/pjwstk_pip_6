
public class Zadanie3 {
    // Utwórz metodę, która jako parametr otrzymuje tablicę
    // liczb całkowitych i zwraca jej kopię w odwrotnej kolejności.
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int[] reversedTab = reverseArray(tab);
        printArray(reversedTab);
    }

    public static void printArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] reverseArray(int[] tab) {
        int[] reversedTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            reversedTab[i] = tab[tab.length - 1 - i];
        }
        return reversedTab;
    }
}