package matrizes;

import java.util.Random;

public class Matrizes_q9 {

    public static boolean existeNaCartela(int valor, int[][] cartela, int linhasPreenchidas, int colunaAtual) {
        for (int i = 0; i <= linhasPreenchidas; i++) {
            int limite = (i < linhasPreenchidas) ? 5 : colunaAtual;
            for (int j = 0; j < limite; j++) {
                if (cartela[i][j] == valor) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] cartela = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;
                do {
                    numero = rand.nextInt(100);
                } while (existeNaCartela(numero, cartela, i, j));
                cartela[i][j] = numero;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + " ");
            }
            System.out.println();
        }
    }
}
