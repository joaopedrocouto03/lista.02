package matrizes;

import java.util.Scanner;

public class Matrizes_q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = s.nextInt();
            }
        }

        int[] somaColunas = new int[3];
        for (int j = 0; j < 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += m[i][j];
            }
            somaColunas[j] = soma;
        }

        for (int j = 0; j < 3; j++) {
            System.out.print(somaColunas[j] + " ");
        }
        System.out.println();
    }
}
