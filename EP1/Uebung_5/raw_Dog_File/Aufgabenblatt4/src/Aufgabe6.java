/*
    Aufgabe 6) Zweidimensionale Arrays
*/

import java.util.Arrays;

public class Aufgabe6 {

    private static int[][] generateReformattedArray(int[][] inputArray) {
        int entryCount = 0;
        int[][] resultArray = new int[inputArray.length][];

        int resultArrayLength = 0;

        //New length of Array
        for (int i = 0; i < inputArray.length; i = i + 1) {
            for (int j = 0; j < inputArray[i].length; j = j + 1) {
                if (inputArray[i][j] != 0 && j % 2 == 0) {
                    resultArrayLength = resultArrayLength + inputArray[i][j];
                }
            }

            resultArray[i] = new int[resultArrayLength];
            resultArrayLength = 0;
        }

        for (int i = 0; i < inputArray.length; i = i + 1) {
            for (int j = 0; j < inputArray[i].length; j = j + 1) {
                if (inputArray[i][j] != 0 && j % 2 == 0) {
                    int nTimes = inputArray[i][j];
                    for (int k = 0; k < nTimes; k = k + 1) {
                        resultArray[i][entryCount] = inputArray[i][j + 1];
                        entryCount = entryCount + 1;
                    }
                }
            }
            entryCount = 0;
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

        int[][] array2 = new int[][]{{1, 1, 1, 0, 2, 1}, {1, 0, 2, 1}, {1, 0, 1, 1, 1, 0, 2, 1},
                {3, 0, 1, 1, 1, 0}, {1, 1, 1, 0}, {5, 1}};
        System.out.println("Before:");
        printArray(array2);
        int[][] array2res = generateReformattedArray(array2);
        System.out.println("-----");
        System.out.println("After:");
        printArray(array2res);
        assert (Arrays.deepEquals(array2res, new int[][]{{1, 0, 1, 1}, {0, 1, 1}, {0, 1, 0, 1, 1}, {0, 0, 0, 1, 0}, {1, 0}, {1, 1, 1, 1, 1}}));
        System.out.println("-----");


        System.out.println();
        array2 = new int[][]{{1, 1, 1, 0, 2, 1, 4, 0}, {1, 0, 5, 1, 2, 0}, {6, 0, 2, 1},
                {1, 1, 7, 0}, {4, 0, 2, 1, 1, 0, 1, 1}, {8, 0}, {7, 0, 1, 1}};
        System.out.println("Before:");
        printArray(array2);
        array2res = generateReformattedArray(array2);
        System.out.println("-----");
        System.out.println("After:");
        printArray(array2res);
        assert (Arrays.deepEquals(array2res, new int[][]{{1, 0, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1}, {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1}}));
        System.out.println("-----");


        System.out.println();
        array2 = new int[][]{{1, 0}, {1, 1}, {2, 0}, {1, 0, 1, 1}, {1, 1, 1, 0}, {2, 1}};
        System.out.println("Before:");
        printArray(array2);
        array2res = generateReformattedArray(array2);
        System.out.println("-----");
        System.out.println("After:");
        printArray(array2res);
        assert (Arrays.deepEquals(array2res, new int[][]{{0}, {1}, {0, 0}, {0, 1}, {1, 0}, {1, 1}}));
        System.out.println("-----");


        System.out.println();
        array2 = new int[][]{{12, 0}};
        System.out.println("Before:");
        printArray(array2);
        array2res = generateReformattedArray(array2);
        System.out.println("-----");
        System.out.println("After:");
        printArray(array2res);
        assert (Arrays.deepEquals(array2res, new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}));
        System.out.println("-----");

    }
}
