import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] nums = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(nums);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    @Test
    void testCountWordsInRange() {
        // Arrange
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "apple", "hi", "dog", "elephant"));
        // Act
        int actual = Practice.countWordsInRange(null, 2, 5);
        // Assert
        assertEquals(2, actual);

    }

    @Test
    void longestWordStartingWith() {
        // Arrange
        HashSet<String> set = new HashSet<>(Arrays.asList("Apple", "azure"));
        // Act
        String actual = Practice.longestWordStartingWith(set, 'A');
        // Assert
    }
    
}


