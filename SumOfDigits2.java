// Write a Java program than read an integer and calculate the sum of its digits
// and write the number of each digit of the sum in English.

import java.util.Scanner;

public class SumOfDigits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int sum = 0;
        
        // Calculate sum of digits
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        
        // Convert sum to English words
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        
        String english = "";
        if (sum == 0) {
            english = "zero";
        } else if (sum < 10) {
            english = ones[sum];
        } else if (sum < 20) {
            english = teens[sum % 10];
        } else if (sum < 100) {
            english = tens[sum / 10] + " " + ones[sum % 10];
        } else if (sum == 100) {
            english = "one hundred";
        }
        
        // Write the result
        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of each digit of the sum in English: " + english);
    }
}
