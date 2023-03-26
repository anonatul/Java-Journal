// Write a program to display all numbers between 1 and 100, which are divisible by 7

public class DivisibleBySeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
