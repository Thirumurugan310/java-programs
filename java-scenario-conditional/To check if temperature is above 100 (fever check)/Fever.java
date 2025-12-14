import java.util.*;
public class Fever
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a>100) {
	        System.out.println("Fever");
	    }else {
	        System.out.println("Not fever");
	    }
	}
}