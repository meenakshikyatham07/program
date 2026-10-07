import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input String: " + input);
        System.out.println("Duplicate characters are:");
        
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        // Base case check for null or empty string
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null.");
            return;
        }

        // Map to store character and its frequency count
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to character array and iterate
        for (char c : str.toCharArray()) {
            // If character is already present, increment its count by 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the map to print characters with a count > 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : appears " + entry.getValue() + " times");
            }
        }
    }
}
