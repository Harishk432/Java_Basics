package Interview_Programs;

public class MissingNumbers {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 5}; // Missing number is 4
	        int n = arr.length + 1;
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        
	        for (int num : arr) {
	            actualSum += num;
	        }
	        
	        System.out.println("Missing number is: " + (expectedSum - actualSum));
	    }
	}



