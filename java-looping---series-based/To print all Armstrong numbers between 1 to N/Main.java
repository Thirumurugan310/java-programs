import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 0;i <= n ;i++){
	        int count = 0;
	        int sum = 0;
	        int k = i;
	        while(i!=0){
	            count++;
	            i/=10;
	        }
	        i = k;
	        while(i!=0){
	            int temp = i%10;
	            sum+=(int)Math.pow(temp,count);
	            i/=10;
	        }i = k ;
	        if(sum==k)System.out.print(k+" ");
	    }
	}
}
