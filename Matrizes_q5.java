package matrizes;

import java.util.Scanner;

public class Matrizes_q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = s.nextInt();
            }
        }

        int x = s.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    System.out.println("Encontrado na linha " + i + ", coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado");
        }
    }
}
