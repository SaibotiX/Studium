/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/
//package Aufgabenblatt1.src;
//import codedraw.CodeDraw;
//import codedraw.Palette;

public class Aufgabe3 {

    public static void main(String[] args) {
	double dt = 1;
	double maxCap = 1500;
	double numFoxes = 2;
	double numRabbits = 2500;
	int iterations = 500;
	
	for(int i = 0; i <= iterations; i = i + 1){
	    double freeCap = maxCap - numRabbits;
	    double incRabbits = (1.0 / maxCap) * freeCap * 0.08 * numRabbits;
	    double decFoxes = 0.2 * numFoxes;
	    double numContacts = numRabbits * numFoxes;
	    numRabbits = numRabbits + dt * (incRabbits - 0.002 * numContacts);
	    numFoxes = numFoxes + dt * (0.0004 * numContacts - decFoxes);
	    
	    // maxAnimal ... 500 Symbols (100%)
	    // currAnimal ... x Symbols (x%)
	    // normally 500/maxAnimal*curranimals would be the way to go, but 500/2500*numRabbits the program gets to small numbers so it cant compute the right number
	    double symbolRabbits = Math.round(numRabbits/(2500/500));
	    double symbolFoxes = Math.round((500/200)*numFoxes);

	    System.out.format("Iteration: %d freeCap: %.2f numRabbits: %.2f numFoxes: %.2f\n", i, freeCap, numRabbits,numFoxes);
	    for(int j = 0; j <= symbolRabbits; j = j + 1){
		System.out.format("*");
	    }
	    System.out.println();
	    for(int j = 0; j <= symbolFoxes; j = j + 1){
		System.out.format("#");
	    }
	    System.out.println("\n");
			       
	}

    }
}
