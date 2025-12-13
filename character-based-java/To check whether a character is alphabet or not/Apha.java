import java.util.*;
public class Apha
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
		    System.out.println("Alphabet");
	    else
	       System.out.println("Not");
	}
}
