import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String args[]) {
        
        int[] arr = {1, 2, 2, 4, 3, 5, 7, 6, 9, 3};
        
       
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    
        System.out.println(Arrays.toString(arr));
    }
}

