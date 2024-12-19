public class ArrayTest {

    public static void main(String[] args) {
        int n = 10;
        double[] data = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            data[i] = Math.random() * 100;
        }
        for (int i = 0; i < n; i++) {
            sum += data[i];
        }
        double average = sum / n;
        for (int i = 0; i < n; i++) {
            System.out.println("Element at position " + i + ": " + data[i]);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
