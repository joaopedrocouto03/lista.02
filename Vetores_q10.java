package vetores;

import java.util.Scanner;

public class Vetores_q10 {

    public static int[] soma(int[] x, int[] y) {
        int[] r = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            r[i] = x[i] + y[i];
        }
        return r;
    }

    public static int[] produto(int[] x, int[] y) {
        int[] r = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            r[i] = x[i] * y[i];
        }
        return r;
    }

    public static boolean existeEm(int valor, int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) return true;
        }
        return false;
    }

    public static int[] diferenca(int[] x, int[] y) {
        int[] temp = new int[x.length];
        int tam = 0;
        for (int i = 0; i < x.length; i++) {
            if (!existeEm(x[i], y)) {
                temp[tam] = x[i];
                tam++;
            }
        }
        int[] r = new int[tam];
        for (int i = 0; i < tam; i++) {
            r[i] = temp[i];
        }
        return r;
    }

    public static int[] intersecao(int[] x, int[] y) {
        int[] temp = new int[x.length];
        int tam = 0;
        for (int i = 0; i < x.length; i++) {
            if (existeEm(x[i], y)) {
                temp[tam] = x[i];
                tam++;
            }
        }
        int[] r = new int[tam];
        for (int i = 0; i < tam; i++) {
            r[i] = temp[i];
        }
        return r;
    }

    public static int[] uniao(int[] x, int[] y) {
        int[] temp = new int[x.length + y.length];
        int tam = 0;
        for (int i = 0; i < x.length; i++) {
            temp[tam] = x[i];
            tam++;
        }
        for (int i = 0; i < y.length; i++) {
            if (!existeEm(y[i], x)) {
                temp[tam] = y[i];
                tam++;
            }
        }
        int[] r = new int[tam];
        for (int i = 0; i < tam; i++) {
            r[i] = temp[i];
        }
        return r;
    }

    public static void imprime(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        for (int i = 0; i < 5; i++) {
            x[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            y[i] = s.nextInt();
        }

        System.out.println("Soma:");
        imprime(soma(x, y));

        System.out.println("Produto:");
        imprime(produto(x, y));

        System.out.println("Diferença:");
        imprime(diferenca(x, y));

        System.out.println("Interseção:");
        imprime(intersecao(x, y));

        System.out.println("União:");
        imprime(uniao(x, y));
    }
}
