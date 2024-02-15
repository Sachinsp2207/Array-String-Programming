package string;
import java.util.HashMap;
import java.util.Map;

public class Count_Char {
    public static void main(String[] args) {
        String inputString = "Sachin pawar S";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterating through each character in the string
        for (char c : inputString.toCharArray()) {
            // Increment the count if the character is already present in the map
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            }
            // Add the character to the map if it's not already present
            else {
                charCountMap.put(c, 1);
            }
        }

        // Displaying the character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
