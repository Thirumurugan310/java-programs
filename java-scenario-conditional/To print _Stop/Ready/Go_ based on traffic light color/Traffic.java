import java.util.*;
public class Traffic
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    a = a.toLowerCase();
	    if(a.equals("red")) {
	        System.out.println("Stop");
	    }else if(a.equals("yellow")) {
	        System.out.println("Wait");
	    }else if(a.equals("green")) {
	        System.out.println("Go");
	    }else {
	        System.out.println("Invalid Signal");
	    }
	}
}