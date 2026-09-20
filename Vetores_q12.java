package vetores;

import java.util.Scanner;

public class Vetores_q12 {

    public static boolean existeEm(int valor, int[] v, int tam) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == valor) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[10];
        int tam = 0;

        while (tam < 10) {
            System.out.print("Digite um número: ");
            int num = s.nextInt();

            if (existeEm(num, v, tam)) {
                System.out.println("Número já digitado, tente outro.");
            } else {
                v[tam] = num;
                tam++;
            }
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
