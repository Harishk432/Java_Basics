package Interview_Programs;

import java.util.HashSet;

public class DuplicateInArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("Duplicate found: " + num);
                break;
            }
        }
    }

}
