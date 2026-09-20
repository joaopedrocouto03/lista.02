package vetores;

import java.util.Scanner;

public class Vetores_q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[6];

        for (int i = 0; i < 6; i++) {
            v[i] = s.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(v[i]);
        }
    }
}
