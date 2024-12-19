import java.util.Arrays;

public class test{
    private static int x = 5;
    private static int y = 1;

    private static int calc(int n) {
	int y = x;
	return y - 2 * n;
    }
    private static String fun(String a, String b) {
	System.out.print(a.substring(y));                            // Zeile A
	return b;
    }

    public static void main(String[] args) {
	System.out.print(calc(calc(2)));                // Zeile B
	System.out.println();
	String x = "AB";
	String y = "12";
	System.out.print(fun(x, y));                    // Zeile C
	System.out.println();
	System.out.print(fun(y + x, x));                // Zeile D
    }

}
