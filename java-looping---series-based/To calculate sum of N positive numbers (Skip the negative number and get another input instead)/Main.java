import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = 0;
	    int sum = 0;
	    while(m!=n){
	        int nn = sc.nextInt();
	        if(0<=nn)sum+=nn;
	        m++;
	    }System.out.println(sum);
	}
}
