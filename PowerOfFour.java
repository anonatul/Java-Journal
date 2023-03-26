// Write a Java program to check whether a given integer is a power of 4 or not. Given num = 64, return true. Given num = 6, return false.

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        boolean result = isPowerOfFour(num);
        System.out.println(result); 
        
    
    }
    
    public static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            
            num = num / 4;
        }
        
        return true;
    }
}
