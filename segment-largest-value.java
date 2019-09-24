import java.util.*;

 public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :: ");
        int number = sc.nextInt();
        int val=0;
        while(number>0)
        {
            int temp=number%10;
            number=number/10;
            //System.out.println(temp);
        switch (temp) {
                case 0:
                    val=val+6;
                    break;
                case 1:
                    val=val+2;
                    break;
                case 2:
                    val=val+5;
                    break;
                case 3:
                    val=val+5;
                    break;
                case 4:
                    val=val+4;
                    break;
                case 5:
                    val=val+5;
                    break;
                case 6:
                    val=val+6;
                    break;
                case 7:
                    val=val+3;
                    break;
                case 8:
                    val=val+7;
                    break;
                case 9:
                    val=val+6;
                    break;
        }



            /*if(temp==1){
                val=val+2;
            }else if(temp==2 || temp==3 || temp==5){
                val=val+5;
            }else if(temp==4){
                val=val+4;
            }else if(temp==0 || temp==6 || temp==9){
                val=val+6;
            }else if(temp==7){
                val=val+3;
            }else{
                val=val+7;
            }*/
            
        }
        System.out.print("Largest Number is :: ");
        while(val>1)
        {
            if(val==3){
                System.out.print("7");
                val=val-3;
            }
            else
            {
                System.out.print("1");
                val=val-2;                
	    }
        }
    }//end main
}//end class main