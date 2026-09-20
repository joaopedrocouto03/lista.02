package vetores;

import java.util.Scanner;

public class Vetores_q6 {

    public static double calculaMediaIdade(int[] idades) {
        double soma = 0;
        for (int i = 0; i < idades.length; i++) {
            soma = soma + idades[i];
        }
        return soma / idades.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < 20; i++) {
            nomes[i] = s.next();
            idades[i] = s.nextInt();
        }

        double media = calculaMediaIdade(idades);
        System.out.println("Idade média: " + media);

        System.out.println("Pessoas com idade acima da média:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
