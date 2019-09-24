import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        String string,reverse="";
        int length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string To Check Palindrome:");
        string=sc.nextLine();
     
        length=string.length();
     
        for(int i=length-1;i>=0;i--){
            reverse=reverse+string.charAt(i);
        }
     
        if(string.equals(reverse))
            System.out.println(string+" is a palindrome string.");
        else
            System.out.println(string+" is not a palindrome string.");
        
    }
   
}