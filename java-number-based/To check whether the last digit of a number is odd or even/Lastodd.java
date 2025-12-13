import java.util.Scanner;
public class Lastodd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n%=10;
	    if(n%2==0) {
			System.out.println("Even");
		}else{
		    System.out.println("Odd");
		}
	}
}
