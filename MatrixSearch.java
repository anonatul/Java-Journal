// Write a Java program that searches a value in an m x n matrix

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value to search: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println(target + " is present in the matrix.");
        } else {
            System.out.println(target + " is not present in the matrix.");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
