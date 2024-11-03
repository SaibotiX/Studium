/*
    Aufgabe 4) Password - Entropieberechnung
*/

import java.util.Random;

public class Aufgabe4 {

    public static void main(String[] args) {

        int passwordLength = 20;
        String characterSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int seed = 0;
        Random myRand = new Random(seed);

        String password = "";

	for(int i = 0; i < passwordLength; i = i + 1){
	    int rand = myRand.nextInt(characterSet.length());
	    char currChar = characterSet.charAt(rand);
	    password = password + "" + currChar;
	}

	System.out.println(password);

	double Entropy = calculateEntropy(password);

	System.out.printf("Entropy of the password is %f -> the password is: ", Entropy);
	
	if(Entropy < 60){
	    System.out.println("weak");
	}
	else if(Entropy < 120){
	    System.out.println("strong");
	}
	else{
	    System.out.println("very Strong");
	}
    }

    private static double calculateEntropy(String password) {
	int stringLength = password.length();

	boolean upperCase = false;
	boolean lowerCase = false;
	boolean numbers = false;
	
	boolean numbersOnly = false;
	boolean onlyUpperOrLowerCase = false;
	boolean numbersAndUpperXORLowerCase = false;
	boolean onlyUpperAndLowerCase = false;
	boolean noNumbersAndLowerAndUpperCase = false;
	boolean numbersAndLowerAndUpperCase = false;

	int N = 0;
	
	for(int i = 0; i < password.length(); i = i + 1){
	    char c = password.charAt(i);

	    if(Character.isUpperCase(c)){
		upperCase = true;
	    }
	    else if(Character.isLowerCase(c)){
		lowerCase = true;
	    }
	    else if(Character.isDigit(c)){
		numbers = true;
	    }
	}

	if(numbers && !upperCase && !lowerCase){
	    numbersOnly = true;
	}
	else if(!numbers && !upperCase && lowerCase || !numbers && upperCase && !lowerCase){
	    onlyUpperOrLowerCase = true;
	}
	else if(numbers && upperCase && !lowerCase || numbers && !upperCase && lowerCase){
	    numbersAndUpperXORLowerCase = true;
	}
	else if(!numbers && upperCase && lowerCase){
	    noNumbersAndLowerAndUpperCase = true;
	}
	else if(numbers && upperCase && lowerCase){
	    numbersAndLowerAndUpperCase = true;
	}


	if(numbersOnly){
	    N = 10;
	}
	if(onlyUpperOrLowerCase){
	    N = 26;
	}
	if(numbersAndUpperXORLowerCase){
	    N = 36;
	}
	if(noNumbersAndLowerAndUpperCase){
	    N = 52;
	}
	if(numbersAndLowerAndUpperCase){
	    N = 62;
	}

	double entropy = stringLength * (Math.log10(N)/Math.log10(2));
        return entropy; //Zeile kann geändert oder entfernt werden.
    }
}
