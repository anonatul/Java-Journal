// Write a java program to display the Fibonacci Series up to the limit

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        while (c < limit) {
            c = a + b;
            if (c <= limit) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }
}
