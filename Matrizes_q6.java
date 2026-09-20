package matrizes;

public class Matrizes_q6 {
    public static void main(String[] args) {
        int[][] m = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    m[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    m[i][j] = 3 * i * i - 1;
                } else {
                    m[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
