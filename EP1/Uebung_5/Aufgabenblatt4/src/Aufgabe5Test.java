import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Aufgabe5Test {
    private final Aufgabe5 testing = new Aufgabe5();

    @Test
    void testExtendedArray() {
        Assertions.assertAll("Testing Extended Array Generation", new Executable[]{
            // Test case 1: {1, 2, 10}
            () -> {
                int[] input1 = {1, 2, 10};
                int[][] expected1 = {
                    {10},
                    {11, 12}
                };
                Assertions.assertArrayEquals(expected1, testing.generateExtendedArray(input1));
            },
            
            // Test case 2: {3, 6, 8}
            () -> {
                int[] input2 = {3, 6, 8};
                int[][] expected2 = {
                    {8, 9, 10},
                    {11, 12, 13, 14},
                    {15, 16, 17, 18, 19},
                    {20, 21, 22, 23, 24, 25}
                };
                Assertions.assertArrayEquals(expected2, testing.generateExtendedArray(input2));
            },
            
            // Test case 3: {6, 8, 4}
            () -> {
                int[] input3 = {6, 8, 4};
                int[][] expected3 = {
                    {4, 5, 6, 7, 8, 9},
                    {10, 11, 12, 13, 14, 15, 16},
                    {17, 18, 19, 20, 21, 22, 23, 24}
                };
                Assertions.assertArrayEquals(expected3, testing.generateExtendedArray(input3));
            }
        });
    }

    @Test
    void testEdgeCases() {
        Assertions.assertAll("Testing Edge Cases", new Executable[]{
            // Test minimal valid input
            () -> {
                int[] input = {1, 2, 1};
                int[][] expected = {
                    {1},
                    {2, 3}
                };
                Assertions.assertArrayEquals(expected, testing.generateExtendedArray(input));
            },
            
            // Test with negative starting number
            () -> {
                int[] input = {2, 4, -1};
                int[][] expected = {
                    {-1, 0},
                    {1, 2, 3},
                    {4, 5, 6, 7}
                };
                Assertions.assertArrayEquals(expected, testing.generateExtendedArray(input));
            }
        });
    }
}
