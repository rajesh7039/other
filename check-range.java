import java.util.*;
/*Given an array of integers . Check if all the numbers between minimum and maximum number in array exist's within the array .

Print 'YES' if numbers exist otherwise print 'NO'(without quotes).

Input:

Integer N denoting size of array

Next line contains N space separated integers denoting elements in array

so, if input array is [1,4,3,6,5,2] then minimum number is 1 and maximum number in array is 6. so, you should check if numbers between 1 and 6 exists in the array or not.
*/
public class Main {  
    public static int Max(int[] number){
		int max = number[0];
		for(int i=1;i<number.length;i++){
			if(number[i] > max){
				max = number[i];
			}
		}
		return max;
	}
	public static int Min(int[] number){
		int min = number[0];
		for(int i=1;i<number.length;i++){
			if(number[i] < min){
				min = number[i];
			}
		}
		return min;
	}
    public static void main(String a[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :: ");
        int size = sc.nextInt();
        
        int arr1[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            arr1[i] = sc.nextInt();
        }
        
        int min=Min(arr1);
        int max=Max(arr1);
        int temp=0;
        System.out.println("Minimum Value :: " + min);
        System.out.println("Maximum Value :: " + max);
        for(int i=min;i<max;i++){
            for(int j=0;j<size;j++){
                if(i==arr1[j]){
                    temp++;
                    break;
                }
                else{
                    continue;
                }
            }
            
        }
        
        if(temp==(max-min))
            System.out.println("All Numbers Between "+min+" and "+max+" is available in list.");
            else
            System.out.println("All Numbers Between "+min+" and "+max+" is not available in list.");
        
    }  
}