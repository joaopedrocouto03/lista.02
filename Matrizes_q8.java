package matrizes;

import java.util.Random;

public class Matrizes_q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] m = new int[4][4];
        int[][] triangular = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = rand.nextInt(20) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    triangular[i][j] = 0;
                } else {
                    triangular[i][j] = m[i][j];
                }
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz triangular inferior:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(triangular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
