import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = -1,b = 0;
	    int[] arr = new int[n];
	    for(int i = 0;i < n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i = 0;i < n;i++){
	        int rep = arr[i];
	        int count = 1;
	        for(int j = i+1;j < n;j++){
	            if(rep==arr[j]){
	                count++;
	            }
	        }
	                if(count>n/2){
	                    a = i;
	                    break;
	                }
	    }
	    if(a!=-1)System.out.print(arr[a]);
	    else System.out.print("no elements");
	}
}
