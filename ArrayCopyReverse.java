// Write a program to copy the contents of one array into another in reverse order.

public class ArrayCopyReverse {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        int j = arr1.length - 1;
        
        // Copying the contents of arr1 into arr2 in reverse order
        for (int i = 0; i < arr1.length; i++) {
            arr2[j] = arr1[i];
            j--;
        }
        
        // Printing the contents of arr2
        System.out.print("Contents of arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
