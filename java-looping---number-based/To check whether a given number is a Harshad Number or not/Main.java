import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int nn = n;
	    while(nn!=0){
	        int temp = nn%10;
	        sum+=temp;
	        nn/=10;
	    }
	    if(n%sum==0)System.out.println("Harshad number");
	    else System.out.println("Not");
	}
}
