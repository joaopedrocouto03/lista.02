package vetores;

import java.util.Scanner;

public class Vetores_q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[15];

        for (int i = 0; i < 15; i++) {
            nomes[i] = s.next();
        }

        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
