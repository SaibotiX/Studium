/*
  Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in 1-2 Sätzen was der Spaghetticode macht
    /*
      Der Spagetti Code macht mithilfe von zwei Haupt for Schleifen, welche wiederum aus mehreren neben for schleifen besteht das gewünschte Ergebnis.
    */

    //TODO zu Punkt b): Beschreiben Sie in 1-2 Sätzen was Sie ändern würden und warum
    /*
      Ich würde eine Einheitliche Formatierung des Codes machen, damit sie leichter leserlich wird.
    */

    public static void main(String args[]) {
        int width = 50;
        //********************************************************
        //TODO zu Punkt c,d und e): Implementieren Sie hier Ihre Lösung für die Angabe
        System.out.println("Ihre Ausgabe:");

        //********************************************************

        System.out.println("\nAusgabe Spaghetticode:");

        firstLastLine(width);

        drawFirstHalf(width);

        drawMiddleLine(width);

        drawSecondHalf(width);

        firstLastLine(width);
    }

    public static void drawMiddleLine(int width) {
        System.out.print("#|");
        for (int i = 2; i < width * 2 - 2; i = i + 1) {
            System.out.print(" ");
        }
        System.out.println("|#");
    }

    public static void firstLastLine(int width) {
        System.out.print("#");

        for (int i = 1; i <= width * 2 - 2; i++) {
            System.out.print("+");
        }
        System.out.println("#");
    }

    public static void drawFirstHalf(int width) {
        for (int i = 1; i < width; i++) {

            System.out.print("#");

            for (int j = 2; j <= (width - 1 - i + 1); j++) {
                System.out.print(".");
            }

            System.out.print("/");

            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }

            System.out.print("\\");

            for (int j = 2; j <= (width - 1 - i + 1); j++) {
                System.out.print(".");
            }

            System.out.print("#");
            System.out.println();
        }
    }

    public static void drawSecondHalf(int width) {
        for (int i = 1; i < width; i++) {
            System.out.print("#");

            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }

            System.out.print("\\");

            for (int j = 1; j <= (width * 2 - 2 - 2 * i); j++) {
                System.out.print(" ");
            }

            System.out.print("/");

            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }

            System.out.print("#");
            System.out.println();
        }
    }
}

