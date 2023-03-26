// Write a program to display the absent digits from a given number

import java.util.Scanner;

public class AbsentDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean[] present = new boolean[10];
        while (num > 0) {
            present[num % 10] = true;
            num /= 10;
        }

        System.out.print("Absent digits: ");
        for (int i = 0; i < 10; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
