import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int nn = n*n;
	    while(nn!=0){
	        int temp = nn%10;
	        sum+=temp;
	        nn/=10;
	    }
	    if(sum==n)System.out.println("Neon number");
	    else System.out.println("Not");
	}
}
