
public class Zadanie4 {
    // Utwórz metodę w Javie, która pobiera 2 tablice liczb całkowitych
    // jako parametry i sprawdza,czy druga tablica jest
    // odwrotnością pierwszej. Jeśli tak, metoda zwraca true, w przeciwnymrazie zwraca false.
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {5, 4, 3, 2, 1};
        System.out.println(isReversed(tab1, tab2));
    }

    public static boolean isReversed(int[] tab1, int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[tab2.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}