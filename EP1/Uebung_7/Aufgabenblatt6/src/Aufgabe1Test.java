import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Aufgabe1Test {
    private Aufgabe1 aufgabe1;

    void setUp() {
        aufgabe1 = new Aufgabe1();
    }

    int[] retArray = {1,2,3};

    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    @Test
    void minimax(){
	assertEquals(1 , aufgabe1.minimax(board, false, 4));
    }
}
