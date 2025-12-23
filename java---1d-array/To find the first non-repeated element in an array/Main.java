import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0;i < n ;i++){
		    boolean flag = true;
		   for(int j = 0;j < n;j++){
		    if(arr[i]==arr[j] && i!=j){
		        flag = false;
		    }
		   }if(flag==true){
		        System.out.println(arr[i]);
		        return;
		      }
	    }	
	}
}
