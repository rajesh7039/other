import java.util.*;
// 2,3,9 in last digit is pretty number in given range.
// enter 1 to 10 ;  output : 3
public class Main{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first digit : ");
        int n1=sc.nextInt();
        System.out.print("Enter second digit : ");
        int n2=sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
            int val=i%10;
            if(val==2 || val==3 || val==9)
            {
                count++;
            }
        }
        System.out.print("Total pretty numbers are in this range is : "+count);
    } 
} 