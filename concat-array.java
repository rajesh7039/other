import java.util.*;
/// [a,b,c], [1,2,3] → [a,b,c,1,2,3]
public class Main{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        
        //Enter first string
        System.out.print("Enter array size 1 : ");
        int s1=sc.nextInt();
        
        String a[] = new String[s1];
        for(int i=0; i<s1; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            a[i] = sc.next();
        }
        
        
        //Enter second string
        System.out.printf("Enter array size 2 : ");
        int s2=sc.nextInt();
        
        String b[] = new String[s2];
        for(int i=0; i<s2; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            b[i] = sc.next();
        }
        
        
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
      
      
        
    } 
} 