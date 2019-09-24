import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year To Check Leap Year: ");
        int year=sc.nextInt();

        boolean leapyear=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0)
                    leapyear=true;
                else
                    leapyear=false;
            }
            else
                leapyear=true;
        }
        else
        {
            leapyear=false;
        }
            
        if(leapyear==true){
            System.out.println("This is a leap year :"+ year);
        }
        else{
            System.out.println("This is not a leap year :"+ year);   
        }
        
    }
   
}


//400 400%400=0.    ,  400%100=0,  400%4=0 leap year
//500 500%400=100 ,  500%100=0,  500%4=0 not a leap year 
//600 600%400=200 ,  600%100=0, 600%4=0 not a leap year
//2012 2012%400=12, 2012%100=12, 2012%4=0 leap year
//1800 1800%400=200, 1800%100=0, 1800%4=0 not a leap year
//2000 2000%400=0,  2000%100=0, 2000%4=0 leap year
