/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {

    public static void main(String[] args) {
	String text = "Eine nennenswerte und geeignete Sprache.";
	String text2 = "Anzahl der Zeichen ist nicht genug!";
	String tmp;

	tmp = text;
	text = text2;
	    
	System.out.println(text);

	text = tmp;
	tmp = text2;

	text2 = text;
	System.out.println(text2);

	text2 = tmp;

	System.out.println(text + " " + text2);

	//Aufgabe 2

	boolean running = true;
	int iteration = 0;
	while(running){
	    char currChar = text.charAt(iteration);

	    switch(currChar){
	    case 'a':
		System.out.print('-');
		break;
		
	    case 'e':
		System.out.print('-');
		break;
		
	    case 'i':
		System.out.print('-');
		break;
		
	    case 'o':
		System.out.print('-');
		break;
		
	    case 'u':
		System.out.print('-');
		break;
	    case 'A':
		System.out.print('-');
		break;
		
	    case 'E':
		System.out.print('-');
		break;
		
	    case 'I':
		System.out.print('-');
		break;
		
	    case 'O':
		System.out.print('-');
		break;
		
	    case 'U':
		System.out.print('-');
		break;
		
	    }

	    System.out.print(currChar);

	    iteration = iteration + 1;

	    if(iteration == text.length()){
		running = false;
	    }
	}
	System.out.println();


	running = true;
	iteration = 0;
	char lowCharBeginning = 'k';
	char upperCaseBeginning = 'K';
	char upperCaseEnd = '`';
	char space = ' ';
	String newText = "";
	while(running){
	    if((upperCaseBeginning <= text.charAt(iteration) && text.charAt(iteration) < 'a') || lowCharBeginning <= text.charAt(iteration) || text.charAt(iteration) <= '@'){
		if(text.charAt(iteration) == space){
		    iteration = iteration + 1;
		    continue;
		}
		    char curr = text.charAt(iteration);
		    newText = newText + curr;
	    }
	    iteration = iteration + 1;

	    if(iteration == text.length()){
		running = false;
	    }
	}
	System.out.println(newText);

	int startInt = 35;
	boolean insertWhiteSpace = false;
	while(startInt < 175){
	    if(startInt % 5 == 0 && startInt % 7 == 0){

		//Kein Unnötiges Leerzeichen am Schluss durch diese if Anweisung
		if(insertWhiteSpace == true){
		    System.out.print(" ");
		}
		System.out.print(startInt);
		insertWhiteSpace = true;
	    }
	    startInt = startInt + 1;
	}
	System.out.println();
    }
}






