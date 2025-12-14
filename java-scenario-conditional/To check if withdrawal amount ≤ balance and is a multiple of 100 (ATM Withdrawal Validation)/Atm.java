import java.util.*;
public class Atm
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x = 100000;
	    int a = sc.nextInt();
	    if(a<=x && a%100==0) {
	        System.out.println("Allowed for Withdrawal");
	    }else {
	        System.out.println("Not Allowed for Withdrawal");
	    }
	}
}