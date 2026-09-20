package matrizes;

import java.util.Scanner;

public class Matrizes_q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = s.nextInt();
            }
        }

        int somaAcima = 0, somaAbaixo = 0, somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) {
                    somaAcima += m[i][j];
                }
                if (i > j) {
                    somaAbaixo += m[i][j];
                }
                if (i == j) {
                    somaPrincipal += m[i][j];
                }
                if (i + j == 2) {
                    somaSecundaria += m[i][j];
                }
            }
        }

        System.out.println("Soma acima da diagonal principal: " + somaAcima);
        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixo);
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
    }
}
