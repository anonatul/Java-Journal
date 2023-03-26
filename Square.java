// Write a Java program to find a Square of given number belonging to the three data types, namely Integers, Floating Point & Double Precision number using Overloading of Fucntions

public class Square {
    public static void main(String[] args) {
        int num1 = 5;
        float num2 = 3.14f;
        double num3 = 7.5;

        System.out.println("Square of " + num1 + " is " + square(num1));
        System.out.println("Square of " + num2 + " is " + square(num2));
        System.out.println("Square of " + num3 + " is " + square(num3));
    }

    // Function overloading for finding square of integer
    public static int square(int num) {
        return num * num;
    }

    // Function overloading for finding square of float
    public static float square(float num) {
        return num * num;
    }

    // Function overloading for finding square of double
    public static double square(double num) {
        return num * num;
    }
}
