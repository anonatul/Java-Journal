// Write a Java program which iterates the integers from 1 to 100. For multiples
// of three print "Fizz" instead of the number and print "Buzz" for the
// multiples of five. When number is divided by both three and five, print "fizz
// buzz".

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
