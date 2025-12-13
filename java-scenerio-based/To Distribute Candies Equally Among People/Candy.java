import java.util.Scanner;
public class Candy
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int candy = sc.nextInt();
	    int people = sc.nextInt();
		System.out.println("Share : "+candy/people+"\nRemining : "+candy%people);
	}
}