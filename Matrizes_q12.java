package matrizes;

import java.util.Scanner;

// Obs: o enunciado menciona "uma terceira matriz 3 x 3" para o resultado da soma/subtração,
// mas como as duas matrizes de entrada são 2x2, a matriz resultado também é implementada como 2x2.
public class Matrizes_q12 {

    public static double[][] somar(double[][] a, double[][] b) {
        double[][] r = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        return r;
    }

    public static double[][] subtrair(double[][] a, double[][] b) {
        double[][] r = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                r[i][j] = b[i][j] - a[i][j];
            }
        }
        return r;
    }

    public static void somarConstante(double[][] m, double c) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = m[i][j] + c;
            }
        }
    }

    public static void imprime(double[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];

        System.out.println("Digite a matriz 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = s.nextDouble();
            }
        }

        System.out.println("Digite a matriz 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = s.nextDouble();
            }
        }

        System.out.println("Escolha uma opção: a) somar  b) subtrair  c) somar constante  d) imprimir");
        String opcao = s.next();

        if (opcao.equals("a")) {
            double[][] r = somar(m1, m2);
            System.out.println("Resultado da soma:");
            imprime(r);
        } else if (opcao.equals("b")) {
            double[][] r = subtrair(m1, m2);
            System.out.println("Resultado da subtração (m2 - m1):");
            imprime(r);
        } else if (opcao.equals("c")) {
            System.out.print("Digite a constante: ");
            double c = s.nextDouble();
            somarConstante(m1, c);
            somarConstante(m2, c);
            System.out.println("Matrizes após somar constante:");
            imprime(m1);
            imprime(m2);
        } else if (opcao.equals("d")) {
            System.out.println("Matriz 1:");
            imprime(m1);
            System.out.println("Matriz 2:");
            imprime(m2);
        }
    }
}
