// Write a java program to demonstrate how Function Overloading is carried out for Swapping of two variables of the various data types namely Integers, Floating Point Numbers & Character Type

public class Swap {
    // Method to swap two integers
    public static void swap(int a, int b) {
        int temp = a;
        a = b; 
        b = temp;
        System.out.println("Swapped integers: a = " + a + ", b = " + b);
    }

    // Method to swap two floating point numbers
    public static void swap(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped doubles: a = " + a + ", b = " + b);
    }

    // Method to swap two characters
    public static void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped characters: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Swap two integers
        int x = 5, y = 10;
        swap(x, y);

        // Swap two doubles
        double a = 2.5, b = 4.7;
        swap(a, b);

        // Swap two characters
        char c1 = 'a', c2 = 'b';
        swap(c1, c2);
    }
}
