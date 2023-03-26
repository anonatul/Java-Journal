// Write a program to convert decimal number to its binary, octal and hexadecimal equivalents



import java.util.Scanner;

public class DecimalToBinaryOctalHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        
        String binary = decimalToBase(decimal, 2);
        String octal = decimalToBase(decimal, 8);
        String hex = decimalToBase(decimal, 16);
        
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }

    public static String decimalToBase(int decimal, int base) {
        String digits = "0123456789ABCDEF";
        String result = "";
        while (decimal > 0) {
            int digit = decimal % base;
            result = digits.charAt(digit) + result;
            decimal /= base;
        }
        return result;
    }
}

/* 
        import java.util.Scanner;
        
        public class DecimalToBinaryOctalHex {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a decimal number: ");
                int decimal = sc.nextInt();
        
                String binary = Integer.toBinaryString(decimal);
                String octal = Integer.toOctalString(decimal);
                String hex = Integer.toHexString(decimal);
        
                System.out.println("Binary: " + binary);
                System.out.println("Octal: " + octal);
                System.out.println("Hexadecimal: " + hex);
            }
        }

        */