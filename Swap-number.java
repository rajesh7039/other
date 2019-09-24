import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number One : ");
        int n1=sc.nextInt();
        System.out.print("Enter Number Two : ");
        int n2=sc.nextInt();
        System.out.println("==============");
        //n1=12;
        //n2=38;
        
        n1=n1+n2; //12+38=40;
        n2=n1-n2; //40-38=12;
        n1=n1-n2; //40-12=38;
        
        System.out.println("Number One is : "+n1);
        System.out.println("Number Two is : "+n2);
        
    }
   
}