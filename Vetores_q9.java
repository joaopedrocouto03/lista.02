package vetores;

public class Vetores_q9 {

    public static boolean valido(int num) {
        if (num % 7 == 0) return false;
        if (num % 10 == 7) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] v = new int[100];
        int contador = 0;
        int num = 1;

        while (contador < 100) {
            if (valido(num)) {
                v[contador] = num;
                contador++;
            }
            num++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
