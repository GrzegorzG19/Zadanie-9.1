import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("wpisz rozmiar tablicy");
        a = scan.nextInt();
        int[] tab = new int[a];
        int b = 0;
        int c = tab.length;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (int i = 0; i < (2 * tab.length); i++) {
            if (i < tab.length) {
                System.out.print(tab[i] + " ");
            }

            if (i >= (tab.length - b) && i < (tab.length * 2)) {
                b++;

                System.out.print(tab[c-1] + " ");
                c--;
            }
        }


    }


}
