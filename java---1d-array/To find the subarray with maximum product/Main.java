import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = 0,mul = 1;
	    int[] arr = new int[n];
	    for(int i = 0;i < n;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i = 0;i < n;i++){
	        mul = 1;
	        for(int j = i;j < n;j++){
	            mul*=arr[j];
	            if(mul>a){
	                a = mul;
	            }
	        }
	    }System.out.print(a);
	}
}
