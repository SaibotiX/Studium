/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {
    private static void addChar(String text, char character) {
        if (text.length() == 1) {
            System.out.println(text);
        } else if (text.length() >= 2) {
            int length = text.length();
            int count = 0;

            String returnString = "";
            boolean drawCharTwiceOrOnce = true;

            while (count + 1 != length) {

                if (drawCharTwiceOrOnce) {
                    returnString = returnString + text.charAt(count) + character + character;
                    drawCharTwiceOrOnce = false;
                } else {
                    returnString = returnString + text.charAt(count) + character;
                    drawCharTwiceOrOnce = true;
                }

                count = count + 1;
            }

            System.out.println(returnString + text.charAt(count));
        }
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(int number, char character) {
        String stringInt = Integer.toString(number);

        addChar(stringInt, character);
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(String text, String characters) {
        int length = characters.length();

        for (int i = 0; i < length; i = i + 1) {
            addChar(text, characters.charAt(i));
        }
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void addChar(String text) {
        addChar(text, '=');
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    public static void main(String[] args) {
        String text0 = "";
        String text1 = "A";
        String text2 = "CW";
        String text3 = "EP1";
        String text4 = "Index";

        addChar(text0, '&');
        addChar(text1, '+');
        addChar(text2, '*');
        addChar(text3, '-');
        addChar(text4, '#');
        System.out.println();

        addChar(1, '.');
        addChar(42, ':');
        addChar(148, '$');
        addChar(2048, ')');
        addChar(131719, '%');
        System.out.println();

        addChar(text2, "!O(");
        addChar(text4, "T1#+");
        System.out.println();

        addChar(text1);
        addChar(text2);
        addChar(text3);
    }
}
