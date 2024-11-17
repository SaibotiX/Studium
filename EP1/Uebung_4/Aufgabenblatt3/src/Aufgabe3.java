/*
    Aufgabe 3) Rekursion
*/
public class Aufgabe3 {

    private static void printOddNumbersAscending(int start, int end) {
	if(start == end){
	    if(start % 2 == 1){
		System.out.println(start);
	    }
	}
	else{
	    if(start % 2 == 1){
		System.out.println(start);
	    }

	    printOddNumbersAscending(start + 1, end);
	}
    }

    private static void printEvenNumbersDescending(int end) {
	if(end == 0){
	    if(end % 2 == 0){
		System.out.println(0);
	    }
	}
	else{
	    
	    if(end % 2 == 0){
		System.out.println(end);
	    }

	    printEvenNumbersDescending(end - 1);
	}

        //TODO: Implementieren Sie hier Ihre Lösung für die Methode
    }

    private static int countCharChanges(String text) {
	int length = text.length();
	int count = 0;
	int sum = 0;
	
	if(count == length - 1){
	    return 0;
	}
	else{
	    sum = countCharChanges(text.substring(1));

	    if(text.charAt(0) != text.charAt(1)){
		return sum + 1;
	    }
	}
	
        //TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return sum; //Zeile kann geändert oder entfernt werden.
    }

    public static void main(String[] args) {
        printOddNumbersAscending(5, 14);
        System.out.println();
        printEvenNumbersDescending(11);
        System.out.println();

        System.out.println(countCharChanges("A"));
        System.out.println(countCharChanges("AA"));
        System.out.println(countCharChanges("abBc"));
        System.out.println(countCharChanges("XYYYZZAAAB"));
        System.out.println(countCharChanges("satt"));
        System.out.println(countCharChanges("Schifffahrt"));
    }
}
