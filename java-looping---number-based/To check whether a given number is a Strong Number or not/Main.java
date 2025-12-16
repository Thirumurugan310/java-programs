import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nn = n;
	    int temp =0;
	    while(nn!=0){
	        int last = nn%10;
	        int mul = 1;
	        for(int i=1;i<=last;i++){
	            mul*=i;
	        }
	        temp +=mul;
	        nn/=10;
	    }
	    if(temp==n)System.out.println("Strong number");
	    else System.out.println("Not");
	}
}