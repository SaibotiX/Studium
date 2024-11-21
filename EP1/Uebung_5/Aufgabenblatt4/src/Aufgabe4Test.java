import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Aufgabe4Test {
    private final Aufgabe4 testing = new Aufgabe4();

    @Test
    void testArrayGeneration() {
        Assertions.assertAll("Testing Array Generation", new Executable[]{
            // Test case for n = 1
            () -> {
                int[][] expected1 = {
                    {1}
                };
                Assertions.assertArrayEquals(expected1, testing.generateFilled2DArray(1));
            },
            
            // Test case for n = 3
            () -> {
                int[][] expected3 = {
                    {-1, -1, -1},
                    {-1,  1, -1},
                    {-1, -1, -1}
                };
                Assertions.assertArrayEquals(expected3, testing.generateFilled2DArray(3));
            },
            
            // Test case for n = 5
            () -> {
                int[][] expected5 = {
                    {1, 2, 3, 4, 5},
                    {2, -1, -1, -1, 4},
                    {3, -1, 1, -1, 3},
                    {4, -1, -1, -1, 2},
                    {5, 4, 3, 2, 1}
                };
                Assertions.assertArrayEquals(expected5, testing.generateFilled2DArray(5));
            },
            
            // Test case for n = 7
            () -> {
                int[][] expected7 = {
                    {1, 2, 3, 4, 5, 6, 7},
                    {2, 1, 2, 3, 4, 5, 6},
                    {3, 2, -1, -1, -1, 4, 5},
                    {4, 3, -1, 1, -1, 3, 4},
                    {5, 4, -1, -1, -1, 2, 3},
                    {6, 5, 4, 3, 2, 1, 2},
                    {7, 6, 5, 4, 3, 2, 1}
                };
                Assertions.assertArrayEquals(expected7, testing.generateFilled2DArray(7));
            }
        });
    }
}
