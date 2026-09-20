package matrizes;

import java.util.Scanner;

public class Matrizes_q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }

        int n = s.nextInt();

        for (int compra = 0; compra < n; compra++) {
            int fila = s.nextInt();
            int poltrona = s.nextInt();

            if (teatro[fila - 1][poltrona - 1] == -1) {
                teatro[fila - 1][poltrona - 1] = 1;
            } else {
                System.out.println("Poltrona já foi vendida");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
