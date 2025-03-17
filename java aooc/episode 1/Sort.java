import java.util.Scanner;
import java.util.Arrays;

public class Sort{
       
       public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int[] arr=new int[10];
       for(int i=0;i<10;i++){
       arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
     
       
       System.out.print(Arrays.toString(arr));
      

       
}
}