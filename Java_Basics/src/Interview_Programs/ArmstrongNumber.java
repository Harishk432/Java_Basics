package Interview_Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Store original number
        int original = num;
        int result = 0;

        // Calculate Armstrong number
        while (num != 0) {
            int digit = num % 10;  // Get last digit
            result += digit * digit * digit;  // Cube the digit and add to result
            num /= 10;  // Remove last digit
        }

        // Check if the original number is equal to the result
        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
	}

//It raises each digit to the power of the number of digits and sums them.
//If the sum equals the original number, the number is classified as an Armstrong number.
