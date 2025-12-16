import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int m = n;
	    int nn = n*n;
	    while(n!=0){
	       sum++;
	       n/=10;
	    }int mod = (int)Math.pow(10,sum);
	    if(nn%mod==m)System.out.println("Automorphic number");
	    else System.out.println("Not");
	}
}
