package vetores;

import java.util.Scanner;

public class Vetores_q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[20];

        for (int i = 0; i < 20; i++) {
            v[i] = s.nextInt();
        }

        System.out.println("Elementos com conteúdo ímpar:");
        for (int i = 0; i < 20; i++) {
            if (v[i] % 2 != 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Elementos das posições pares:");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
}
