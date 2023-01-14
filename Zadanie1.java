import java.util.Scanner;

public class Zadanie1 {
    // Utwórz metodę, która pobiera liczbę całkowitą n,
    // tworzy tablicę typów całkowitych z n elementami,
    // definiuje ją za pomocą losowych liczb całkowitych
    // od 0 do 100 i zwraca wygenerowaną tablicę.
    // Następnie utwórz metodę, która jako parametr pobiera
    // tablicę liczb całkowitych i wyświetla ją w konsoli
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą n: ");
        int n = scanner.nextInt();
        int[] tab = generateArray(n);
        printArray(tab);
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
}