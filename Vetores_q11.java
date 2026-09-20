package vetores;

import java.util.Scanner;

public class Vetores_q11 {

    public static double calculaMedia(int[] v) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        return soma / v.length;
    }

    public static double somatorio(int[] v, double media) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + Math.pow(v[i] - media, 2);
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = s.nextInt();
        }

        double media = calculaMedia(v);
        double soma = somatorio(v, media);
        double desvioPadrao = Math.sqrt(soma / (v.length - 1));

        System.out.println("Desvio padrão: " + desvioPadrao);
    }
}
