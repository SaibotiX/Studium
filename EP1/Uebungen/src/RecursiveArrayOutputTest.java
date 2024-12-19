public class RecursiveArrayOutputTest {

    // arr.length > 0 && 0 <= left < arr.length && 0 <= right < arr.length
    private static void printArrayRecursively(int[] array, int left, int right) {
        if (left <= right) {
            System.out.print(array[left] + " ");
            printArrayRecursively(array, left + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 5, 4, 2, 6, 8, 0, 7};
        printArrayRecursively(x, 0, x.length - 1);
        System.out.println();
        printArrayRecursively(x, 2, 5);
    }

}
