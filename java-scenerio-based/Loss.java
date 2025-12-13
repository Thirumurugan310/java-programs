import java.util.*;
public class Loss
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double selling = sc.nextDouble();
	    double loss = sc.nextDouble();
	    loss = selling*(loss/100.0);
	    System.out.println(selling+loss);
	}
}
