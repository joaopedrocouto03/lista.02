package matrizes;

import java.util.Scanner;

public class Matrizes_q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = s.nextInt();
            }
        }

        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + contador);
    }
}
