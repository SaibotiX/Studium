    /*
    Aufgabe 2) Erste Methoden
*/

import javax.sound.midi.SysexMessage;

public class Aufgabe2 {
    //TODO: Implementieren Sie hier die in der Angabe beschriebenen Methoden

    public static void main(String[] args) {
	String text = "ABCDYZ_abcdyz";

	int startIndex = 10;
	int numChar = 10;

	char character = 'c';
	int nTimes = 5;
	
	if(text != null && text.length() != 0 && numChar >= 0 && startIndex >= 0 && startIndex < text.length()){
	    printNumCharsInString(text, startIndex, numChar);
	}

	System.out.println();

	printNumbersInInterval(3,30);

	System.out.println();

	if(text != null && nTimes >= 0){
	    System.out.println(isCharNTimesInString(text, character, nTimes));
	}

	if(text != null){
	    System.out.println(changeLettersInString(text));
	}
    }
    
    public static void printNumCharsInString(String text, int startIndex, int numChar){
	int stringLength = text.length();
	for(int i = 0, j = startIndex; i < numChar; i = i + 1, j = j + 1){
	    char currentChar = text.charAt(j);
	    System.out.print(currentChar);

	    if(j == stringLength - 1){
		j = 0;
	    }
	    
	}
    }

    public static void printNumbersInInterval(int start, int end){
	for(int i = end; i >= start; i = i - 1){
	    if(i % 3 == 0){
		System.out.print(i + " ");
	    }
	}
    }

    public static boolean isCharNTimesInString(String text, char character, int nTimes){

	int count = 0;

	for(int i = 0; i < text.length(); i = i + 1){
	    if(text.charAt(i) == character){
		count = count + 1;
	    }
	}

	if(count == nTimes){
	    return true;
	}

	return false;
    }

    public static String changeLettersInString(String text){
	String returnText = "";
	
	for(int i = 0; i < text.length(); i = i + 1){
	    int currCharInt = text.charAt(i);
	    char currChar;
	    if(currCharInt >= 'b' && currCharInt <= 'z' || currCharInt >= 'B' && currCharInt <= 'Z'){
		currCharInt = currCharInt - 1;
		currChar = (char) currCharInt;
		returnText = returnText + "" + currChar;
	    }
	    else{
		currChar = (char) currCharInt;
		returnText = returnText + "" + currChar;
	    }
	}

	return returnText;


    }
}


//        assert (isCharNTimesInString("nennenswerte Worte", 'n', 4));
//        assert (!isCharNTimesInString("nennenswerte Worte", 'n', 3));
//        assert (!isCharNTimesInString("nennenswerte Worte", 'e', 6));
//        assert (isCharNTimesInString("Test", 'x', 0));
//
//        assert (changeLettersInString("Hello World!").equals("Gdkkn Vnqkc!"));
//        assert (changeLettersInString("Anfang und Ende.").equals("Ameamf tmc Dmcd."));
//        assert (changeLettersInString("+ABC_123_DEF#").equals("+AAB_123_CDE#"));
//        assert (changeLettersInString("ABCDYZ_abcdyz").equals("AABCXY_aabcxy"));
