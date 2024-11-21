import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class Aufgabe3Test{
    
    Aufgabe3 testing = new Aufgabe3();

    int[] input = new int[]{12,3,15,18,22};
    int[] expectedResult = new int[]{3,3,22,22,22};
    
    @Test
    void testArray(){
	Assertions.assertAll("Testing", new Executable[]{() -> {
		    Assert.assertArrayEquals(expectedResult, testing.replaceValues(input));
		}});
    }
}
