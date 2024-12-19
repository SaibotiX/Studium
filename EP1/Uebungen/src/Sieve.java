import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert upper bound: ");
        int n = sc.nextInt();

        //Initialization
        boolean[] isPrime = new boolean[n + 1];
        System.out.println("....");
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Marking
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        // Counting prime numbers
        int number = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                number++;
            }
        }

        System.out.println("Number of primes <= " + n + " is " + number);
    }
}
