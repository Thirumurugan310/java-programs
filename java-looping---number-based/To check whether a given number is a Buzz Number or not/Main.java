import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int nn = n%10;
	    if(n%7==0 || nn==7)System.out.println("Buzz number");
	    else System.out.println("Not");
	}
}
