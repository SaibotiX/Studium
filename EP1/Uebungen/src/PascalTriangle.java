import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = sc.nextInt();
        int[][] p = new int[n][];
        for (int i = 0; i < p.length; i++) {
            p[i] = new int[i + 1];
            for (int j = 0; j < p[i].length; j++) {
                if ((j == 0) || (j == i)) {
                    p[i][j] = 1;
                } else {
                    p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
                }
                System.out.printf("%4d ", p[i][j]);
            }
            System.out.println();
        }
    }

}
