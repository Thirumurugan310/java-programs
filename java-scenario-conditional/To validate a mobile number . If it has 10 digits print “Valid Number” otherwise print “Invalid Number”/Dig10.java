import java.util.*;
public class Dig10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(); 
	    if(a>999999999 && a<=999999999) {
	        System.out.println("Valid Number");
	    }else {
	        System.out.println("Non Valid Number");
	    }
	}
}