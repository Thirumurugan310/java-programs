import java.util.Scanner;
public class Did3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n%=10;
	    if(n%3==0) {
			System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
