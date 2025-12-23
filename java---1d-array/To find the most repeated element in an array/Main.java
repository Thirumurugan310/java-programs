import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int rep , count = 1,a = 0,b = 0;
	    int[] arr = new int[n];
	    for(int i = 0;i < n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i = 0;i < n;i++){
	        rep = arr[i];
	        count = 1;
	        for(int j = i+1;j < n;j++){
	            if(rep==arr[j]){
	                count++;
	                if(count>a){
	                    a = count;
	                    b = i;
	                }
	            }
	        }
	    }System.out.print(arr[b]);
	}
}
