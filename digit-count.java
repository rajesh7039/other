import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //int a[]={11,12,13,14,15};
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :: ");
        int size = sc.nextInt();
        
        
        int a[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            a[i] = sc.nextInt();
        }
        
        
        System.out.print("Enter number you want to check for Repeat : ");
        int no=sc.nextInt();
        
        for(int n=0;n<size;n++)
        {
            int repeat=num(a[n],no);
            total=repeat+total;
        }
        System.out.println(no+" is Repeated "+total+" Times. ");
	}
	static int num(int value, int no){
	    int y,z,count=0;
    	    while(value>=1)
            {
                y=value/10;
                z=value%10;
                value=y;
                if(z==no){
                    count++;
                }
            }
        return count;
	}
}