
import java.util.Arrays;
import java.util.Scanner;

public class MergerSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the first array: ");
        int a1 = scanner.nextInt();
        
        System.out.print("Enter the length of the second array: ");
        int a2 = scanner.nextInt();
        
        int[] array1 = new int[a1];
        int[] array2 = new int[a2];
        
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < a1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < a2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        int c1 = a1 + a2;
        int[] c = new int[c1];
        
        for (int i = 0; i < a1; i++) {
            c[i] = array1[i];
        }
        
        for (int i = 0; i < a2; i++) {
            c[a1 + i] = array2[i];
        }
        
        System.out.println(Arrays.toString(c));
        
         for (int i = 0; i < c1 - 1; i++) {
            for (int j = 0; j < c1 - 1 - i; j++) {
                if (array1[j] > array2[j + 1]) {
                    
                    int temp = array1[j];
                    array1[j] = array2[j + 1];
                    array2[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        
    }
}

