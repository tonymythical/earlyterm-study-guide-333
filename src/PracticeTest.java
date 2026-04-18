import static org.junit.jupiter.api.Assertions.*;

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
    void testLongestWordStartingWith() {
        // Arrange
        HashSet<String> set = new HashSet<>(Arrays.asList("apple", "apricot", "banana", "azure"));
        // Act
        String actual = Practice.longestWordStartingWith(set, 'A');
        // Assert
        assertEquals("apricot", actual);
    }
    
    @Test
    void testOddEvenDifference() {
        // Arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        // Act
        int actual = Practice.oddEvenDifference(map);
        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testSecondLargestNumber() {
        // Arrange
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "A");
        map.put(5, "B");
        map.put(20, "C");
        map.put(15, "D");
        // Act
        int actual = Practice.secondLargestNumber(map);
        // Assert
        assertEquals(15, actual);
    }
}


