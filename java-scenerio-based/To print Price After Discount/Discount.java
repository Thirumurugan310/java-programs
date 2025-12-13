import java.util.Scanner;
public class Discount
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int min = sc.nextInt();
	    int discount = sc.nextInt();
	    double total = price * (discount / 100.0);
	    total = price - total;
		System.out.println(total);
	}
}
