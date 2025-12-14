import java.util.*;
public class Scitizen
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    if(age>=60) {
	        System.out.println("Eligible for senior citizen benefits");
	    }else {
	        System.out.println("Not Eligible for senior citizen benefits");
	    }
	}
}