package Interview_Programs;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
	        // Input string
	        String str = "HARISH";

	        // Call the function to count character occurrences
	        countCharacterOccurrences(str);
	    }

	    // Function to count and print occurrences of each character
	    public static void countCharacterOccurrences(String str) {
	        // Convert the string to uppercase to ensure case insensitivity (optional)
	        str = str.toUpperCase();

	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Loop through each character in the string
	        for (char c : str.toCharArray()) {
	            // If the character is already in the map, increment its count
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // Otherwise, add the character to the map with a count of 1
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print the occurrences of each character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println("Character: " + entry.getKey() + " occurs " + entry.getValue() + " time(s).");
	        }
	    }
	}


