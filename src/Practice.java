import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    //O(n) time complexity, n is the array length
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return  max - min;
    }

    //count words - arraylist
    //O(n) time complexity, n is the word length
    public static int countWordsInRange(ArrayList<String> list, int n, int m) {
        if (list == null) return 0;
        int count = 0;
        for (String word : list) {
            if (word != null && word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }

    //longest word - hashset
    //O(n) time complexity, n is the number of words
    public static String longestWordStartingWith(HashSet<String> set, char targetChar) {
        if (set == null || set.isEmpty()) return null;
        String longest = "";
        char targetLower = Character.toLowerCase(targetChar);
        for (String word : set) {
            if (word == null || word.isEmpty()) continue;
            if (Character.toLowerCase(word.charAt(0)) == targetLower) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }
        return longest.isEmpty() ? null : longest;
    }

    //find difference - hashmap(values)
    //O(n) time complexity, n is number of values in map
    public static int oddEvenDifference(HashMap<String, Integer> map) {
        if (map == null || map.isEmpty()) return 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int value : map.values()) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        } 
        return Math.abs(oddCount - evenCount);
    }

    //second larget number - hashmap(keys)
    //O(n) time complexity, where n is the keys
    public static Integer secondLargestNumber(HashMap<Integer, String> map) {
        if (map == null || map.size() < 2) {
            throw new IllegalArgumentException("Map must contain two entries");
        }
        Integer largest = null;
        Integer secondLargest = null;
        for (int key : map.keySet()) {
            if (largest == null || key > largest) {
                secondLargest = largest;
                largest = key;
            } else if (key < largest && (secondLargest == null || key > secondLargest)) {
                secondLargest = key;
            }
        }
        return secondLargest;
    }

    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
