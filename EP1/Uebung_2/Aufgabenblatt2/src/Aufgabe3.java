/*
    Aufgabe 3) Schleifen und Methoden - Harshad-Zahlen
*/
public class Aufgabe3 {

    private static boolean isHarshadNumber(int number) {
	int methodNumber = number;
	int result = 0;
	
	if(methodNumber > 0){
	    while(methodNumber > 0){
		int modulNumber = methodNumber % 10;
		result = result + modulNumber;
		methodNumber = methodNumber / 10;
	    }

	    if(number % result == 0){
		return true;
	    }
	}
        return false; //Zeile kann geändert oder entfernt werden.
    }

    private static void printHarshadNumbersInInterval(int start, int end) {
	int currResult = 0;
	int currIteration = 0;
	
	if(start > 0 && end > 0 && start <= end){
	    for(int i = start; i <= end; i = i + 1){
		currIteration = i;
		int currHarshadNumber = i;
		if(isHarshadNumber(i)){
		    System.out.print(i + " ");
		}
	    }
	}
	System.out.println();
    }

    public static void main(String[] args) {
	int CheckHarshadNumber = 172986;

	System.out.println(isHarshadNumber(CheckHarshadNumber));

	int start = 51;
	int end = 79;

	printHarshadNumbersInInterval(start, end);
    }
}

        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE isHarshadNumber(...).
//        System.out.println("1 --> " + isHarshadNumber(1));
//        assert (isHarshadNumber(1));
//        System.out.println("4 --> " + isHarshadNumber(4));
//        assert (isHarshadNumber(4));
//        System.out.println("13 --> " + isHarshadNumber(13));
//        assert (!isHarshadNumber(13));
//        System.out.println("97 --> " + isHarshadNumber(97));
//        assert (!isHarshadNumber(97));
//        System.out.println("777 --> " + isHarshadNumber(777));
//        assert (isHarshadNumber(777));
//        System.out.println("8316 --> " + isHarshadNumber(8316));
//        assert (isHarshadNumber(8316));
//        System.out.println("9214 --> " + isHarshadNumber(9214));
//        assert (!isHarshadNumber(9214));
//        System.out.println("172986 --> " + isHarshadNumber(172986));
//        assert (isHarshadNumber(172986));
//        //**********************************************************************

        //TODO: Testen Sie hier alle Methoden mit verschiedenen Inputs!
