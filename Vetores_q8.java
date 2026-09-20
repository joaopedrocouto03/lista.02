package vetores;

import java.util.Scanner;

public class Vetores_q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] resultado = new int[10];

        for (int i = 0; i < 10; i++) {
            v1[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            v2[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                resultado[i] = v1[i];
            } else {
                resultado[i] = v2[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
}
