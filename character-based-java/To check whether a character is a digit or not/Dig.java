import java.util.*;
public class Dig
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(Character.isDigit(ch))
		    System.out.println("Digit");
	    else
	       System.out.println("Not");
	}
}
