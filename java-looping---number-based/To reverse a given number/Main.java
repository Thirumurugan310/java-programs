import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nn = 0;
	    while(n!=0){
	       int rev = n%10;
	       nn = nn*10 +rev;
	       n/=10;
	    }
	    System.out.println(nn);
	}
}
