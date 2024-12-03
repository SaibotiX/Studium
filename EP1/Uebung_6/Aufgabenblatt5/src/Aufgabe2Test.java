import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class Aufgabe2Test {
    private final Aufgabe2 testing = new Aufgabe2();

    private String arrayToString(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int[] row : arr) {
            sb.append("  ").append(Arrays.toString(row)).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    private void assertArrayEqualsWithDetail(int[][] expected, int[][] actual, String message) {
        if (!Arrays.deepEquals(expected, actual)) {
            String errorMessage = message + "\nExpected array:\n" + arrayToString(expected) +
                                "\nActual array:\n" + arrayToString(actual);
            Assertions.fail(errorMessage);
        }
    }

    @Test
    void testReformatArrayBasicCases() {
        // Test case 1
        int[][] input1 = {
            {3, 4, 6, 9},
            {1, 0, 2},
            {3},
            {2},
            {4, 6, 8, 10},
            {1, 3, 5, 7, 9},
            {2, 7, 9, 2, 2}
        };
        int[][] expected1 = {
            {4, 6, 3, 9, 22},
            {0, 2, 1, 3},
            {3, 3},
            {2, 2},
            {4, 6, 8, 10, 28},
            {1, 3, 5, 7, 9, 25},
            {2, 2, 2, 7, 9, 22}
        };
        testing.reformatArray(input1);
        assertArrayEqualsWithDetail(expected1, input1, "Basic test case 1 failed");

        // Test case 2
        int[][] input2 = {
            {0},
            {1},
            {2},
            {3, 4},
            {5, 7, 6},
            {6, 8, 9}
        };
        int[][] expected2 = {
            {0, 0},
            {1, 1},
            {2, 2},
            {4, 3, 7},
            {6, 5, 7, 18},
            {6, 8, 9, 23}
        };
        testing.reformatArray(input2);
        assertArrayEqualsWithDetail(expected2, input2, "Basic test case 2 failed");

        // Test case 3
        int[][] input3 = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 2, 2, 2, 2, 4, 4, 4, 4, 4}
        };
        int[][] expected3 = {
            {0, 2, 4, 6, 8, 1, 3, 5, 7, 9, 45},
            {2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 30}
        };
        testing.reformatArray(input3);
        assertArrayEqualsWithDetail(expected3, input3, "Basic test case 3 failed");
    }

    @Test
    void testReformatArrayEdgeCases() {
        // Single even number
        int[][] input1 = {{2}};
        int[][] expected1 = {{2, 2}};
        testing.reformatArray(input1);
        assertArrayEqualsWithDetail(expected1, input1, "Edge case: single even number failed");

        // Single odd number
        int[][] input2 = {{3}};
        int[][] expected2 = {{3, 3}};
        testing.reformatArray(input2);
        assertArrayEqualsWithDetail(expected2, input2, "Edge case: single odd number failed");

        // All even numbers
        int[][] input3 = {{2, 4, 6, 8}};
        int[][] expected3 = {{2, 4, 6, 8, 20}};
        testing.reformatArray(input3);
        assertArrayEqualsWithDetail(expected3, input3, "Edge case: all even numbers failed");

        // All odd numbers
        int[][] input4 = {{1, 3, 5, 7}};
        int[][] expected4 = {{1, 3, 5, 7, 16}};
        testing.reformatArray(input4);
        assertArrayEqualsWithDetail(expected4, input4, "Edge case: all odd numbers failed");
    }

    @Test
    void testReformatArraySpecialCases() {
        // Zero with mix of odd and even
        int[][] input1 = {{0, 1, 2, 3}};
        int[][] expected1 = {{0, 2, 1, 3, 6}};
        testing.reformatArray(input1);
        assertArrayEqualsWithDetail(expected1, input1, "Special case: zero with mix of odd and even failed");

        // Negative numbers
        int[][] input2 = {{-2, -1, -4, -3}};
        int[][] expected2 = {{-2, -4, -1, -3, -10}};
        testing.reformatArray(input2);
        assertArrayEqualsWithDetail(expected2, input2, "Special case: negative numbers failed");

        // Large numbers
        int[][] input3 = {{1000, 1001, 1002, 1003}};
        int[][] expected3 = {{1000, 1002, 1001, 1003, 4006}};
        testing.reformatArray(input3);
        assertArrayEqualsWithDetail(expected3, input3, "Special case: large numbers failed");
    }
}
