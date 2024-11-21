import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ArrayReformatterTest {
    private final Aufgabe6 testing = new Aufgabe6();

    @Test
    void testReformattedArray() {
        Assertions.assertAll("Testing Array Reformatting", new Executable[]{
            // Test case 1
            () -> {
                int[][] input1 = {
                    {1, 1, 1, 0, 2, 1},
                    {1, 0, 2, 1},
                    {1, 0, 1, 1, 1, 0, 2, 1},
                    {3, 0, 1, 1, 1, 0},
                    {1, 1, 1, 0},
                    {5, 1}
                };
                int[][] expected1 = {
                    {1, 0, 1, 1},
                    {0, 1, 1},
                    {0, 1, 0, 1, 1},
                    {0, 0, 0, 1, 0},
                    {1, 0},
                    {1, 1, 1, 1, 1}
                };
                Assertions.assertArrayEquals(expected1, testing.generateReformattedArray(input1));
            },
            
            // Test case 2
            () -> {
                int[][] input2 = {
                    {1, 1, 1, 0, 2, 1, 4, 0},
                    {1, 0, 5, 1, 2, 0},
                    {6, 0, 2, 1},
                    {1, 1, 7, 0},
                    {4, 0, 2, 1, 1, 0, 1, 1},
                    {8, 0},
                    {7, 0, 1, 1}
                };
                int[][] expected2 = {
                    {1, 0, 1, 1, 0, 0, 0, 0},
                    {0, 1, 1, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 1, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1}
                };
                Assertions.assertArrayEquals(expected2, testing.generateReformattedArray(input2));
            },
            
            // Test case 3
            () -> {
                int[][] input3 = {
                    {1, 0},
                    {1, 1},
                    {2, 0},
                    {1, 0, 1, 1},
                    {1, 1, 1, 0},
                    {2, 1}
                };
                int[][] expected3 = {
                    {0},
                    {1},
                    {0, 0},
                    {0, 1},
                    {1, 0},
                    {1, 1}
                };
                Assertions.assertArrayEquals(expected3, testing.generateReformattedArray(input3));
            },
            
            // Test case 4
            () -> {
                int[][] input4 = {{12, 0}};
                int[][] expected4 = {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
                };
                Assertions.assertArrayEquals(expected4, testing.generateReformattedArray(input4));
            }
        });
    }

    @Test
    void testEdgeCases() {
        Assertions.assertAll("Testing Edge Cases", new Executable[]{
            // Test single pair
            () -> {
                int[][] input = {{1, 1}};
                int[][] expected = {{1}};
                Assertions.assertArrayEquals(expected, testing.generateReformattedArray(input));
            },
            
            // Test large count
            () -> {
                int[][] input = {{100, 0}};
                int[][] expected = {new int[100]};  // Array of 100 zeros
                Assertions.assertArrayEquals(expected, testing.generateReformattedArray(input));
            },
            
            // Test multiple rows with single pairs
            () -> {
                int[][] input = {
                    {1, 0},
                    {1, 1},
                    {1, 0}
                };
                int[][] expected = {
                    {0},
                    {1},
                    {0}
                };
                Assertions.assertArrayEquals(expected, testing.generateReformattedArray(input));
            }
        });
    }
}
