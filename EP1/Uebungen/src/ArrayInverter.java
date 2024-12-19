import java.util.Scanner;

public class ArrayInverter {

    public static void main(String[] arg) {
        int[] inputArray = readArray();
        System.out.print("Input: ");
        printArray(inputArray);
        invertArray(inputArray);
        System.out.print("Inverted input: ");
        printArray(inputArray);
    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int number = sc.nextInt();
        System.out.println("Elements: ");
        int[] a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    private static void printArray(int[] data) {
        for (int element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void invertArray(int[] data) {
        int tempValue;
        for (int i = 0; i < data.length / 2; i++) {
            tempValue = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tempValue;
        }
    }


}



