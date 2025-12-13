import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(Character.isUpperCase(ch))
		    System.out.println("Upper");
		else if(Character.isLowerCase(ch))
		    System.out.println("Lower");
		else if(Character.isDigit(ch))
	        System.out.println("Digit");
	    else
	       System.out.println("Symbol");
	}
}
