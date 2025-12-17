import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 7 ;i <= n;i++){
	        int k = i;
	        int temp = k%10;
	        if(temp==7 || k%7==0)System.out.print(i+" ");
	    }
	}
}
