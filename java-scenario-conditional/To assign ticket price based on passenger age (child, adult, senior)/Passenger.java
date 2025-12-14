import java.util.*;
public class Passenger
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    a = a.toLowerCase();
	    if(a<18) {
	        System.out.println("Child"");
	    }else if(a>=18 && a<51) {
	        System.out.println("adult");
	    }else if(a>50) {
	        System.out.println("Senior");
	    }
	}
}