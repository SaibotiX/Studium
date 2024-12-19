import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] x = {3, 5, 2, 7, 9, 4, 6, 1, 8};
        boolean[] y = new boolean[3], z = new boolean[3];
        Arrays.sort(x);
        // java.util.Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.binarySearch(x, 9));
        Arrays.fill(y, true);
        Arrays.fill(z, true);
        System.out.println(Arrays.toString(y));
        System.out.println((y == z));
        System.out.println(Arrays.equals(y, z));
        y = z;
        System.out.println(y == z);
    }

}
