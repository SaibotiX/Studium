public class Array2DPattern {

    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        int startVal = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = startVal++;
                } else {
                    array[i][array[i].length - 1 - j] = startVal++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != 0) {
                    System.out.print("\t");
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
