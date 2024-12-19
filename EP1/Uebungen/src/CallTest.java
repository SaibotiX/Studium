public class CallTest {

    private static void test(int[] a) {
        int[] x = new int[3];
        a[1] = 3;
        a = x;
    }

    public static void main(String[] args) {
        int[] t = {5, 6, 7};
        System.out.println(t[1]);
        test(t);
        System.out.println(t[1]);
    }

}
