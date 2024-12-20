/*
  Aufgabe 1) Zweidimensionale Arrays und Rekursion - Game "TicTacToe"
*/

import codedraw.*;

public class Aufgabe1 {
    public static void main(String[] args) {

        int size = 600;
        CodeDraw myDrawObj = new CodeDraw(size, size);
        myDrawObj.setTitle("Tic Tac Toe");
        EventScanner myEventSC = myDrawObj.getEventScanner();

        char[][] gameBoard = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean twoPlayer = true;
        boolean player = true;
        int maxDepth = 8;
        boolean gameRunning = true;

        drawGameBoard(myDrawObj, gameBoard);

        int width = myDrawObj.getWidth();
        int height = myDrawObj.getHeight();

        int wBlock = width / 3;
        int hBlock = height / 3;

        char currChar = 'X';
        while (!myDrawObj.isClosed() && gameRunning) {
            if (myEventSC.hasMouseClickEvent()) {
                if (twoPlayer) {
                    if (player) {
                        currChar = 'X';
                    } else {
                        currChar = 'O';
                    }
                }

                MouseClickEvent currentClick = myEventSC.nextMouseClickEvent();
                int y = currentClick.getY();
                int x = currentClick.getX();

                int drawInGameBoardY = 0;
                int drawInGameBoardX = 0;

                boolean onceY = true;
                boolean onceX = true;
                for (int i = 0; i < gameBoard.length; i = i + 1) {
                    if (y <= hBlock + hBlock * i && onceY) {
                        drawInGameBoardY = i;
                        onceY = false;
                    }

                    if (x <= wBlock + wBlock * i && onceX) {
                        drawInGameBoardX = i;
                        onceX = false;
                    }
                }

                if (gameBoard[drawInGameBoardY][drawInGameBoardX] != ' ') {
                    continue;
                }
                gameBoard[drawInGameBoardY][drawInGameBoardX] = currChar;
                drawGameBoard(myDrawObj, gameBoard);

                if (checkIfFull(gameBoard) || checkIfWinner(gameBoard, player)) {
                    if(checkIfWinner(gameBoard, player)) {
                        System.out.println("Player " + currChar + " won!!");
                    }
                    else {
                        System.out.println("Draw");
                    }
                    gameRunning = false;
                    continue;
                }

                if (twoPlayer) {
                    player = !player;
                }

                if (!twoPlayer) {
                    int[] result;
                    result = minimax(gameBoard, !player, maxDepth);

                    gameBoard[result[0]][result[1]] = 'O';
                    drawGameBoard(myDrawObj, gameBoard);

                    if (checkIfFull(gameBoard) || checkIfWinner(gameBoard, !player)) {
                        if(checkIfWinner(gameBoard, !player)) {
                            System.out.println("The computer won!!");
                        }
                        else {
                            System.out.println("Draw");
                        }
                        gameRunning = false;
                    }
                }
            } else {
                myEventSC.nextEvent();
            }
        }
    }

    public static int[] minimax(char[][] gameBoard, boolean player, int depth) {
        int[] retArray = new int[3];

        if (player) {
            retArray[2] = Integer.MAX_VALUE;
        } else {
            retArray[2] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < gameBoard.length; i = i + 1) {
            for (int j = 0; j < gameBoard[i].length; j = j + 1) {
                if (gameBoard[i][j] == ' ') {
                    if (player) {
                        gameBoard[i][j] = 'X';
                    } else {
                        gameBoard[i][j] = 'O';
                    }

                    if (checkIfWinner(gameBoard, true)) {
                        retArray[0] = i;
                        retArray[1] = j;
                        retArray[2] = -1;
                    } else if (checkIfWinner(gameBoard, false)) {
                        retArray[0] = i;
                        retArray[1] = j;
                        retArray[2] = 1;
                    } else if (checkIfFull(gameBoard) || depth - 1 == 0) {
                        retArray[0] = i;
                        retArray[1] = j;
                        retArray[2] = 0;
                    } else {
                        int[] tempArray = minimax(gameBoard, !player, depth - 1);

                        if (player) {
                            if (tempArray[2] < retArray[2]) {
                                retArray[0] = i;
                                retArray[1] = j;
                                retArray[2] = tempArray[2];
                            }
                        }
                        if (!player) {
                            if (tempArray[2] > retArray[2]) {
                                retArray[0] = i;
                                retArray[1] = j;
                                retArray[2] = tempArray[2];
                            }
                        }
                    }

                    gameBoard[i][j] = ' ';

                }
            }
        }

        return retArray;
    }

    public static boolean checkIfFull(char[][] gameBoard) {
        int count = 0;
        boolean result = false;
        for (int i = 0; i < gameBoard.length; i = i + 1) {
            for (int j = 0; j < gameBoard[i].length; j = j + 1) {
                if (gameBoard[i][j] == 'O' || gameBoard[i][j] == 'X') {
                    count = count + 1;
                }
            }
        }

        if (count == gameBoard.length * 3) {
            result = true;
        }

        return result;
    }


    public static boolean checkIfWinner(char[][] gameBoard, boolean player) {
        boolean result = false;
        char checkChar;

        if (player) {
            checkChar = 'X';
        } else {
            checkChar = 'O';
        }

        //LINE, COLUMN, DIAGONALE 1, Diagonale 2
        int countL = 0, countC = 0, countD1 = 0, countD2 = 0;

        for (int i = 0; i < gameBoard.length && !result; i = i + 1) {
            for (int j = 0; j < gameBoard[i].length && !result; j = j + 1) {
                if (gameBoard[i][j] == checkChar) {
                    countL = countL + 1;
                }

                if (gameBoard[j][i] == checkChar) {
                    countC = countC + 1;
                }

                if (gameBoard[j][j] == checkChar) {
                    countD1 = countD1 + 1;
                }

                //Damit ich nur beim ersten durchlauf auf die Diagonale 2 schaue
                //Ansonsten out of bound kann sein
                if (i == 0) {
                    if (gameBoard[2 - j][i + j] == checkChar) {
                        countD2 = countD2 + 1;
                    }
                }
            }

            if (countL == 3 || countC == 3 || countD1 == 3 || countD2 == 3) {
                result = true;
            }

            countL = 0;
            countC = 0;
            countD1 = 0;
            countD2 = 0;
        }

        return result;
    }

    public static void drawGameBoard(CodeDraw myDrawObj, char[][] gameBoard) {
        int width = myDrawObj.getWidth();
        int height = myDrawObj.getHeight();

        int wBlock = width / 3;
        int hBlock = height / 3;

        for (int i = 0; i < 3; i = i + 1) {
            myDrawObj.drawLine(wBlock + wBlock * i, 0, wBlock + wBlock * i, height);
            myDrawObj.drawLine(0, hBlock + hBlock * i, width, hBlock + hBlock * i);
        }

        for (int i = 0; i < gameBoard.length; i = i + 1) {
            for (int j = 0; j < gameBoard[i].length; j = j + 1) {
                if (gameBoard[i][j] == 'O') {
                    myDrawObj.drawCircle((wBlock / 2) + wBlock * j, (hBlock / 2) + hBlock * i, 100);
                } else if (gameBoard[i][j] == 'X') {
                    myDrawObj.drawLine(wBlock * j, hBlock * i, wBlock * (j + 1), hBlock * (i + 1));
                    myDrawObj.drawLine(wBlock * (j + 1), hBlock * i, wBlock * (j), hBlock * (i + 1));
                }
            }
        }

        myDrawObj.show();
    }

}
