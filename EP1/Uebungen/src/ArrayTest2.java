public class ArrayTest2 {

    public static void main(String[] args) {
        int n = 10;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < n / 2 ; i++) {
            int temp = data[i];
            data[i] = data[n - i - 1];
            data[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
    }

}
