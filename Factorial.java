import java.util.*;
public class Main{ 
    public static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }

    // Driver function
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);
   }
}