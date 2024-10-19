/*
    Aufgabe 1) for-Schleifen
*/
public class Aufgabe1 {

    public static void main(String[] args) {

	//Aufgabe a)
	int sum = 0;
	for(int i = 21; i <420;i = i + 1){
	    if(i % 21 == 0){
		sum = sum + i;
	    }
	}
	System.out.println(sum);

	//Aufgabe b)
	for(int i = 45; i <= 135; i = i + 1){
	    if(i % 5 == 0 && i % 9 != 0){
		System.out.print(":" + i);
	    }
	}
	System.out.println(":");

	//Aufgabe C)
	for(int i = 70; i > 50; i = i - 1){
	    char asciiCode = (char) i;

	    /*Darf man bei so einen fall break benutzen also:

	     ...
	     if(i == 51){
	     ...
	     break;
	    }
	    System.out.print(asciiCode + ",");
	    ...

	    */
	    if(i == 51){
		System.out.print(asciiCode);
	    }
	    else {
		System.out.print(asciiCode + ",");
	    }
	}
	System.out.println();

	String countZ = "Zehn zahme Ziegen zogen ziemlich zügig zehn Zentner Zucker zum Zoo!";
	int wordCount = 11;
	int zCount = 0;

	for(int i = 0; i < wordCount; i = i + 1){
	    zCount = zCount + 1;
	}
	System.out.println(zCount);
    }
}
