/*
  Aufgabe 1) Zweidimensionale Arrays
*/

import java.util.Arrays;

public class Aufgabe1 {
    
    public static void shiftLines(int[][] workArray) {
	int currentLine = 0;
	int switchWith = 0;

	int arrLength = workArray.length;
	int currSmallest = workArray[0].length;

	boolean allSameLength = true;
	
	for(int i = 0; i < arrLength; i = i + 1){
	    if(workArray[i].length < currSmallest){
		currSmallest = workArray[i].length;
		switchWith = i;
	    }

	    if(i < arrLength - 1){
		if(workArray[i].length != workArray[i + 1].length){
		    allSameLength = false;
		}
	    }
	}

	if(!allSameLength){
	    int[] arrTemp = workArray[currentLine];

	    workArray[currentLine] = new int[currSmallest];
	    workArray[currentLine] = workArray[switchWith];
	    workArray[switchWith] = arrTemp;
	    currentLine = currentLine + 1;
	}
	else{
	    int[] tmp = new int[workArray[0].length];
	    tmp = workArray[0];
	    
	    for(int i = 0; i < arrLength - 1; i = i + 1){
		workArray[i] = workArray[i + 1];
	    }

	    workArray[arrLength - 1] = tmp;
	}
    }


    //Vorgegebene Methode - BITTE NICHT VERÄNDERN!
    private static void printArray(int[][] inputArray) {
        if (inputArray != null) {
            for (int i = 0; i < inputArray.length; i++) {
                for (int j
			 = 0; j < inputArray[i].length; j++) {
                    System.out.print(inputArray[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Test shiftLines:");
        System.out.println("-----");
        int[][] array1 = new int[][]{{1, 5, 6, 7}, {1, 9, 6}, {4, 3}, {6, 3, 0, 6, 9}, {6, 4, 3}};
        System.out.println("Before:");
        printArray(array1);
        shiftLines(array1);
        assert (Arrays.deepEquals(array1, new int[][]{{4, 3}, {1, 9, 6}, {1, 5, 6, 7}, {6, 3, 0, 6, 9}, {6, 4, 3}}));
        System.out.println("-----");
        System.out.println("After:");
        printArray(array1);
        System.out.println("-----");

        array1 = new int[][]{{3, 2, 4, 1}, {7, 3, 6}, {4}, {5, 6, 2, 4}, {9, 1}, {3}};
        System.out.println("Before:");
        printArray(array1);
        shiftLines(array1);
        assert (Arrays.deepEquals(array1, new int[][]{{4}, {7, 3, 6}, {3, 2, 4, 1}, {5, 6, 2, 4}, {9, 1}, {3}}));
        System.out.println("-----");
        System.out.println("After:");
        printArray(array1);
        System.out.println("-----");

        array1 = new int[][]{{3, 4, 1}, {6, 2, 5}, {9, 7, 8}};
        System.out.println("Before:");
        printArray(array1);
        shiftLines(array1);
        assert (Arrays.deepEquals(array1, new int[][]{{6, 2, 5}, {9, 7, 8}, {3, 4, 1}}));
        System.out.println("-----");
        System.out.println("After:");
        printArray(array1);
        System.out.println("-----");
    }
}

