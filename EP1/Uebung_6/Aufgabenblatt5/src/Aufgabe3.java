/*
    Aufgabe 3) Zweidimensionale Arrays
*/

import java.util.Random;

public class Aufgabe3 {

    public static boolean[][] genAnimalCompound(int compoundSize, float probability) {

        Random myRand = new Random(5); // Diese Zeile nicht verändern!

	boolean[][] result = new boolean[compoundSize][compoundSize];

	for(int i = 0; i < compoundSize; i = i + 1){
	    for(int j = 0; j < compoundSize; j = j + 1){
		double randFloat = myRand.nextFloat(1);

		if(randFloat <= probability){
		    result[i][j] = true;
		}
	    }
	}

        // TODO: Implementieren Sie hier Ihre Lösung für die Methode

        return result; //Zeile kann geändert oder entfernt werden.
    }

    public static int[][] calcAnimalDensity(boolean[][] animalCompound) {
	int arrLength = animalCompound.length;
	int[][] result = new int[arrLength][arrLength];
	int[][] outOfBound = new int[arrLength + 2][arrLength + 2];
	int outArrLength = outOfBound.length;
	
	boolean checkBoolean = true;

	if(arrLength == 1){
	    checkBoolean = animalCompound[0][0];

	    if(checkBoolean){
		result[0][0] += 1;
	    }
	}
	else{
	    for(int i = 0; i < arrLength; i = i + 1){
		for(int j = 0; j < arrLength; j = j + 1){
		    checkBoolean = animalCompound[i][j];
		
		    if(i == 0 && j == 0 && checkBoolean){
			outOfBound[0][0] += 1;
			outOfBound[0][1] += 1;
			outOfBound[0][2] += 1;
			outOfBound[1][0] += 1;
			outOfBound[2][0] += 1;
		    
			/*----------------*/

			for(int k = 0; k < 2; k = k + 1){
			    for(int l = 0; l < 2; l = l + 1){
				result[k][l] += 1;
			    }
			}
		    }
		    else if(i == 0 && j == arrLength - 1 && checkBoolean){
			outOfBound[0][outArrLength - 3] += 1;
			outOfBound[0][outArrLength - 2] += 1;
			outOfBound[0][outArrLength - 1] += 1;
			outOfBound[1][outArrLength - 1] += 1;
			outOfBound[2][outArrLength - 1] += 1;

			/*---------------*/
		    
			for(int k = 0; k < 2; k = k + 1){
			    for(int l = 0; l < 2; l = l + 1){
				result[k][j - l] += 1;
			    }
			}

		    }
		    else if(i == arrLength - 1 && j == 0 && checkBoolean){
			outOfBound[outArrLength - 3][0] += 1;
			outOfBound[outArrLength - 2][0] += 1;
			outOfBound[outArrLength - 1][0] += 1;
			outOfBound[outArrLength - 1][1] += 1;
			outOfBound[outArrLength - 1][2] += 1;

			/*---------------*/

			for(int k = 0; k < 2; k = k + 1){
			    for(int l = 0; l < 2; l = l + 1){
				result[i - k][l] += 1;
			    }
			}
		    }
		    else if(i == arrLength - 1 && j == arrLength - 1 && checkBoolean){
			outOfBound[outArrLength - 1][outArrLength - 3] += 1;
			outOfBound[outArrLength - 1][outArrLength - 2] += 1;
			outOfBound[outArrLength - 1][outArrLength - 1] += 1;
			outOfBound[outArrLength - 2][outArrLength - 1] += 1;
			outOfBound[outArrLength - 3][outArrLength - 1] += 1;

			/*----------------*/

			for(int k = 0; k < 2; k = k + 1){
			    for(int l = 0; l < 2; l = l + 1){
				result[i - k][j - l] += 1;
			    }
			}

		    }
		    else if(i == 0 && checkBoolean){
			for(int k = 0; k < 3; k = k + 1){
			    outOfBound[0][j + k] += 1;
			}

			for(int k = -1; k < 2; k = k + 1){
			    result[0][j + k] += 1;
			    result[1][j + k] += 1;
			}
		    }
		    else if(j == 0 && checkBoolean){
			for(int k = 0; k < 3; k = k + 1){
			    outOfBound[i + k][0] += 1;
			}

			for(int k = -1; k < 2; k = k + 1){
			    result[i + k][0] += 1;
			    result[i + k][1] += 1;
			}
		    }
		    else if(i == arrLength - 1 && checkBoolean){
			for(int k = 0; k < 3; k = k + 1){
			    outOfBound[outArrLength - 1][j + k] += 1;
			}

			for(int k = -1; k < 2; k = k + 1){
			    result[arrLength - 1][j + k] += 1;
			    result[arrLength - 2][j + k] += 1;
			}
		    }
		    else if(j == arrLength - 1 && checkBoolean){
			for(int k = 0; k < 3; k = k + 1){
			    outOfBound[i + k][outArrLength - 1] += 1;
			}

			for(int k = -1; k < 2; k = k + 1){
			    result[i + k][arrLength - 1] += 1;
			    result[i + k][arrLength - 2] += 1;
			}
		    }
		    else{
			if(checkBoolean){
			    for(int k = -1; k < 2; k = k + 1){
				for(int l = -1; l < 2; l = l + 1){
				    result[i + k][j + l] += 1;
				}
			    }
			}
		    }
		}
	    }
	}
	
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return result; //Zeile kann geändert oder entfernt werden.
    }

    // helping method for printing the apple field
    private static void printCompound(boolean[][] animalCompound) {
        for (int y = 0; y < animalCompound.length; y++) {
            for (int x = 0; x < animalCompound[y].length; x++) {
                if (animalCompound[y][x]) {
                    System.out.print("* ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    // helping method for printing the number of apples
    private static void printDensity(int[][] animalCompound) {
        for (int y = 0; y < animalCompound.length; y++) {
            for (int x = 0; x < animalCompound[y].length; x++) {
                System.out.print(animalCompound[y][x] + " "); //"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // variables
        int compoundSize = 1;
        float probability = 0.8f;
        boolean[][] animalCompound = genAnimalCompound(compoundSize, probability);
        printCompound(animalCompound);
        System.out.println();
        int[][] animalDensity = calcAnimalDensity(animalCompound);
        printDensity(animalDensity);
    }
}
