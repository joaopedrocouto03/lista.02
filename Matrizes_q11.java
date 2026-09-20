package matrizes;

import java.util.Scanner;

public class Matrizes_q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[5][4];

        for (int i = 0; i < 5; i++) {
            m[i][0] = s.nextInt();
            m[i][1] = s.nextInt();
            m[i][2] = s.nextInt();
            m[i][3] = m[i][1] + m[i][2];
        }

        int maiorNota = m[0][3];
        int matriculaMaior = m[0][0];
        int somaNotas = 0;

        for (int i = 0; i < 5; i++) {
            somaNotas += m[i][3];
            if (m[i][3] > maiorNota) {
                maiorNota = m[i][3];
                matriculaMaior = m[i][0];
            }
        }

        System.out.println("Matrícula com maior nota final: " + matriculaMaior);
        System.out.println("Média aritmética das notas finais: " + (somaNotas / 5.0));
    }
}
