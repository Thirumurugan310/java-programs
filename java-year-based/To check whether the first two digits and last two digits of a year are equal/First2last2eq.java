import java.util.Scanner;
public class First2last2eq
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a%100==a/100) {
	        System.out.println("Yes");
	    }else {
	        System.out.println("No");
	    }
	}
}
