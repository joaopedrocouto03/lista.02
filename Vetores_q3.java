package vetores;

import java.util.Scanner;

public class Vetores_q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (v[i] % 2 == 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
}
