import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 1;i <= n ;i++){
	        int k = i;
	        int sum = 0;
	        while(k!=0){
	            int temp = k%10;
	            int mul = 1;
	            for(int j = 2;j <= temp;j++){
	                mul*=j;
	            }sum+=mul;
	            k/=10;
	       }if(sum==i)System.out.print(i+" ");
	    }
	}
}
