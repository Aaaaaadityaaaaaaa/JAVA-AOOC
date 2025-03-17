import java.util.Scanner;

public class Prime{
       
       public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number to be checked");
       int n=sc.nextInt();
       double m=Math.sqrt(n);
       boolean g=false;
                 if(n==1||n==0){
                 System.out.println("entered number is neither prime nor composite");
                 return;
                 }
             for(int i=2;i<=m;i++){
                   if(n%i==0){
                   g=true;
                   }
             }
             
          if(g==true){
          System.out.println("entered number is not prime");
          }
          else{
          System.out.println("entered number is prime");
          }
      }
}