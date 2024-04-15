import java.util.Scanner;
import java.util.HashMap;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();  // Read the number of integers to be entered.
        
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();  // Read each integer and store in the array.
        }
        
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : arr) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);  // Increment count if already in map.
            } else {
                frequency.put(number, 1);  // Initialize count if not already in map.
            }
        }
        
        int mode = arr[0]; // Initialize mode to the first number.
        int maxCount = frequency.get(mode);  // Initialize maxCount to the frequency of the first number.
        
        for (int key : frequency.keySet()) {
            if (frequency.get(key) > maxCount) {  // Find the number with the highest count.
                maxCount = frequency.get(key);
                mode = key;
            }
        }
        
        System.out.println(mode);  // Output the mode.
        
        in.close();  // Close the scanner.
    }
}
