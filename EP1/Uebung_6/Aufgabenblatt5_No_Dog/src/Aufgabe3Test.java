import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;

class AnimalCompoundTest {
    private final Aufgabe3 testing = new Aufgabe3();

    @Test
    void testGenAnimalCompoundProbabilityBounds() {
        // Test that probability bounds are respected
        boolean[][] result1 = testing.genAnimalCompound(5, 0.0f);
        boolean allFalse = true;
        for (boolean[] row : result1) {
            for (boolean cell : row) {
                if (cell) {
                    allFalse = false;
                    break;
                }
            }
        }
        Assertions.assertTrue(allFalse, "With 0.0 probability, no animals should be present");

        // Test size requirements
        Assertions.assertEquals(5, result1.length, "Compound should have specified size");
        for (boolean[] row : result1) {
            Assertions.assertEquals(5, row.length, "Each row should have specified size");
        }
    }

    @RepeatedTest(10)
    void testGenAnimalCompoundDistribution() {
        int size = 10;
        float probability = 0.5f;
        boolean[][] result = testing.genAnimalCompound(size, probability);
        
        // Count actual animals
        int totalCells = size * size;
        int animalCount = 0;
        for (boolean[] row : result) {
            for (boolean cell : row) {
                if (cell) animalCount++;
            }
        }
        
        // Check if distribution is roughly within expected range (±30% of expected)
        float expectedAnimals = totalCells * probability;
        float lowerBound = expectedAnimals * 0.7f;
        float upperBound = expectedAnimals * 1.3f;
        
        Assertions.assertTrue(animalCount >= lowerBound && animalCount <= upperBound,
            "Animal count should be roughly within expected probability range");
    }

    @Test
    void testCalcAnimalDensityBasicCases() {
        // Test case 1 from examples
        boolean[][] input1 = {
            {false, false, false},
            {true, false, false},
            {false, false, false}
        };
        int[][] expected1 = {
            {1, 1, 0},
            {1, 1, 0},
            {1, 1, 0}
        };
        
        int[][] result1 = testing.calcAnimalDensity(input1);
        Assertions.assertArrayEquals(expected1, result1, "Basic density calculation failed for case 1");

        // Test case 2 from examples
        boolean[][] input2 = {
            {false, true, false},
            {false, true, false},
            {false, false, false}
        };
        int[][] expected2 = {
            {2, 2, 2},
            {2, 2, 2},
            {1, 1, 1}
        };
        
        int[][] result2 = testing.calcAnimalDensity(input2);
        Assertions.assertArrayEquals(expected2, result2, "Basic density calculation failed for case 2");

        // Test case 3 from examples
        boolean[][] input3 = {
            {false, true, false},
            {true, true, false},
            {false, false, true}
        };
        int[][] expected3 = {
            {3, 3, 2},
            {3, 4, 3},
            {2, 3, 2}
        };
        
        int[][] result3 = testing.calcAnimalDensity(input3);
        Assertions.assertArrayEquals(expected3, result3, "Basic density calculation failed for case 3");
    }

    @Test
    void testCalcAnimalDensityLargerExample() {
        boolean[][] input = {
            {false, true, true, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, true, false, false, false, false, false, false},
            {false, true, false, false, false, true, false, false},
            {false, false, true, false, true, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, true, false}
        };
        
        int[][] expected = {
            {1, 2, 2, 1, 0, 0, 0, 0},
            {1, 2, 2, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0, 0},
            {2, 2, 2, 0, 1, 1, 1, 0},
            {2, 3, 3, 2, 2, 2, 1, 0},
            {1, 2, 2, 2, 2, 3, 3, 2},
            {0, 1, 1, 2, 1, 3, 3, 3},
            {0, 0, 0, 0, 0, 2, 3, 3}
        };
        
        int[][] result = testing.calcAnimalDensity(input);
        Assertions.assertArrayEquals(expected, result, "Larger example density calculation failed");
    }

    @Test
    void testCalcAnimalDensityEdgeCases() {
        // Test 1x1 compound
        boolean[][] input1 = {{true}};
        int[][] expected1 = {{1}};
        int[][] result1 = testing.calcAnimalDensity(input1);
        Assertions.assertArrayEquals(expected1, result1, "1x1 compound density calculation failed");

        // Test 2x2 compound with all animals
        boolean[][] input2 = {
            {true, true},
            {true, true}
        };
        int[][] expected2 = {
            {4, 4},
            {4, 4}
        };
        int[][] result2 = testing.calcAnimalDensity(input2);
        Assertions.assertArrayEquals(expected2, result2, "2x2 all animals density calculation failed");

        // Test 2x2 compound with no animals
        boolean[][] input3 = {
            {false, false},
            {false, false}
        };
        int[][] expected3 = {
            {0, 0},
            {0, 0}
        };
        int[][] result3 = testing.calcAnimalDensity(input3);
        Assertions.assertArrayEquals(expected3, result3, "2x2 no animals density calculation failed");
    }
}
