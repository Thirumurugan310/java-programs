import java.util.Scanner;
public class Interest
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double am = sc.nextDouble();
	    double inter = sc.nextDouble();
	    double yr = sc.nextDouble();
	    double inte = (am*(inter/100.0))*yr;
		System.out.println(am+inte);
	}
}