package matrizes;

import java.util.Scanner;

public class Matrizes_q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = s.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int maior = m[0][0];
        int linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior + " na linha " + linhaMaior + ", coluna " + colunaMaior);
    }
}
