public class MatrixMultiply {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {3, 2, 1},
                {1, 0, 2}
        };
        int[][] b = new int[][]{
                {1, 2},
                {0, 1},
                {4, 0},
        };
        /*int[][] c = multiply(a, b);
        for (int[] i : c) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }*/

        int[][] c = safeMultiply(a, b);
        if (c != null) {
            for (int[] i : c) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error: multiply did not work!");
        }

    }


    private static int[][] multiply(int[][] first, int[][] second) {
        int m = first.length;
        int n = second[0].length;
        int p = second.length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }

    // Multiply matrix first with matrix second.
    // Return new array, or null if first or second are inappropriate.
    private static int[][] safeMultiply(int[][] first, int[][] second) {
        if (first == null || second == null || first.length == 0 ||
                second.length == 0 || first[0] == null || second[0] == null ||
                first[0].length != second.length) {
            return null;
        }
        int m = first.length;
        int n = second[0].length;
        int p = second.length;
        int[][] result = new int[m][n];
        for (int[] ints : second) {
            if (ints == null || ints.length != n) {
                return null;
            }
        }
        for (int i = 0; i < m; i++) {
            if (first[i] == null || first[i].length != p) {
                return null;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }


}
