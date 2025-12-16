import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int c = (int)Math.sqrt(n);
	    if(c*c==n)System.out.println("Perfect Square");
	    else System.out.println("not");
	    
	}
}
