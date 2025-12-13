import java.util.Scanner;
public class Lastequal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
	    if(n%10 == m%10) {
			System.out.println("Yes");
		}else {
		    System.out.println("No");
		}
	}
}
