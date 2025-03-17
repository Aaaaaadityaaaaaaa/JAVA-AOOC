import java.util.Scanner;
class Factorial{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter a number");
int n=scanner.nextInt();
int ans=1;
for(int i=n;i>=1;i--){
ans=ans*i;
}
System.out.println("factorial is" + ans);
}
}