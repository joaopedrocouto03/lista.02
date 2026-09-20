package vetores;

import java.util.Scanner;

public class Vetores_q13 {

    public static long combinacao(int n, int k) {
        long resultado = 1;
        for (int i = 0; i < k; i++) {
            resultado = resultado * (n - i) / (i + 1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int linha = 0; linha < n; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(combinacao(linha, coluna) + " ");
            }
            System.out.println();
        }
    }
}
