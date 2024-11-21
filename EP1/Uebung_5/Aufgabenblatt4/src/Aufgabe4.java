/*
    Aufgabe 4) Zweidimensionale Arrays
*/

import java.util.Arrays;

public class Aufgabe4 {

    public static int[][] generateFilled2DArray(int n) {
	
	int[][] fillArray = new int[n][n];

	if(n >= 3){
	    for(int i = 0; i < n; i = i + 1){
		int currCount = 2;
		for(int j = 0; j < n; j = j + 1){

		    int currI = i;
		    int currJ = j;

		    //Draw the -1
		    if(i / 2 - 1 == n / 2 - 1 && j / 2 - 1 == n / 2 - 1){
			for(int k = 0; k < 5; k = k + 1){
			    for(int l = 0; l < 5; l = l + 1){
				fillArray[currI / 2 - 1][currJ / 2 - 1] = - 1;
				currJ = currJ + 1;
			    }
			    currJ = currJ - 5;
			    currI = currI + 1;
			}
		    }
		    else{ //Draw Numbers
			if(i >= j){
			    fillArray[i][j] = i + 1 - j;
			}
			else{
			    fillArray[i][j] = currCount;
			    currCount = currCount + 1;
			}
		    }
					    
		    //Draw the middle Point + the last Array Entry
		    if(i / 2 == n / 2 && j / 2 == n / 2){
			fillArray[i / 2][n / 2] = 1;
			if(n != 3){
			    fillArray[i][j] = 1;
			}

		    }
		}
	    }
	}
	else{
	    fillArray[0][0] = 1;
	}
        return fillArray; //Zeile kann geändert oder entfernt werden.
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

        int[][] array = generateFilled2DArray(1);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1}}));
        System.out.println("-----");

        array = generateFilled2DArray(3);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{-1, -1, -1}, {-1, 1, -1}, {-1, -1, -1}}));
        System.out.println("-----");

        array = generateFilled2DArray(5);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1, 2, 3, 4, 5}, {2, -1, -1, -1, 4}, {3, -1, 1, -1, 3},
                {4, -1, -1, -1, 2}, {5, 4, 3, 2, 1}}));
        System.out.println("-----");

        array = generateFilled2DArray(7);
        printArray(array);
        assert (Arrays.deepEquals(array, new int[][]{{1, 2, 3, 4, 5, 6, 7}, {2, 1, 2, 3, 4, 5, 6}, {3, 2, -1, -1, -1, 4, 5},
                {4, 3, -1, 1, -1, 3, 4}, {5, 4, -1, -1, -1, 2, 3}, {6, 5, 4, 3, 2, 1, 2}, {7, 6, 5, 4, 3, 2, 1}}));
        System.out.println("-----");
        System.out.println();
    }
}
