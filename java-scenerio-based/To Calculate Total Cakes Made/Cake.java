import java.util.Scanner;
public class Cake
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int egg = sc.nextInt();
	    int needs = sc.nextInt();
		System.out.println("Cake : "+egg/needs+"\nRemining : "+egg%needs);
	}
}