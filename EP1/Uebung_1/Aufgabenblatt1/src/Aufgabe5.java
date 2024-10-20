/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des CodeDraw-Fensters
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe5 {

    public static void main(String[] args) {
	int square = 300;
	int n = 19;
	if(n >= 5 && n <= 19 && n % 2 != 0)
	    {
		int countSquareToMiddle = ((n-1) / 2) + 1;
		double lengthSquareLine = (double) square / (double) n;
	
		CodeDraw Window = new CodeDraw(square, square);

		for(int i = 0; i <= n; i = i + 1){
		    Window.setColor(Palette.RED);
		    Window.setLineWidth(4);
		    Window.drawRectangle(lengthSquareLine * i, 0, lengthSquareLine * (i + 1), lengthSquareLine);
		}

		double xStartPos = square - (square / n);
		double yStartPos = 0;
		for(int i = 0; i < countSquareToMiddle; i = i + 1){
		    Window.setLineWidth(2);
		    Window.setColor(Palette.BLUE);
		    Window.drawRectangle(xStartPos, yStartPos, lengthSquareLine, lengthSquareLine);
		    
		    xStartPos = xStartPos - ((double)square / n);
		    yStartPos = yStartPos + ((double)square / n);
		}

		xStartPos = xStartPos + ((double)square / n);
		for(int i = 0; i < countSquareToMiddle - 1; i = i + 1){
		    Window.setLineWidth(4);
		    Window.setColor(Palette.RED);
		    Window.drawRectangle(xStartPos, yStartPos, lengthSquareLine, lengthSquareLine);

		    yStartPos = yStartPos + ((double)square / n);
		}

		yStartPos = yStartPos - ((double)square / n);
		xStartPos = xStartPos - ((double)square / n);

		Window.setLineWidth(2);
		Window.setColor(Palette.BLUE);
		Window.drawRectangle(0, square - ((double)square / n), lengthSquareLine, lengthSquareLine);
		for(int i = 0; i < countSquareToMiddle - 2; i = i + 1){
		    Window.setLineWidth(4);
		    Window.setColor(Palette.RED);
		    Window.drawRectangle(xStartPos, yStartPos, lengthSquareLine, lengthSquareLine);

		    xStartPos = xStartPos - ((double)square / n);
		}
		Window.show();
	    }
	else{
	    System.out.println("ERROR, Only numbers between [5,19] and only uneven numbers!");
	}
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }
}
