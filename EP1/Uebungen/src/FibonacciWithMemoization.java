public class FibonacciWithMemoization {

    private static final long[] f = new long[93];

    // 1 <= n <= 92
    private static long fastFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else if (f[n] == 0) {
            f[n] = fastFibonacci(n - 1) + fastFibonacci(n - 2);
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fastFibonacci(50));
        System.out.println(fastFibonacci(90));
        System.out.println(fastFibonacci(80));
    }

}
