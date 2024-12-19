public class Aray2DCharPattern {

    public static void main(String[] args) {
        int n = 11;
        char[][] array = new char[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int distance = (Math.abs(n / 2 - i) + Math.abs(n / 2 - j));
                if (distance < n / 4) {
                    array[i][j] = ' ';
                } else if (distance < n / 2) {
                    array[i][j] = '.';
                } else {
                    array[i][j] = '#';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
