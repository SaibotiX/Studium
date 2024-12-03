/*
    Aufgabe 2) Eindimensionale Arrays
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        short[] randomNumbers = new short[]{3, 6, 24, 31, 35, 44, 67, 73, 89, 92};

        printArray(randomNumbers, ';');
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe

        char[] randomChars = new char[]{'a', '8', '8', 'G', '2', ':', ':', ':', 'F', '7', 'b', 'b', '-', 'T'};

        char[] newRandomChars;

        int countSameChar = 0;

        for (int i = 0; i < randomChars.length; i = i + 1) {

            if (i != 0) {
                if (randomChars[i - 1] == randomChars[i]) {
                    countSameChar = countSameChar + 1;
                }
            }
        }

        newRandomChars = new char[randomChars.length + countSameChar];

        for (int i = 0, j = 0; i < newRandomChars.length; i = i + 1, j = j + 1) {
            if (i > 0 && j < randomChars.length) {
                if (newRandomChars[i - 1] == randomChars[j]) {
                    newRandomChars[i] = '+';
                    newRandomChars[i + 1] = randomChars[j];
                    i = i + 1;
                } else {
                    newRandomChars[i] = randomChars[j];
                }
            } else {
                newRandomChars[i] = randomChars[j];
            }

        }

        printArray(newRandomChars);

        int[] numbersDescending = new int[20];

        for (int i = 0; i < numbersDescending.length; i = i + 1) {
            numbersDescending[i] = 19 - i;
        }

        printArray(numbersDescending, '!');
    }

    public static void printArray(short[] randomNumbersArray, char seperateChar) {
        System.out.print("|");
        for (int i = 0; i < randomNumbersArray.length - 1; i = i + 1) {
            System.out.print(randomNumbersArray[i] + "" + seperateChar);
        }
        System.out.println(randomNumbersArray[randomNumbersArray.length - 1] + "|");
    }

    public static void printArray(char[] randomNumbersArray) {
        for (int i = 0; i < randomNumbersArray.length; i = i + 1) {
            System.out.print(randomNumbersArray[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] randomNumbersArray, char seperateChar) {
        System.out.print("for-Schleife: ");
        for (int i = randomNumbersArray.length - 2; i >= 0; i = i - 1) {
            System.out.print(randomNumbersArray[i] + "" + seperateChar);
        }
        System.out.print(randomNumbersArray[0]);
        System.out.println();

        int lengthArray = randomNumbersArray.length - 1;
        System.out.print("while-Schleife: ");
        while (lengthArray > 0) {
            System.out.print(randomNumbersArray[lengthArray] + "!");
            lengthArray = lengthArray - 1;
        }
        System.out.println(randomNumbersArray[0]);
    }
}