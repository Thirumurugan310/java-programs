import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i <n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int index = 0; 
	    for(int i = 0;i < n;i++){           // -1 6 -2 5 -5
	        if(0>arr[i]){
	            int temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
	            index++;
	        }
	    }
	    for(int i = 0;i <n;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}