class AufgabeTestt{
    public static void main(String[] args){
	int[][] Arr = new int[][]{{4,3,1,2}, {7, 3, 6}, {3, 2, 4, 1}, {5}, {9, 1}, {3}};

	printArray(Arr);

	switchArr(Arr);
	printArray(Arr);
	switchArr(Arr);
	printArray(Arr);
    }

    public static void switchArr(int[][] test){
		int currentLine = 0;
	int switchWith = 0;

	int arrLength = test.length;
	int currSmallest = test[0].length;
	
	for(int i = 0; i < arrLength; i = i + 1){
	    if(test[i].length < currSmallest){
		currSmallest = test[i].length;
		switchWith = i;
	    }
	}

	int[] arrTemp = test[currentLine];

	test[currentLine] = new int[currSmallest];
	test[currentLine] = test[switchWith];
	test[switchWith] = arrTemp;
    }

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

}
