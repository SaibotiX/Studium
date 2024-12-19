public class ArrayCopy {

    public static void main(String[] args) {
        int[] original = {3, 4, 5, 6, 7};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);
        for (int j : copy) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.arraycopy(original, 0, original, 2, 3);
        for (int j : original) {
            System.out.print(j + " ");
        }
    }

}
