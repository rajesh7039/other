import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number : ");
      int Number=sc.nextInt();

      
        int a=0, b=1;
        System.out.print(a+" "+b);
        Number=Number-2;
        while(Number > 0) {
            System.out.print(" "+(a+b)); // 1 2 3 5 8 13
            b=a+b;//b= 1 2 3 5 8 13
            a=b-a;//a= 1 1 2 3 5 8
            Number--;
        }


    }
  }