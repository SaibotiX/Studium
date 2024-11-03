/*
    Aufgabe 1) Verschachtelte Schleifen - Optische Täuschung
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe1 {

    public static void main(String[] args) {
	double windowSideLength = 400f;
	CodeDraw Window = new CodeDraw((int)windowSideLength, (int)windowSideLength);
	
	double squareRadius = (float) 1/60 * windowSideLength;
	double circleX = squareRadius * 2;
	double circleY = squareRadius * 2;

	double circleXPosition = circleX;
	double circleYPosition = circleY;
	

	for(int i = 0; i < 15; i = i + 1){
	    for(int j = 0; j < 15; j = j + 1){
		Window.setLineWidth(1);
		Window.setColor(Palette.BLACK);
		Window.fillCircle(circleXPosition, circleYPosition ,squareRadius);

		Window.setColor(Palette.GRAY);
		Window.setLineWidth(3);
		Window.drawCircle(circleXPosition, circleYPosition, squareRadius);
		circleXPosition = circleXPosition + squareRadius * 4;
	    }
	    circleXPosition = circleX;
	    circleYPosition = circleYPosition + squareRadius * 4;
	}

	double squarePosition = 0.25 * windowSideLength + squareRadius;
	Window.setColor(Palette.WHITE);
	Window.fillSquare(squarePosition, squarePosition, 0.5 * windowSideLength - squareRadius * 2);

	Window.setColor(Palette.BLACK);
	Window.setLineWidth(1);
	Window.drawSquare(squarePosition, squarePosition, 0.5 * windowSideLength - squareRadius * 2);

	double lengthSquare = (0.5 * windowSideLength - squareRadius * 2) - squarePosition;
	double nextSquare = lengthSquare / 7;
	
	double innerSquarePosition = 0.25 * windowSideLength + squareRadius * 2;

	double squareXPosition = innerSquarePosition;
	double squareYPosition = innerSquarePosition;
	
	for(int i = 0; i < 7; i = i + 1) {
	    for(int j = 0; j < 7; j = j + 1){
		Window.drawSquare(squareXPosition, squareYPosition, squareRadius * 2);
		squareXPosition = 1.5 + squareXPosition + nextSquare + 2 * squareRadius;
	    }
	    squareXPosition = innerSquarePosition;
	    squareYPosition = 1.5 +  squareYPosition + nextSquare + 2 * squareRadius;
				  
	}

		
	Window.show();
    }
}
