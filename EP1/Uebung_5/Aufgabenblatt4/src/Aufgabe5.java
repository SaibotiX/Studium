/*
    Aufgabe 5) Zweidimensionale Arrays
*/

import java.util.Arrays;

public class Aufgabe5 {

    public static int[][] generateExtendedArray(int[] inputArray) {
	int firstRow = inputArray[0];
	int lastRow = inputArray[1];
	int fillWithInt = inputArray[2];

	int[][] resultArray = new int[lastRow - firstRow + 1][];

	for(int i = firstRow, j = 0; i <= lastRow; i = i + 1, j = j + 1){
	    resultArray[j] = new int[i];

	    for(int k = 0; k < resultArray[j].length; k = k + 1){
		resultArray[j][k] = fillWithInt;
		fillWithInt = fillWithInt + 1;
	    }
	}


        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return resultArray; //Zeile kann geändert oder entfernt werden.
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[][] inputArray) {
        if (inputArray != null) {
            for (int[] arr : inputArray) {
                for (int val : arr) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }
    }

    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[] inputArray) {
        if (inputArray != null) {
            for (int val : inputArray) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 10};
        int[][] array1res = generateExtendedArray(array1);
        printArray(array1res);
        assert (Arrays.deepEquals(array1res, new int[][]{{10}, {11, 12}}));
        System.out.println("-----");

        array1 = new int[]{3, 6, 8};
        array1res = generateExtendedArray(array1);
        printArray(array1res);
        assert (Arrays.deepEquals(array1res, new int[][]{{8, 9, 10}, {11, 12, 13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22, 23, 24, 25}}));
        System.out.println("-----");

        array1 = new int[]{6, 8, 4};
        array1res = generateExtendedArray(array1);
        printArray(array1res);
        assert (Arrays.deepEquals(array1res, new int[][]{{4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24}}));
        System.out.println("-----");
    }
}
