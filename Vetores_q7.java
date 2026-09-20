package vetores;

import java.util.Scanner;

public class Vetores_q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v1 = new int[20];
        int[] v2 = new int[20];
        int[] v3 = new int[40];

        for (int i = 0; i < 20; i++) {
            v1[i] = s.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            v2[i] = s.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 20; i++) {
            v3[j] = v1[i];
            j++;
            v3[j] = v2[i];
            j++;
        }

        for (int i = 0; i < 40; i++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
    }
}
