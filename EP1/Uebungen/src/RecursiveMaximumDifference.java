import java.util.Arrays;

public class RecursiveMaximumDifference {

    // array != null, array.length > 1, 0 <= i < array.length
    private static int findMaxDiff(int[] array, int i) {
        if (i > 0) {
            int diff = findMaxDiff(array, i - 1);
            int localDiff = Math.abs(array[i - 1] - array[i]);
            return Math.max(localDiff, diff);
        }
        return 0;
    }

    // array != null
    private static int findMaxDiff(int[] array) {
        if (array.length > 1) {
            int localDiff = Math.abs(array[0] - array[1]);
            int diff = findMaxDiff(Arrays.copyOfRange(array, 1, array.length));
            return Math.max(localDiff, diff);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 1, 8, 2, 4, 0, 9};
        System.out.println(findMaxDiff(arr, arr.length - 1));
        System.out.println(findMaxDiff(arr, arr.length / 2));
        System.out.println(findMaxDiff(arr, arr.length / 4));
        System.out.println(findMaxDiff(new int[]{20}, 0));
        System.out.println(findMaxDiff(arr));
    }

}
