//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class Aufgabe1Test {
//    private final Aufgabe1 testing = new Aufgabe1();
//
//    @Test
//    void testShiftLinesWithDifferentLengths() {
//        Assertions.assertAll("Testing arrays with different line lengths",
//            () -> {
//                int[][] input1 = {
//                    {1, 5, 6, 7},
//                    {1, 9, 6},
//                    {4, 3},
//                    {6, 3, 0, 6, 9},
//                    {6, 4, 3}
//                };
//                int[][] expected1 = {
//                    {4, 3},
//                    {1, 9, 6},
//                    {1, 5, 6, 7},
//                    {6, 3, 0, 6, 9},
//                    {6, 4, 3}
//                };
//                testing.shiftLines(input1);
//                Assertions.assertArrayEquals(expected1, input1);
//            },
//            () -> {
//                int[][] input2 = {
//                    {3, 2, 4, 1},
//                    {7, 3, 6},
//                    {4},
//                    {5, 6, 2, 4},
//                    {9, 1},
//                    {3}
//                };
//                int[][] expected2 = {
//                    {4},
//                    {7, 3, 6},
//                    {3, 2, 4, 1},
//                    {5, 6, 2, 4},
//                    {9, 1},
//                    {3}
//                };
//                testing.shiftLines(input2);
//                Assertions.assertArrayEquals(expected2, input2);
//            }
//        );
//    }
//
//    @Test
//    void testShiftLinesWithEqualLengths() {
//        int[][] input = {
//            {3, 4, 1},
//            {6, 2, 5},
//            {9, 7, 8}
//        };
//        int[][] expected = {
//            {6, 2, 5},
//            {9, 7, 8},
//            {3, 4, 1}
//        };
//        testing.shiftLines(input);
//        Assertions.assertArrayEquals(expected, input);
//    }
//
//    @Test
//    void testShiftLinesWithMultipleShortestLines() {
//        int[][] input = {
//            {1, 2, 3},
//            {4},
//            {5, 6},
//            {7},
//            {8, 9}
//        };
//        int[][] expected = {
//            {4},
//            {1, 2, 3},
//            {5, 6},
//            {7},
//            {8, 9}
//        };
//        testing.shiftLines(input);
//        Assertions.assertArrayEquals(expected, input);
//    }
//
//    @Test
//    void testShiftLinesEdgeCases() {
//        Assertions.assertAll("Testing edge cases",
//            () -> {
//                // Single element array
//                int[][] input1 = {{1}};
//                int[][] expected1 = {{1}};
//                testing.shiftLines(input1);
//                Assertions.assertArrayEquals(expected1, input1);
//            },
//            () -> {
//                // Two rows of same length
//                int[][] input2 = {
//                    {1, 2},
//                    {3, 4}
//                };
//                int[][] expected2 = {
//                    {3, 4},
//                    {1, 2}
//                };
//                testing.shiftLines(input2);
//                Assertions.assertArrayEquals(expected2, input2);
//            },
//            () -> {
//                // Single column array
//                int[][] input3 = {
//                    {1},
//                    {2},
//                    {3}
//                };
//                int[][] expected3 = {
//                    {2},
//                    {3},
//                    {1}
//                };
//                testing.shiftLines(input3);
//                Assertions.assertArrayEquals(expected3, input3);
//            }
//        );
//    }
//}
//
