import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count =0,rev=n;
	    
	     while(n!=0){
	       count++;
	        n/=10;
	    }
	    int nn=0,mm=0;
	    n=rev;
	    while(n!=0){
	        int temp = n%10;
	        nn+= (int)Math.pow(temp,count);
	        n/=10;
	    }if(rev==nn) System.out.println("Armstrong");
	        else System.out.println("Not");
	    
	}
}
