/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void printArray(int[] workArray) {
        for (int i = workArray.length - 1; i >= 0; i--) {
            System.out.print(workArray[i] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] filledArray) {
        int number = 3;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = number;
            number += 3;
        }
    }

    private static void printContentFilteredArray(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 9 == 0) {
                copiedArray[i] = -1;
            }
        }
        printArray(copiedArray);
    }

    private static void fillArrayWithNewContent(int[] workArray) {
        int[] helpArray = new int[15];
        int number = 4;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = number;
            number += 4;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        fillArray(filledArray);
        printArray(filledArray);

        printContentFilteredArray(filledArray);
        printArray(filledArray);

        filledArray[0] = 123;
        printArray(filledArray);

        fillArrayWithNewContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Antwort zu Punkt a:
    //Es kommt zu einem Fehler da einerseits die gesamte Länge durchieriert werden möchte, was bei einem Array dazu führt dass man in einem Bereich kommt der nicht definiert ist und zusätzlich noch beim Print das i minus 1 gerechnet wird, was wenn i = 0 ist zu i = -1 führt was ebenfalls nicht definiert ist.
    //Antwort zu Punkt b:
    //Es benötigt keinen Rückgabe wert, da die Referenz des Arrays verändert wird. Diese Referenz ist die selbe wie außerhalb der Methode und somit diese Verändert.
    //Antwort zu Punkt c:
    //Der Grund dafür ist, dass in Methoden Array Argumente sich auf die selbe Referenz beziehen wie außerhalb der Methode und somit auch die änderungen außerhalb der Methode sichtbar sind
    //
    //Antwort zu Punkt d:
    //Wenn man in einer Methode ein Array, welches man als Argument der Methode übergibt und dann Versucht die Referenz des alten Arrays auf ein neues Referenziert, kann man innerhalb mit der neuen Referenz Arbeiten, falls man aber dann dieses neue Array mittels eines return statements nicht zurückgibt, ändert sich die Referenz des Arrays auserhalb der Methode nicht auf die neue Referenz.
    //

    /*
      Zusatzfragen: 
      1) Byte, Int, Long
      2) Man muss ein neues Array anlegen mit der gewünschten größe und dann die Werte des Alten Arrays in das neue Array kopieren.
      3) Das kann mittels for Schleife geschehen oder man ruft die Array methode .clone() auf welche dann in das neue Int Array die werte des originalen arrays mit einer neuen Referenz speichert
      4)Nein, es ist nicht sinvoll Arrays mit == zu Vergleichen, da man nur Ihre Referenzen, also den Speicherplatz vergleicht, auf welchen die Arrays hinzeigen. Höchstens man möchte diesen Speicherplatz vergleichen hat es keinen nutzen.
}
