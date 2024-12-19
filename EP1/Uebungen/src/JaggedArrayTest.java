public class JaggedArrayTest {

    public static void main(String[] args) {
        int n = 5;
        int[][] testArray = new int[n][];
        int counter = 0;
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new int[(int) (Math.random() * n)];
            for (int j = 0; j < testArray[i].length; j++) {
                testArray[i][j] = counter++;
            }
        }
        for (int[] line : testArray) {
            for (int number : line) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
