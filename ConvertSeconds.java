// Write a Java program to convert seconds to hour, minute and seconds

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
        
        // Calculate hours, minutes, and remaining seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        
        // Write the result
        System.out.println("Time is " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
