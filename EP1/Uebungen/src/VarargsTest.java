public class VarargsTest {

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum());
        print(1, 2);
        print(1);
        print(1, 2, 3, 4);
    }

    private static int sum(int... values) {
        int result = 0;
        for (int x : values) {      // with foreach-loop
            result = result + x;
        }
        return result;
    }

    private static void print(int i, int j) {
        System.out.println("Integer " + i + " " + j);
    }

    private static void print(int i, int... values) {
        System.out.print("Integer " + i + " --- ");
        System.out.print("Varargs - length: " + values.length + " values: ");
        for (int x = 0; x < values.length; x++) {   // with original for-loop
            System.out.print(values[x] + " ");
        }
        System.out.println();
    }

}
